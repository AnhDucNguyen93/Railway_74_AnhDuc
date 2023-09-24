package com.vti.shoppe74.controller;

import com.vti.shoppe74.modal.dto.ProductCreateDto;
import com.vti.shoppe74.modal.dto.ProductUpdateDto;
import com.vti.shoppe74.modal.dto.SearchProDuctRequest;
import com.vti.shoppe74.modal.entity.Product;
import com.vti.shoppe74.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/get-all")
    public Page<Product> getAll(int page, int size, String sortBy, String sortType) {

        return productService.getAll(page,size,sortBy,sortType);
    }

    @PostMapping ("/search")
    public List<Product> search(@RequestBody SearchProDuctRequest request) {
        return productService.search(request);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable long id) {
        return productService.getById(id);
    }

    @PostMapping("/create")
    public Product create(@RequestBody ProductCreateDto createDto) {
        return productService.create(createDto);
    }

    @PutMapping("/update")
    public Product update(@RequestBody ProductUpdateDto updateDto) {
        return productService.update(updateDto);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        productService.delete(id);
    }

}
