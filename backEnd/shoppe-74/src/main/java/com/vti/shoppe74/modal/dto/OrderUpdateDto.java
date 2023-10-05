package com.vti.shoppe74.modal.dto;

import lombok.Data;

@Data
public class OrderUpdateDto {
    private long id;
    private long productId;
    private long accountId;
    private int  quantity;
}
