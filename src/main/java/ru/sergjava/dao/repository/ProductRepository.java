package ru.sergjava.dao.repository;

import java.util.List;

public interface ProductRepository {
    public List<String> getProductForName(String name);
}
