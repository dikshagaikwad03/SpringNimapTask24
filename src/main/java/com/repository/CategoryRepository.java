package com.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>
{


}
