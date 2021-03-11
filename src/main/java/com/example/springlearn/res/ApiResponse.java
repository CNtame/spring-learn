package com.example.springlearn.res;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/5
 */
public class ApiResponse <T> {

    private Integer code;

    private T data;

    private String msg;

    public static <T> ApiResponse<T> success() {
        return new ApiResponse<T>(0, "success");
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<T>(0, data);
    }

    public static <T> ApiResponse fail(Integer code, String msg) {
        return new ApiResponse(code, msg);
    }

    public static ApiResponse fail(String msg) {
        return new ApiResponse(1, msg);
    }



    public ApiResponse(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public ApiResponse(Integer code, T data, String msg) {
        this.msg = msg;
        this.data = data;
        this.code = code;
    }

    public ApiResponse(Integer code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
