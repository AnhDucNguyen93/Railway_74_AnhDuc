package com.vti.shoppe74.controller;

import com.vti.shoppe74.config.exception.CustomException;
import com.vti.shoppe74.modal.dto.ProductCreateDto;
import com.vti.shoppe74.modal.dto.ProductUpdateDto;
import com.vti.shoppe74.modal.dto.SearchProductRequest;
import com.vti.shoppe74.modal.entity.Product;
import com.vti.shoppe74.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/product")
@CrossOrigin("*")  // cấp quyền truy cập cho bên thứ 3
@Validated
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/get-all")
    public Page<Product> getAll(int page, int size, String sortBy, String sortType) {
        return productService.getAll(page, size, sortBy, sortType);
    }

    @PostMapping("/search")
    public Page<Product> search(@RequestBody SearchProductRequest request) {
        return productService.search(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable long id) {
        return ResponseEntity.ok(productService.getById(id)); // Thành công http status: 200

//        try {
//            return ResponseEntity.ok(productService.getById(id)); // Thành công http status: 200
//        }
//        catch (CustomException e){
//            return ResponseEntity.status(e.getStatus()).body(e);
//        }
//        catch (Exception exception) {
//            return ResponseEntity.status(404).body(exception.getMessage());
//        }
    }

    @PostMapping("/create")
    public Product create(@RequestBody @Valid ProductCreateDto createDto) {
        return productService.create(createDto);
    }

    @PutMapping("/update")
    public Product update(@RequestBody @Valid ProductUpdateDto updateDto) {
        return productService.update(updateDto);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        productService.delete(id);
    }

}
