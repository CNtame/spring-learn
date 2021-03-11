package com.example.springlearn.res;

import com.sun.tools.javac.jvm.Code;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/5
 */
public class CodeMsg {

    private Integer code;

    private String msg;


    CodeMsg success = new CodeMsg(0, "success");

    CodeMsg pathError = new CodeMsg(1001, "fail");


    public CodeMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
