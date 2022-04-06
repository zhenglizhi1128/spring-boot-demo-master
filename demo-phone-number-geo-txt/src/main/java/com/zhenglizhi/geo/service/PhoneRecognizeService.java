package com.zhenglizhi.geo.service;

import com.zhenglizhi.geo.model.PhoneInfo;

/**
 * @author zhenglizhi
 * @version 1.0
 * @description:
 * @date 2022/4/6 19:06
 */
public interface PhoneRecognizeService {

    /**
     * 手机信息查询
     *
     * @param phone
     * @return
     */
    PhoneInfo onCall(String phone);

}
