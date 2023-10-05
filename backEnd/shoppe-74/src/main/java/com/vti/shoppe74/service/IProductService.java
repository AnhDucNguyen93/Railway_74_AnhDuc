package com.vti.shoppe74.service;

import com.vti.shoppe74.modal.dto.ProductCreateDto;
import com.vti.shoppe74.modal.dto.ProductUpdateDto;
import com.vti.shoppe74.modal.dto.SearchProductRequest;
import com.vti.shoppe74.modal.entity.Product;
import org.springframework.data.domain.Page;

public interface IProductService {
    Page<Product> getAll(int page, int size, String sortBy, String sortType);

    Page<Product> search(SearchProductRequest request);

    Product getById(long id);

    Product create(ProductCreateDto createDto);

    Product update(ProductUpdateDto updateDto);

    void delete(long id);
}
