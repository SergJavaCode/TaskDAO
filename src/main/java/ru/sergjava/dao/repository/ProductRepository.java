package ru.sergjava.dao.repository;

import java.util.List;

public interface ProductRepository {
    public String read(String scriptFileName);

    public List<String> getProductForName(String name);
}
