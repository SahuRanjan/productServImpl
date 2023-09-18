package dev.ranjan.productservimpl.thirdpartyClients.productService.fakestore;


import dev.ranjan.productservimpl.dtos.GenericProductDto;
import dev.ranjan.productservimpl.exceptions.NotFoundException;
import dev.ranjan.productservimpl.thirdpartyClients.productService.ThirdPartyProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class FakeStoreProductServiceClient implements ThirdPartyProductService {
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.url}")
    private String fakeStoreApiUrl;

    @Value("${fakestore.api.paths.product}")
    private String fakeStoreProductsApiPath;

    private String specificProductrequestUrl ;
    private String productRequestBaseUrl ;

    public FakeStoreProductServiceClient(RestTemplateBuilder restTemplateBuilder,
                                         @Value("${fakestore.api.url}") String fakeStoreApiUrl,
                                         @Value("${fakestore.api.paths.product}") String fakeStoreProductsApiPath) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.productRequestBaseUrl  = fakeStoreApiUrl + fakeStoreProductsApiPath;
        this.specificProductrequestUrl = fakeStoreApiUrl + fakeStoreProductsApiPath + "/{id}";
    }

    public FakeStoreProductDto getProductById(Long id) throws NotFoundException {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> response =
                restTemplate.getForEntity(specificProductrequestUrl, FakeStoreProductDto.class, id);
        FakeStoreProductDto fakestoreProductDto=response.getBody();
        if(fakestoreProductDto==null)
        {
            throw new NotFoundException("Product with id: " + id + " doesn't exist.");
        }

        return fakestoreProductDto;
    }

    public FakeStoreProductDto createProduct(GenericProductDto product)
    {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> response =
                restTemplate.postForEntity(productRequestBaseUrl, product, FakeStoreProductDto.class);
        return response.getBody();
    }
    public List<FakeStoreProductDto> getProducts()
    {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto[]> response =
                restTemplate.getForEntity(productRequestBaseUrl, FakeStoreProductDto[].class);
        return Arrays.stream(response.getBody()).toList();
    }


    public FakeStoreProductDto deleteProductById(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        RequestCallback requestCallback = restTemplate.acceptHeaderRequestCallback(FakeStoreProductDto.class);
        ResponseExtractor<ResponseEntity<FakeStoreProductDto>> responseExtractor =
                restTemplate.responseEntityExtractor(FakeStoreProductDto.class);
        ResponseEntity<FakeStoreProductDto> response = restTemplate.execute(specificProductrequestUrl, HttpMethod.DELETE,
                requestCallback, responseExtractor, id);

        return response.getBody();
    }


    public FakeStoreProductDto updateProductbyId(GenericProductDto gpto, Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        RequestCallback requestCallback = restTemplate.httpEntityCallback(gpto,FakeStoreProductDto.class);
        ResponseExtractor<ResponseEntity<FakeStoreProductDto>> responseExtractor =
                restTemplate.responseEntityExtractor(FakeStoreProductDto.class);
        ResponseEntity<FakeStoreProductDto> response = restTemplate.execute(specificProductrequestUrl, HttpMethod.PUT,
                requestCallback, responseExtractor, id);

        return response.getBody();
    }
}
