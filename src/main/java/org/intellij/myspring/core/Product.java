package org.intellij.myspring.core;

import org.springframework.beans.factory.annotation.Qualifier;

import java.beans.ConstructorProperties;

public class Product {

    private String productId;
    private String productName;
    private String productDesc;

    @ConstructorProperties({"productId","productName","productDescription"})
    public Product(String productId, String productName, String productDesc) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
