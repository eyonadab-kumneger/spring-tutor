package com.springturor.springtutor.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="customer_tbl")
@Data
public class Eyo {
    @Id
    @Column(name = "customer_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;


}
