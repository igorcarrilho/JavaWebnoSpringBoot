package com.carrilho.IntelliJSpring.Boot.repositories;

import com.carrilho.IntelliJSpring.Boot.entities.Category;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.function.Function;

@Repository //Mecanismo de Injeção de dependencia do Spring Boot
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
