package ru.sergjava.dao.service;

import java.io.IOException;
import java.util.List;

public interface ProductService {
    public List<String> getProductForName(String name) throws IOException;

}
