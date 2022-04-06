package com.zhenglizhi.geo;

import com.zhenglizhi.phone.PhoneNumberGeo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoPhoneNumberGeoApplicationTests {

    @Test
    public void testNormalCase() throws Exception {
        System.out.println(PhoneNumberGeo.lookup("18519148828"));
        //PhoneNumberInfo(phoneNumber=17519148829, province=吉林, city=长春, zipCode=130000, areaCode=0431, phoneType=联通)
    }
}
