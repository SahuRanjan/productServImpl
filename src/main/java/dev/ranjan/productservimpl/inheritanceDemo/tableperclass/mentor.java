package dev.ranjan.productservimpl.inheritanceDemo.tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="tpc_mentor")
public class mentor extends user {
    private double avgRating;
}
