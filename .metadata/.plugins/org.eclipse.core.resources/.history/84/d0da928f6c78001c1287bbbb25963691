package com.robsonpereira.dscalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robsonpereira.dscalog.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Books")); /* O " L " reforça o tipo Longo. E Category.java, " id " é do tipo Long.*/
		list.add(new Category(2L, "Electronics"));
		return ResponseEntity.ok().body(list);//retornan o a lista no corpo da resposta http. Método builder
	}
}