package com.zhenglizhi.geo.controller;


import com.zhenglizhi.geo.service.PhoneRecognizeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 正式版删除
 *
 * @author zhenglizhi
 */
@RestController
@Slf4j
public class TestController {

    @Resource
    private PhoneRecognizeService phoneRecognizeService;

    @GetMapping("/test")
    public void test5() throws Exception {

    }

}
