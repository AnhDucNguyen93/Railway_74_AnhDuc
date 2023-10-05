package com.vti.shoppe74.modal.dto;

import lombok.Data;

import javax.validation.constraints.Positive;

@Data
public class OrderCreateDto {
    private long productId;
    private long accountId;

    @Positive(message = "Số lượng phải lớn hơn 0!")
    private int  quantity;
}
