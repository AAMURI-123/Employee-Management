package com.umerscode.employeeManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import static jakarta.persistence.GenerationType.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(unique = true)
    private String employeeCode;

}
