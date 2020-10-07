package com.ddu.goushushenpixitong.controller;

import com.ddu.goushushenpixitong.util.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther ChunKit
 * @date 2019/10/24-9:15
 */
@RestController
public class ErrorController {

    @GetMapping("/error")
    public CommonResult error() {
        return CommonResult.failure();
    }

}
