package com.vti.shoppe74.service.impl;

import com.vti.shoppe74.config.exception.CustomException;
import com.vti.shoppe74.config.exception.ErrorResponseEnum;
import com.vti.shoppe74.modal.dto.ProductCreateDto;
import com.vti.shoppe74.modal.dto.ProductUpdateDto;
import com.vti.shoppe74.modal.dto.SearchProductRequest;
import com.vti.shoppe74.modal.entity.Product;
import com.vti.shoppe74.repository.ProductRepository;
import com.vti.shoppe74.repository.specification.ProductSpecification;
import com.vti.shoppe74.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public Page<Product> search(SearchProductRequest request) {
        // Tạo ra điều kiện từ ProductSpecification
        Specification<Product> condition = ProductSpecification.buildCondition(request);

        // Tạo phân trang sắp xếp
        Sort sort = null;
        if ("ASC".equalsIgnoreCase(request.getSortType())) {
            sort = Sort.by(request.getSortBy()).ascending();
        } else {
            sort = Sort.by(request.getSortBy()).descending();
        }
        Pageable pageable = PageRequest.of(request.getPage()-1, request.getSize(),sort);
        return productRepository.findAll(condition, pageable);
    }

    @Override
    public Product getById(long id) {
        if (id<0){
            throw new CustomException(400,"ID không được là số âm");
        }
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isEmpty()){
            throw new CustomException(ErrorResponseEnum.NOT_FOUND_PRODUCT);
        }
        return productOptional.get();
    }

    @Override
    public Product create(ProductCreateDto createDto) {
        //--------- Validate/verify/ kiểm tra dữ liêu đầu vào--------------
//        (Validate những điều kiện mà Java có thể check được trước,
//        rồi mới Validate nhưngx điều kiện ở database -Mục đích -> Tối ưu thời gian
//        if (createDto.getImage().length()>500){
//            throw new CustomException(400,"Độ dài url ảnh không được quá 500 ký tự")
//        }
        // Kiểm tra sự tồn tại của productName
        boolean checkProductName = productRepository.existsByProductName(createDto.getProductName());
        if(checkProductName){
            throw  new CustomException(ErrorResponseEnum.PRODUCT_NAME_EXISTED);
        }
        //-----------------------------------------------
        Product product = new Product();
        BeanUtils.copyProperties(createDto, product);
//        product.setProductType(ProductType.PHONE);
//        product.setShippingunit(ShippingUnit.EXPRESS);
//        product.setProductStatus(ProductStatus.NEW);
        return productRepository.save(product);
    }

    @Override
    public Product update(ProductUpdateDto updateDto) {
        if(!productRepository.existsById(updateDto.getId())){
            throw new CustomException(ErrorResponseEnum.NOT_FOUND_PRODUCT);
        }

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
