package com.zhenglizhi.geo.service.impl;

import com.zhenglizhi.geo.model.PhoneInfo;
import com.zhenglizhi.geo.service.PhoneRecognizeService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhenglizhi
 * @version 1.0
 * @description:
 * @date 2022/4/6 19:09
 */
@Service("phoneRecognizeService")
public class PhoneRecognizeServiceImpl implements PhoneRecognizeService {

    private static Map<String, PhoneInfo> caches = new LinkedHashMap<>();

    static {
        InputStream in = PhoneRecognizeServiceImpl.class.getResourceAsStream("/phone.data.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        bufferedReader.lines().forEach(line -> {
            PhoneInfo phoneInfo = new PhoneInfo();
            String[] lines = line.split("\t");
            String key = lines[0];
            caches.put(key, phoneInfo);
            phoneInfo.setProvince(lines[1]);
            phoneInfo.setCity(lines[2]);
            phoneInfo.setOperator(lines[3]);
            phoneInfo.setCityCode(lines[4]);
            phoneInfo.setPostcode(lines[5]);
        });
    }

    @Override
    public PhoneInfo onCall(String phone) {
        String phonePrefix = phone.substring(0, 7);

        PhoneInfo phoneInfo = caches.get(phonePrefix);

        binarySearch(caches.keySet().toArray(new String[]{}), 0, caches.size(), Integer.parseInt(phonePrefix));

        return phoneInfo;


    }

    /**
     * @Param:二分法
     * @return:
     **/
    public PhoneInfo binarySearch(String[] arr, int start, int end, int hkey) {
        PhoneInfo info = null;
        //415284条数据
        while (start <= end) {
            //防止溢位
            int mid = start + (end - start) / 2;
            int val = Integer.parseInt(arr[mid]);

            if (val > hkey) {
                end = mid - 1;
            } else if (val < hkey) {
                start = mid + 1;
            } else {
                String key = arr[mid];
                info = caches.get(key);
                break;
            }
        }
        return info;
    }

}
