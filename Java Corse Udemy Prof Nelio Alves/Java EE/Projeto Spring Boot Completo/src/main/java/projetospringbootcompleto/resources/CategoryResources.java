package projetospringbootcompleto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetospringbootcompleto.entities.Category;
import projetospringbootcompleto.service.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> CategoryList = categoryService.findAll();
		return ResponseEntity.ok().body(CategoryList);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category Category = categoryService.findById(id);
		return ResponseEntity.ok().body(Category);
	}
}
