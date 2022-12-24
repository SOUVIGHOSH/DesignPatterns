package com.souvik.builder;
public interface Builder {
    void setName(String name);
    void setColor(String color);
    void setWheels(int wheels);
    void setEngine(int capacity);
    Vehicle getProduct();
    void createProduct();
}
