package com.zhenglizhi.geo.model;

import lombok.Data;

/**
 * @author zhenglizhi
 * @version 1.0
 * @description:
 * @date 2022/4/6 18:56
 */
@Data
public class PhoneInfo {

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 城市编码
     */
    private String cityCode;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 运营商
     */
    private String operator;

}
