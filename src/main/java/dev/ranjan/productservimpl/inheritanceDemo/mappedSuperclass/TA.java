package dev.ranjan.productservimpl.inheritanceDemo.mappedSuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="ms_ta")
public class TA extends user{
    private double avgRating;
}
