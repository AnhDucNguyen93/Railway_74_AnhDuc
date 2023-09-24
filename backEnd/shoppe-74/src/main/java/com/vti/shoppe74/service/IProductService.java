package com.vti.shoppe74.service;

import com.vti.shoppe74.modal.dto.ProductCreateDto;
import com.vti.shoppe74.modal.dto.ProductUpdateDto;
import com.vti.shoppe74.modal.dto.SearchProDuctRequest;
import com.vti.shoppe74.modal.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IProductService {
    Page<Product> getAll(int page, int size, String sortBy, String sortType);

    List<Product> search(SearchProDuctRequest request);

    Product getById(long id);

    Product create(ProductCreateDto createDto);

    Product update(ProductUpdateDto updateDto);

    void delete(long id);
}
