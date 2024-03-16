package ru.sergjava.dao.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(schema = "netology_task")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date date;
    @ManyToOne
    @JoinColumn(nullable = false, referencedColumnName = "id")
    private Customers customer;
    @Column(nullable = false, length = 200)
    private String product_name;
    @Column(nullable = false)
    private Integer amount;
}