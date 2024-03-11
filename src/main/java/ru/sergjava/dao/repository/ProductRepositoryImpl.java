package ru.sergjava.dao.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private String sqlScript;

    public ProductRepositoryImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        try (InputStream is = new ClassPathResource("getProductForName.sql").getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            sqlScript = bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getProductForName(String name) {
        Map<String, Object> param = new HashMap<>();
        param.put("name", name);
        List<String> products = namedParameterJdbcTemplate.queryForList(sqlScript, param, String.class);
        return products;
    }

}
