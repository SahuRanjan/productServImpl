package dev.ranjan.productservimpl.controllers;


import dev.ranjan.productservimpl.dtos.GenericProductDto;
import dev.ranjan.productservimpl.exceptions.NotFoundException;
import dev.ranjan.productservimpl.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/v1/products/")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }

    @GetMapping
    public List<GenericProductDto> getAllProducts()
    {
        return productService.getProducts();
    }
    @GetMapping("{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id) throws NotFoundException {
        return productService.getProductById(id);
    }
    @DeleteMapping("{id}")
    public  ResponseEntity<GenericProductDto> deleteProductById(@PathVariable("id")Long id)
    {
        return new ResponseEntity<>(
                productService.deleteProductById(id),
                HttpStatus.OK);
    }
    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto) {
        // System.out.println(genericProductDto.getTitle());
        return productService.createProduct(genericProductDto);
    }

    @PutMapping("{id}")
    public ResponseEntity<GenericProductDto> updateProductbyId(@PathVariable("id")Long id, @RequestBody GenericProductDto gpto)
    {
        return new ResponseEntity<>(
                productService.updateProductbyId(gpto, id),
                HttpStatus.OK);
    }
}
