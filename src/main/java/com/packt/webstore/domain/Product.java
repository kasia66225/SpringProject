package com.packt.webstore.domain;

import java.math.BigDecimal;

public class Product {
    private String productId;
    private String name;
    private BigDecimal unitPrice;
    private String description;
    private String manufacturer;
    private String category;
    private long unitsIntock;
    private long getUnitsInOrder;
    private boolean discounted;
    private String condition;

    public Product(){
        super();
    }

    public Product(String productId, String name,BigDecimal unitPrice){
        this.productId=productId;
        this.name=name;
        this.unitPrice=unitPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        productId = productId;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getUnitsIntock() {
        return unitsIntock;
    }

    public void setUnitsIntock(long unitsIntock) {
        this.unitsIntock = unitsIntock;
    }

    public long getGetUnitsInOrder() {
        return getUnitsInOrder;
    }

    public void setGetUnitsInOrder(long getUnitsInOrder) {
        this.getUnitsInOrder = getUnitsInOrder;
    }

    public boolean isDiscounted() {
        return discounted;
    }

    public void setDiscounted(boolean discounted) {
        this.discounted = discounted;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        Product other = (Product) obj;

        if(productId == null) {
            if(other.productId != null)
                return false;
        } else if(!productId.equals(other.productId))
            return false;
        return true;
    }

    @Override
    public int hashCode(){
        final int prime = 13;
        int result = 1;
        result = prime*result+((productId==null)?0 : productId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Product [ productId= " + productId + ", nazwa: " + name + " ]";
    }
}
