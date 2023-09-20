package dev.ranjan.productservimpl.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseModel{
    @Column
    private String name;
    @OneToMany
    private List<Product> products;
}
    //create database sep23productservice2;
      //  grant all privileges on sep23productservice2.* to 'root'@'localhost';