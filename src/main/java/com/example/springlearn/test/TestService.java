package com.example.springlearn.test;

import com.example.springlearn.res.ApiResponse;
import org.springframework.stereotype.Service;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/5
 */
@Service
public class TestService {


    public ApiResponse printSomeService(String msg) {
        try {
            System.out.println(msg);
            return ApiResponse.success();
        } catch (Exception e) {
            return ApiResponse.fail(e.toString());
        }
    }
}
