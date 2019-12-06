package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo{
    public static void main(String[] args) {
        List <Book> bookList = new ArrayList<>();
        bookList.add(new Book("Alchemist", "Paulo Coelho", 2019));
        bookList.add(new Book("Sapians", "Yuval Noah Harari", 2014));
        bookList.add(new Book("MindSet", "Carol Dweck", 2008));
        bookList.add(new Book("Badsha Namdar", "Humayun Ahmed", 2019));
        bookList.add(new Book("Alchemist", "Yeari Mina", 2017));

        // Implementing comparator using anonymous inner class 

        Comparator<Book> sortByYear = new Comparator<Book>(){
			@Override
			public int compare(Book o1, Book o2) {
                if (o1.getYear() < o2.getYear()) return -1;
                if (o1.getYear() > o2.getYear()) return 1;
                else return 0;
			}
        };

        Comparator<Book> sortByName = (Book b1, Book b2) -> b1.getName().compareTo(b2.getName());

        System.out.println("Print before sorting");

        for (Book book : bookList){
            System.out.println(book);
        }

        System.out.println("Print after sorting");
        Collections.sort(bookList, new SortByName());

        for (Book book : bookList){
            System.out.println(book);
        }
    }
}

// Implementing Comparator interface
class SortByYear implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getYear() - o2.getYear();
	}
}

class SortByName implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

// Compare using two fields
class SortByNameAndYear implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        int yearCompare = o1.getYear() - o2.getYear();
        if (nameCompare == 0) return ((yearCompare == 0)? nameCompare : yearCompare);
        else return nameCompare;
    }
}

class SortByNameAndYearTurnari implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        int yearCompare = o1.getYear() - o2.getYear();
        return (nameCompare == 0)? (yearCompare == 0)? yearCompare:nameCompare :nameCompare ;
    }
}

// Entity class
class Book{
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
}