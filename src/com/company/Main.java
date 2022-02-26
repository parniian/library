package com.company;

public class Main {
    public static void main(String[] args){
        Library library=new Library();

        library.name=" The name of this library is Wisdom.";
        library.timeWorking="The library is open on everyday exept Fridays, from 7 a.m. till 7 p.m.";
        library.subjectOfBooks="Subjects of the books are scientific , novel , historical , sociological and etc.";
        library.ageRatingOfBooks="The age rating : children , teenagers , adults , unclassified.";
        library.numberOfBooks = 3450;

        System.out.println(library.name);
        System.out.println(library.timeWorking);
        System.out.println(library.subjectOfBooks);
        System.out.println(library.ageRatingOfBooks);
        System.out.println("Number of books : " + library.numberOfBooks);

        library.register();
        library.borrow();
        library.giveBack();
    }
}
