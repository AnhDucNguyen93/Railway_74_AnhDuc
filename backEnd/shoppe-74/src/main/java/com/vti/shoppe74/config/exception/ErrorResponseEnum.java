package com.vti.shoppe74.config.exception;

public enum ErrorResponseEnum {
    NOT_FOUND_PRODUCT(404, "Không tìm thấy sản phẩm"),
    NOT_FOUND_ACCOUNT(404, "Không tìm thấy người dùng"),
    NOT_FOUND_ODER(404, "không tìm thấy đơn hàng"),
    PRODUCT_NAME_EXISTED(400, "ProductName đã tồn tại!"),

    USERNAME_EXISTED(400, "Username đã tồn tại!"),
    LOGIN_USERNAME_NOT_EXISTED(401, "UserName không tồn tại!"),
    LOGIN_PASSWORD_FALSE(401, "Password bị sai!");


    public final int status;
    public final String message;
    ErrorResponseEnum(int status, String message) {
        this.status = status;
        this.message = message;
    }

}
