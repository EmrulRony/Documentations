<h2>Comparable & Comparator</h2>

For sorting operations using data members there are two interface in Java 

1. Comparable
2. Comparator

### **Comparable**

Comparable is an interface present in `java.lang` package. It has only one method which is `compareTo()` .  The class which need to be sorted itself should implement the Comparable interface and compulsorily  provide the implementation for the `compareTo()` method. 

For example, we have a Book class with the fields like name, author and year. Now, we wish to sort a List of Books by year. So, we Book class has to implement Comparator and provide implementation for `compareTo()` method. 

<span style="color:red">All the wrapper classes in Java implements Comparable</span>

```
compareTo() return -1 means no swap
compareTo() return 1 means a swap
compareTo() return 0 means no swap
```

```java
   public class Book implements Comparable<Book>{
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

	// Implementing compareTo() abstract method of ComparableInterface
    public int compareTo(Book book) {
        return this.year-book.getYear();
    }
}
```

Now, Inside `main()` method we have to pass the object of Book class to `sort()` method. **Sort()** is a method present in `java.util.Collections` class. It has two overloaded method of  sort(). One take comparable object as parameter `Collections.sort(Comparable comparable)` and another takes a list and Comparator object as parameter `Collections.sort(List<T> list)`. 

```java
public class MainClass{
    public static void main(String[] args) {
        List <Book> bookList = new ArrayList<>();
        bookList.add(new Book("Alchemist", "Paulo Coelho", 2019));
        bookList.add(new Book("Sapians", "Yuval Noah Harari", 2014));
        bookList.add(new Book("MindSet", "Carol Dweck", 2008));
        bookList.add(new Book("Alchemist", "Yeari Mina", 2017));

        System.out.println("Printing before sorting");

        for (Book book : bookList){
            System.out.println(book);
        }
		// Calling the sort() method
        Collections.sort(bookList);
        System.out.println("Printing after sorting");

        for (Book book : bookList){
            System.out.println(book);
        }
    }
}

OUTPUT
------
Printing before sorting
Book [author=Paulo Coelho, name=Alchemist, year=2019]
Book [author=Yuval Noah Harari, name=Sapians, year=2014]
Book [author=Carol Dweck, name=MindSet, year=2008]
Book [author=Yeari Mina, name=Alchemist, year=2017]

Printing after sorting
Book [author=Carol Dweck, name=MindSet, year=2008]
Book [author=Yuval Noah Harari, name=Sapians, year=2014]
Book [author=Yeari Mina, name=Alchemist, year=2017]
Book [author=Paulo Coelho, name=Alchemist, year=2019]
```

Now, suppose we wish to sort our list of Books by names also. But we have only one compareTo() method to write our comparison logic. So we can can sort list using only one field when using Comparable interface. The solution is <span style="color:red">**Comparator**</span>. 

<h2>Comparator</h2>

Unlike Comparable the class which needs to be sorted doesn't needs to implement Comparator. Comparator is external and it has two public abstract method compare(Object obj1, Object obj2) and **equals()**. That means a separate class implements Comparator. We create multiple classes for comparing multiple fields. While implementing Comparator compulsorily we have to provide implementation of compare() method. equals() method is already implemented by Object class.  

Now, to compare same list of Books by years,

```java
class SortByYear implements Comparator<Book>{
	public int compare(Book o1, Book o2) {
		return o1.getYear() - o2.getYear();
	}
}   
```

Calling compare() method,

```java
Collections.sort(bookList, new SortByYear()); // Should be called inside main() method
```

**OUTPUT**

```
Print before sorting
Book [author=Paulo Coelho, name=Alchemist, year=2019]
Book [author=Yuval Noah Harari, name=Sapians, year=2014]
Book [author=Carol Dweck, name=MindSet, year=2008]
Book [author=Humayun Ahmed, name=Badsha Namdar, year=2019]
Book [author=Yeari Mina, name=Alchemist, year=2017]

Print after sorting
Book [author=Carol Dweck, name=MindSet, year=2008]
Book [author=Yuval Noah Harari, name=Sapians, year=2014]
Book [author=Yeari Mina, name=Alchemist, year=2017]
Book [author=Paulo Coelho, name=Alchemist, year=2019]
Book [author=Humayun Ahmed, name=Badsha Namdar, year=2019]
```

Again, to compare  by names,

```java
class SortByName implements Comparator<Book>{
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}   
```

Calling compare() method,

```java
Collections.sort(bookList, new SortByYear()); // Should be called inside main() method
```

**OUTPUT**

```
Print before sorting
Book [author=Paulo Coelho, name=Alchemist, year=2019]
Book [author=Yuval Noah Harari, name=Sapians, year=2014]
Book [author=Carol Dweck, name=MindSet, year=2008]
Book [author=Humayun Ahmed, name=Badsha Namdar, year=2019]
Book [author=Yeari Mina, name=Alchemist, year=2017]

Print after sorting
Book [author=Paulo Coelho, name=Alchemist, year=2019]
Book [author=Yeari Mina, name=Alchemist, year=2017]
Book [author=Humayun Ahmed, name=Badsha Namdar, year=2019]
Book [author=Carol Dweck, name=MindSet, year=2008]
Book [author=Yuval Noah Harari, name=Sapians, year=2014]
```

Comparing using two fields at the same time 

```java
class SortByNameAndYear implements Comparator<Book>{
    public int compare(Book o1, Book o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        int yearCompare = o1.getYear() - o2.getYear();
        if (nameCompare == 0) return ((yearCompare == 0)? nameCompare : yearCompare);
        else return nameCompare;
    }
}   
```

Implementing Comparator using anonymous inner class

```java
// This code block should be inside main() method   
 Comparator<Book> sortByYear = new Comparator<Book>(){
			@Override
			public int compare(Book o1, Book o2) {
                if (o1.getYear() < o2.getYear()) return -1;
                if (o1.getYear() > o2.getYear()) return 1;
                else return 0;
			}
        };
```

Implementing Comparator using Lambda Expression

```java
Comparator<Book> sortByName = (Book b1, Book b2) -> b1.getName().compareTo(b2.getName());
```