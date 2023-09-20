package dev.ranjan.productservimpl.inheritanceDemo.mappedSuperclass;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class user {
    @Id
    private Long id;
    private String name;
    private String email;
}
