package ru.sergjava.dao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(schema = "netology_task")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    @EqualsAndHashCode.Include
    private String name;

    @Column(nullable = false, length = 30)
    @EqualsAndHashCode.Include
    private String surname;

    @EqualsAndHashCode.Include
    @Column(nullable = false)
    private Integer age;

    @Column(name = "phone_number", unique = true)
    private Long phoneNumber;
}


