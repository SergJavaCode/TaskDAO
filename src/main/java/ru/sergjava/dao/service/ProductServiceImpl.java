package ru.sergjava.dao.service;

import org.springframework.stereotype.Service;
import ru.sergjava.dao.repository.ProductRepository;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<String> getProductForName(String name) throws IOException {

        return repository.getProductForName(name);
    }
}
