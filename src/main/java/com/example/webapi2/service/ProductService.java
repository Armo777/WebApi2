package com.example.webapi2.service;

import com.example.webapi2.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    // 1. получить все записи
    List<Product> getAll();
    // 2. получить запись по id
    Optional<Product> getById(Integer id);
    // 3. добавить новую запись
    Product add(Product product);
    // 4. удалить запись по id
    Boolean deleteById(Integer id);
    // 5. изменить запись
    Optional<Product> update(Product product);
}
