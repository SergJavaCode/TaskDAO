package ru.sergjava.dao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @PersistenceContext
    EntityManager entityManager;
    private String sqlScript;

    public ProductRepositoryImpl() {
        try (InputStream is = new ClassPathResource("getProductForName.sql").getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            sqlScript = bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getProductForName(String name) {

        return entityManager.createNativeQuery(sqlScript, String.class).setParameter("name", name).getResultList();
    }

}
