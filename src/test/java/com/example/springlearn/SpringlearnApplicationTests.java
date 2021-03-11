package com.example.springlearn;

import com.example.springlearn.test.TestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringlearnApplicationTests {

    //@Test
    //void contextLoads() {
    //}

    @Autowired
    private TestService testService;

    private String data;

    private String methodData;

    @BeforeEach
    public void insertData() {
        data = "BeforeEach注解使用";

    }


    @Test
    public void testPrint() {
        System.out.println(testService.printSomeService(data));

    }

}
