package dev.ranjan.productservimpl.thirdpartyClients.productService;

import dev.ranjan.productservimpl.thirdpartyClients.productService.fakestore.FakeStoreProductDto;
import dev.ranjan.productservimpl.dtos.GenericProductDto;
import dev.ranjan.productservimpl.exceptions.NotFoundException;

import java.util.List;

public interface ThirdPartyProductService {
    FakeStoreProductDto getProductById(Long id) throws NotFoundException;
    FakeStoreProductDto createProduct(GenericProductDto product);
    List<FakeStoreProductDto> getProducts();
    FakeStoreProductDto deleteProductById(Long id);
    FakeStoreProductDto updateProductbyId(GenericProductDto gpto,Long id);

}