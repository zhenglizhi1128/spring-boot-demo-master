package com.zhenglizhi.geo;


import com.zhenglizhi.geo.model.PhoneInfo;
import com.zhenglizhi.geo.service.PhoneRecognizeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoPhoneNumberGeoApplicationTests {

    @Resource
    private PhoneRecognizeService phoneRecognizeService;

    @Test
    public void test() throws Exception {
        PhoneInfo phoneInfo = phoneRecognizeService.onCall("17519148828");
        System.out.println(phoneInfo.toString());
    }
}
