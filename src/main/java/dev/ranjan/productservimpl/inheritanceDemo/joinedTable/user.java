package dev.ranjan.productservimpl.inheritanceDemo.joinedTable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity(name="jt_user")
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
}
