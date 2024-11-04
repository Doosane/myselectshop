package com.doosane.myselectshop.naver.service;

import com.doosane.myselectshop.dto.ProductRequestDto;
import com.doosane.myselectshop.dto.ProductResponseDto;
import com.doosane.myselectshop.entity.Product;
import com.doosane.myselectshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));

        return new ProductResponseDto(product);
    }
}
