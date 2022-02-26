package com.company;

public class Library {
    public String name;
    public String timeWorking;
    public String subjectOfBooks;
    public String ageRatingOfBooks;
    public int numberOfBooks;

    public void register()
    {
        System.out.println("You must register inorder to borrow books.");
    }

    public void borrow()
    {
        System.out.println("All books could be borrowed only for two weeks!");
    }

    public void giveBack()
    {
        System.out.println("please return the books on time!");
    }

}
