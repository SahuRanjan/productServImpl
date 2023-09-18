package dev.ranjan.productservimpl.services;

import dev.ranjan.productservimpl.dtos.GenericProductDto;
import dev.ranjan.productservimpl.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService {
    @Override
    public GenericProductDto getProductById(Long id)
    {
        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product)
    {
        return null;
    }

    @Override
    public List<GenericProductDto> getProducts() {
        return null;
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {
        return null;
    }

    @Override
    public GenericProductDto updateProductbyId(GenericProductDto gpto, Long id) {
        return null;
    }
}

