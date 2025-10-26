package com.farhadislam.Knapsack.LibraryManagement;

public class Ebook extends Book {
    private double fileSize;

    public Ebook(String title, String author, double price, double fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
    @Override
    public String getDetails() {
        return super.getDetails() + ", File Size: " + fileSize + " MB";
    }

    @Override
    double calculatePrice(int days){
        double cost= super.calculatePrice(days);
        return cost * 0.9;
    }
}
