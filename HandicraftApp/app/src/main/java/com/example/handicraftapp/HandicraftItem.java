package com.example.handicraftapp;

public class HandicraftItem {
    private int mImageResource;
    private String mTitle;
    private String mDescription;
    private double mPrice;
    public HandicraftItem(int imageResource, String title, String description, double price) {
        mImageResource = imageResource;
        mTitle = title; mDescription = description;
        mPrice = price;
    }
    public int getImageResource() {
        return mImageResource;
    } public String getTitle() {
        return mTitle;
    }
    public String getDescription() {
        return mDescription;
    } public double getPrice() {
        return mPrice;
    }
}
