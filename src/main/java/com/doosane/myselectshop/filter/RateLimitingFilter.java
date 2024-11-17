package com.doosane.myselectshop.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@Component
public class RateLimitingFilter extends OncePerRequestFilter {

    private final Map<String, RateLimit> requestCounts = new ConcurrentHashMap<>();
    private static final long TIME_WINDOW = TimeUnit.MINUTES.toMillis(1); // 1분
    private static final int MAX_REQUESTS = 100; // 1분에 100개의 요청 허용

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String clientIp = request.getRemoteAddr();

        RateLimit rateLimit = requestCounts.computeIfAbsent(clientIp, k -> new RateLimit());
        synchronized (rateLimit) {
            long currentTime = System.currentTimeMillis();

            if (currentTime - rateLimit.getStartTime() > TIME_WINDOW) {
                rateLimit.reset(currentTime);
            }

            if (rateLimit.getCount() < MAX_REQUESTS) {
                rateLimit.increment();
                filterChain.doFilter(request, response);
            } else {
                response.setStatus(429); // 직접 HTTP 상태 코드를 설정
                response.getWriter().write("Too many requests! Please try again later.");
                response.getWriter().flush();
            }
        }
    }

    private static class RateLimit {
        private int count = 0;
        private long startTime = System.currentTimeMillis();

        public int getCount() {
            return count;
        }

        public long getStartTime() {
            return startTime;
        }

        public void increment() {
            count++;
        }

        public void reset(long newStartTime) {
            count = 0;
            startTime = newStartTime;
        }
    }
}
