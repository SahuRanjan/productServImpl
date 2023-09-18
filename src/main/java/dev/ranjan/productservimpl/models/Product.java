package dev.ranjan.productservimpl.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;

}
