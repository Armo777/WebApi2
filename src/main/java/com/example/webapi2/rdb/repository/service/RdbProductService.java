package com.example.webapi2.rdb.repository.service;

import com.example.webapi2.entity.Product;
import com.example.webapi2.rdb.repository.ProductRepository;
import com.example.webapi2.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RdbProductService implements ProductService {
    private final ProductRepository productRepository;

    public RdbProductService(ProductRepository productOrderRepository) {
        this.productRepository = productOrderRepository;
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>)productRepository.findAll();
    }

    @Override
    public Optional<Product> getById(Integer id) {
        return  productRepository.findById(id);
    }

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Boolean deleteById(Integer id) {
        Optional<Product> deleted = productRepository.findById(id);
        if (deleted.isPresent()) {
            productRepository.deleteById(id);
        }
        return deleted.isPresent();
    }

    @Override
    public Optional<Product> update(Product product) {
        Optional<Product> updated = productRepository.findById(product.getId());
        if (updated.isPresent()) {
            productRepository.save(product);
            return Optional.of(product);
        }
        return Optional.empty();
    }
}
