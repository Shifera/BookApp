package com.company;

public class BookApp {

    public static void main(String[] args) {
	// write your code here
        Book magazine = new Book("titanic", "Betty", "description", 3.4, 5);
        System.out.println(magazine.getAuthor());
        System.out.println(magazine.getDescription());
        System.out.println(magazine.getIsInStock());
        System.out.println(magazine.getPrice());
        System.out.println(magazine.getTitle());
        magazine.getDisplayText();
    }

}
