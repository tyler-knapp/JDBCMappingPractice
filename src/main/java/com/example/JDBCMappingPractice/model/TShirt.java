package com.example.JDBCMappingPractice.model;

public class TShirt {
    
    long id;
    double price;
    boolean isSoldOut;
    boolean isOnSale;
    String size;
    String color;
    String description;
    //This could just be the url or path to asset?
    String productImage;
    //Array<Image> Image Carousel. Something that loops through an Array of pictures after x time.
    
    public TShirt(){
    
    }
    
    public TShirt(long id, int price, boolean isSoldOut, boolean isOnSale, String size, String color, String description, String productImage) {
        this.id = id;
        this.price = price;
        this.isSoldOut = isSoldOut;
        this.isOnSale = isOnSale;
        this.size = size;
        this.color = color;
        this.description = description;
        this.productImage = productImage;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public boolean isSoldOut() {
        return isSoldOut;
    }
    
    public void setSoldOut(boolean soldOut) {
        isSoldOut = soldOut;
    }
    
    public boolean isOnSale() {
        return isOnSale;
    }
    
    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getProductImage() {
        return productImage;
    }
    
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}
