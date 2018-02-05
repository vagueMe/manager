package com.springboot.manager.model.generator;

/**
 *   省
 *   province
 * @mbg.generated do_not_delete_during_merge
 */
public class Province {
    /**
     *   province.ProvinceId
     * @mbg.generated
     */
    private Integer provinceId;

    /**
     *   province.ProvinceName
     * @mbg.generated
     */
    private String provinceName;

    /**
     * @return the value of province.ProvinceId
     * @mbg.generated
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * @param provinceId the value for province.ProvinceId
     * @mbg.generated
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * @return the value of province.ProvinceName
     * @mbg.generated
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * @param provinceName the value for province.ProvinceName
     * @mbg.generated
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }
}