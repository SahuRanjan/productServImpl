package dev.ranjan.productservimpl.inheritanceDemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="st_student")
@DiscriminatorValue(value = "2")
public class student extends user {
    private double psp;
    private double attendence;
}
