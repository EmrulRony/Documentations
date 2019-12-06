package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book>{
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", name=" + name + ", year=" + year + "]";
    }

    @Override
    public int compareTo(Book book) {
        return this.year-book.getYear();
    }
}
public class ComparableDemo{
    public static void main(String[] args) {
        List <Book> bookList = new ArrayList<>();
        bookList.add(new Book("Alchemist", "Paulo Coelho", 2019));
        bookList.add(new Book("Sapians", "Yuval Noah Harari", 2014));
        bookList.add(new Book("MindSet", "Carol Dweck", 2008));

        System.out.println("Print before sorting");

        for (Book book : bookList){
            System.out.println(book);
        }

        Collections.sort(bookList);
        System.out.println("Print after sorting");

        for (Book book : bookList){
            System.out.println(book);
        }
    }
}