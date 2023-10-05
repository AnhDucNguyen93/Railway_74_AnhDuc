package com.vti.shoppe74.repository.specification;

import com.vti.shoppe74.modal.dto.SearchProductRequest;
import com.vti.shoppe74.modal.entity.Product;
import org.springframework.data.jpa.domain.Specification;

// Tạo phân trang sắp xếp
public class ProductSpecification {
    public static Specification<Product> buildCondition(SearchProductRequest request) {
        return Specification.where(buildConditionName(request))
                .and(buildConditionProductType(request))
                .and(buildConditionShippingUnit(request))
                .and(buildConditionStatus(request))
                .and(buildConditionPrice(request));
    }

    private static Specification<Product> buildConditionName(SearchProductRequest request) {
        if (request.getProductName() != null && !"".equals(request.getProductName())) {
            // Tạo điều kiện tìm kiếm với name
            return (root, query, cri) -> {
                // root: Chọn cột, field, để tìm kiếm (giá trị là thuộc tính Product trong java)
                // cri: CriteriaBuilder Khai báo loại so sánh dữ liệu. ( lớn hơn, nhỏ hơn, equal, like,.... )
                return cri.like(root.get("productName"), "%" + request.getProductName() + "%");
            };
        } else {
            return null;
        }
    }

    private static Specification<Product> buildConditionProductType(SearchProductRequest request) {
        if (request.getProductTypes() != null && request.getProductTypes().size() > 0) {
            return (root, query, cri) -> {
                // Tạo điều kiện tìm kiếm với productType. Producttype sẽ là 1 trong các giá trị truyền vào
                return root.get("productType").in(request.getProductTypes());
            };
        } else {
            return null;
        }
    }
    private static Specification<Product> buildConditionStatus(SearchProductRequest request) {
        if (request.getProductStatus() != null && request.getProductStatus().size() > 0) {
            return (root, query, cri) -> {
                // Tạo điều kiện tìm kiếm với productType. Producttype sẽ là 1 trong các giá trị truyền vào
                return root.get("productStatus").in(request.getProductStatus());
            };
        } else {
            return null;
        }
    }
    private static Specification<Product> buildConditionShippingUnit(SearchProductRequest request) {
        if (request.getShippingUnits() != null && request.getShippingUnits().size() > 0) {
            return (root, query, cri) -> {
                // Tạo điều kiện tìm kiếm với productType. Producttype sẽ là 1 trong các giá trị truyền vào
                return root.get("shippingUnit").in(request.getShippingUnits());
            };
        } else {
            return null;
        }
    }
    private static Specification<Product> buildConditionPrice(SearchProductRequest request){
        // CÓ thể viết logic chặt chẽ hơn
        if (request.getMinPrice() != 0 && request.getMaxPrice() != 0){ // Nếu ko truyền phần tử nào -> lấy tất cả
            return (root, query, cri) -> {
                return cri.between(root.get("price"), request.getMinPrice(), request.getMaxPrice());
            };
        } else {
            return null;
        }
    }

}
