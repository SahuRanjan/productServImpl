package dev.ranjan.productservimpl.services;

import dev.ranjan.productservimpl.dtos.GenericProductDto;
import dev.ranjan.productservimpl.exceptions.NotFoundException;
import dev.ranjan.productservimpl.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    GenericProductDto getProductById(Long id) throws NotFoundException;
    GenericProductDto createProduct(GenericProductDto product);
    List<GenericProductDto> getProducts();
    GenericProductDto deleteProductById(Long id);
    GenericProductDto updateProductbyId(GenericProductDto gpto,Long id);

}
