package ru.sergjava.dao.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(schema = "netology_task")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 30)
    private String name;
    @Column(nullable = false, length = 30)
    private String surname;
    @Column(nullable = false)
    private Integer age;
    @Column(unique = true)
    private Long phone_number;
}


