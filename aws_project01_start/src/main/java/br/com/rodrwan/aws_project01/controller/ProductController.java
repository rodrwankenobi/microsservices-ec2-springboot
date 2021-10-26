package br.com.rodrwan.aws_project01.controller;

import br.com.rodrwan.aws_project01.model.Product;
import br.com.rodrwan.aws_project01.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

public class ProductController {
    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Iterable<Product> findAll(){
        Optional<Product> optProduct = productRepository.findAll();
    }
}
