package com.doosane.myselectshop.controller;

import com.doosane.myselectshop.dto.ProductMypriceRequestDto;
import com.doosane.myselectshop.dto.ProductRequestDto;
import com.doosane.myselectshop.dto.ProductResponseDto;
import com.doosane.myselectshop.naver.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class ProductController {

    private final ProductService productService;

    @PostMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto) {

        return productService.createProduct(requestDto);
    }

    @PutMapping("/products/{id}")
    public ProductResponseDto updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto) {

        return productService.updateProduct(id, requestDto);
    }

}
