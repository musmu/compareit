package com.example.myapplication;

public class ProductModelClass {
    String title,price,store,image,rating;

    public ProductModelClass(String title, String price,String store, String image,String rating) {
        this.title = title;
        this.price = price;
        this.store = store;
        this.image = image;
        this.rating = rating;
    }

    public ProductModelClass() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getStore() {
        return store;
    }
    public void setStore(String store) {
        this.store = store;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
}