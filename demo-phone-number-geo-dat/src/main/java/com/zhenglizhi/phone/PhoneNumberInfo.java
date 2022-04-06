package com.zhenglizhi.phone;

import lombok.Data;

/**
 * @author zhenglizhi
 * @date 2022/4/6
 */
@Data
public class PhoneNumberInfo {

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 省份
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 邮编
     */
    private String zipCode;

    /**
     * 区号
     */
    private String areaCode;

    /**
     * 运营商
     */
    private String phoneType;

}
