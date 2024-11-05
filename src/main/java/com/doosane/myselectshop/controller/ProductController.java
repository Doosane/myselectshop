package com.doosane.myselectshop.controller;

import com.doosane.myselectshop.dto.ProductMypriceRequestDto;
import com.doosane.myselectshop.dto.ProductRequestDto;
import com.doosane.myselectshop.dto.ProductResponseDto;
import com.doosane.myselectshop.security.UserDetailsImpl;
import com.doosane.myselectshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class ProductController {

    private final ProductService productService;

    @PostMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {

        return productService.createProduct(requestDto, userDetails.getUser());
    }

    @PutMapping("/products/{id}")
    public ProductResponseDto updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto) {

        return productService.updateProduct(id, requestDto);
    }

    @GetMapping("/products")
    public List<ProductResponseDto> getProducts(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        return productService.getProducts(userDetails.getUser());
    }

    @GetMapping("/admin/products")
    public List<ProductResponseDto> getAdminProducts() {
        return productService.getAllProducts();
    }

}
