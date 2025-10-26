package com.farhadislam.Knapsack.LibraryManagement;

public class PrintedBook extends Book{
    private int pageCount;
    public PrintedBook(String title, String author, double price, int pageCount) {
        super(title, author, price);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getDetails() {
        return super.getDetails() + ", Pages: " + pageCount;
    }

    double calculatePrice(int days){
        double handleFree = super.calculatePrice(days);
        return handleFree + 2.0;
    }
}
