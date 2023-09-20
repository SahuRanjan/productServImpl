package dev.ranjan.productservimpl.inheritanceDemo.mappedSuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="ms_student")
public class student extends user{
    private double psp;
    private double attendence;
}
