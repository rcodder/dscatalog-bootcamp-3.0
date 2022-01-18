package com.robsonpereira.dscalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robsonpereira.dscalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
