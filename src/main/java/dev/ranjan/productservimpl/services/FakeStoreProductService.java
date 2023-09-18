package dev.ranjan.productservimpl.services;


import dev.ranjan.productservimpl.thirdpartyClients.productService.fakestore.FakeStoreProductDto;
import dev.ranjan.productservimpl.dtos.GenericProductDto;
import dev.ranjan.productservimpl.exceptions.NotFoundException;
import dev.ranjan.productservimpl.thirdpartyClients.productService.fakestore.FakeStoreProductServiceClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Primary
@Repository("FakeStoreProductService")
public class FakeStoreProductService implements ProductService{
    private FakeStoreProductServiceClient fakeStoreProductServiceClient;

    private GenericProductDto convertFakeStoreProductIntoGenericProduct(FakeStoreProductDto fakeStoreProductDto) {

        GenericProductDto product = new GenericProductDto();
        product.setId(fakeStoreProductDto.getId());
        product.setImage(fakeStoreProductDto.getImage());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setCategory(fakeStoreProductDto.getCategory());

        return product;
    }
    public FakeStoreProductService(FakeStoreProductServiceClient fakeStoreProductServiceClient)
    {
        this.fakeStoreProductServiceClient=fakeStoreProductServiceClient;
    }
    @Override
    public GenericProductDto getProductById(Long id) throws NotFoundException {
        return convertFakeStoreProductIntoGenericProduct(fakeStoreProductServiceClient.getProductById(id));
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product)
    {
        return convertFakeStoreProductIntoGenericProduct(fakeStoreProductServiceClient.createProduct(product));
    }
    @Override
    public List<GenericProductDto> getProducts()
    {
        List<GenericProductDto> genericProductDtos = new ArrayList<>();

        for (FakeStoreProductDto fakeStoreProductDto: fakeStoreProductServiceClient.getProducts()) {
            genericProductDtos.add(convertFakeStoreProductIntoGenericProduct(fakeStoreProductDto));
        }
        return genericProductDtos;
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {
        return convertFakeStoreProductIntoGenericProduct(fakeStoreProductServiceClient.deleteProductById(id));
    }

    @Override
    public GenericProductDto updateProductbyId(GenericProductDto gpto, Long id) {
        return convertFakeStoreProductIntoGenericProduct(fakeStoreProductServiceClient.updateProductbyId(gpto, id));
    }
}
