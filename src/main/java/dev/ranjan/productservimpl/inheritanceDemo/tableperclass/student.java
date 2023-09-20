package dev.ranjan.productservimpl.inheritanceDemo.tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="tpc_student")
public class student extends user {
    private double psp;
    private double attendence;
}
