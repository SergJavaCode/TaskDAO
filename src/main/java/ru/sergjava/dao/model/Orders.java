package ru.sergjava.dao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(schema = "netology_task")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private Date date;

    @ManyToOne
    @JoinColumn(nullable = false, referencedColumnName = "id")
    private Customers customer;

    @Column(name = "product_name", nullable = false, length = 200)
    @EqualsAndHashCode.Include
    private String productName;

    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private Integer amount;
}