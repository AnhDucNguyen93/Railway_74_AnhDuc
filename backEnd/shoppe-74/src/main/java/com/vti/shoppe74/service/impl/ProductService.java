package com.vti.shoppe74.service.impl;

import com.vti.shoppe74.modal.dto.ProductCreateDto;
import com.vti.shoppe74.modal.dto.ProductUpdateDto;
import com.vti.shoppe74.modal.dto.SearchProDuctRequest;
import com.vti.shoppe74.modal.entity.Product;
import com.vti.shoppe74.repository.ProductRepository;
import com.vti.shoppe74.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> getAll(int page, int size, String sortBy, String sortType) {
        Sort sort = null;
        if ("ASC".equalsIgnoreCase(sortType)) {
            sort = Sort.by(sortBy).ascending();
        } else {
            sort = Sort.by(sortBy).descending();
        }

        // Mới chỉ có phân trang chưa có sắp xếp
 //       Pageable pageable = Pageable.ofSize(size).withPage(page - 1);

        // Tạo ra đối tượng Pageable có sắp xếp
        Pageable pageable = PageRequest.of(page-1,size,sort);
        return productRepository.findAll(pageable);
    }

    @Override
    public List<Product> search(SearchProDuctRequest request) {
        return productRepository.findByProductNameContainsAndProductTypeIn(request.getProductName(), request.getProductTypes());
    }

    @Override
    public Product getById(long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product create(ProductCreateDto createDto) {
        // Kiểm tra sự tồn tại của productName
        Product product = new Product();
        BeanUtils.copyProperties(createDto, product);
//        product.setProductType(ProductType.PHONE);
//        product.setShippingunit(ShippingUnit.EXPRESS);
//        product.setProductStatus(ProductStatus.NEW);
        return productRepository.save(product);
    }

    @Override
    public Product update(ProductUpdateDto updateDto) {
        // logic Kiểm tra sự tồn tại của ProductId
        Product product = new Product();
        BeanUtils.copyProperties(updateDto, product);
//        product.setProductType(ProductType.PHONE);
//        product.setShippingunit(ShippingUnit.EXPRESS);
//        product.setProductStatus(ProductStatus.NEW);
        return productRepository.save(product);
    }

    @Override
    public void delete(long id) {
        productRepository.deleteById(id);
    }
}
