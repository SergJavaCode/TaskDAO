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
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private String sqlScript;

    public String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getProductForName(String name) {
        sqlScript = read("getProductForName.sql");
        Map<String, Object> param = new HashMap<>();
        param.put("name", name);

        List<String> products = namedParameterJdbcTemplate.query(sqlScript, param, (resultSet, rowNum) -> {
            return resultSet.getString("product_name");
        });
        return products;
    }

}
