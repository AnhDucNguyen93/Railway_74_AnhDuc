package com.vti.shoppe74.repository;

import com.vti.shoppe74.modal.entity.Product;
import com.vti.shoppe74.modal.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> , JpaSpecificationExecutor<Product> {
   // @Query("select p from Product p where p.productName like %?1%")
    List<Product> findByProductNameContainsAndProductTypeIn(String productName, List<ProductType> productTypes);
}
