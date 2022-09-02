package com.carrilho.IntelliJSpring.Boot.resources;
import com.carrilho.IntelliJSpring.Boot.entities.Category;
import com.carrilho.IntelliJSpring.Boot.entities.Product;
import com.carrilho.IntelliJSpring.Boot.repositories.CategoryRepository;
import com.carrilho.IntelliJSpring.Boot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    //Compor objetos para acessar o Category Repository
    //Utilizar o mecanismo de injeção de dependências do Spring Boot
    @Autowired //Faz o pré processamento e resolve a dependência e para funcionar utilizamos @Componenty no CatergoryRepository
    private ProductRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
		List<Product> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable String id) {
		Product cat = categoryRepository.findById(Long.valueOf(id)).get();
        return ResponseEntity.ok().body(cat);
    }
}
