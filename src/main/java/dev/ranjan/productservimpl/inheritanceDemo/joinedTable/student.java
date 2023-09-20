package dev.ranjan.productservimpl.inheritanceDemo.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="jt_student")
@PrimaryKeyJoinColumn(name = "user_id")
public class student extends user {
    private double psp;
    private double attendence;
}
