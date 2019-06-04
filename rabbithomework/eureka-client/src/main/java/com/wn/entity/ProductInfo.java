package com.wn.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProductInfo implements Serializable {
    @Override
    public String toString() {
        return "ProductInfo{" +
                "produtcId=" + produtcId +
                ", produtcName='" + produtcName + '\'' +
                ", produtcPrice=" + produtcPrice +
                ", produtcStock=" + produtcStock +
                ", productDescription='" + productDescription + '\'' +
                ", productIcon='" + productIcon + '\'' +
                ", categoryType=" + categoryType +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                '}';
    }

    private Integer produtcId;

    private String produtcName;

    private BigDecimal produtcPrice;

    private Integer produtcStock;

    private String productDescription;

    private String productIcon;

    private Integer categoryType;

    private Date creatTime;

    private Date updateTime;

    public Integer getProdutcId() {
        return produtcId;
    }

    public void setProdutcId(Integer produtcId) {
        this.produtcId = produtcId;
    }

    public String getProdutcName() {
        return produtcName;
    }

    public void setProdutcName(String produtcName) {
        this.produtcName = produtcName == null ? null : produtcName.trim();
    }

    public BigDecimal getProdutcPrice() {
        return produtcPrice;
    }

    public void setProdutcPrice(BigDecimal produtcPrice) {
        this.produtcPrice = produtcPrice;
    }

    public Integer getProdutcStock() {
        return produtcStock;
    }

    public void setProdutcStock(Integer produtcStock) {
        this.produtcStock = produtcStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon == null ? null : productIcon.trim();
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}