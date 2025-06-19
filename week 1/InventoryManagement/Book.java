package InventoryManagement;
import java.util.*;

public class Book {
   int bookId;
   String title;
   String author;

   static ArrayList<Book> books = new ArrayList<>();
   
   public Book(int bookId, String title, String author){
        this.author = author;
        this.bookId = bookId;
        this.title = title;
        books.add(this);
   }

   public static void linear(String title){
    for(int i=0;i<books.size();i++){
        if(books.get(i).title == title){
            System.out.println("The book is found at "+i);
            return;
        }
    }
    System.out.println("The book is not in the library! :(");
   }

   public static void binary_search(String title, int id){
    int low, high;
    low = 0;
    high = books.size()-1;

    while(low <= high){
        int mid = (int)((low+high)/2);
        if(books.get(mid).title == title){
            System.out.println("The book is found at: "+mid);
            return;
        }

        else if((id-1) > mid){
            low=mid+1;
        }else if((id-1) < mid){
            high = mid-1;
        }
    }

    System.out.println("The book is not in the library! :(");
   }

   public static void main(String[] args){
    Book b1 = new Book(1, "Bunny", "Mona Awad");
    Book b2 = new Book(2, "God of small things", "Arndati Roy");
    Book b3 = new Book(3, "Frankenstein", "Mary Shelly");
    Book b4 = new Book(4, "Little Women", "Louisa Maycott");

    linear(b1.title);
    binary_search(b2.title, b2.bookId);
    linear(b3.title);
    binary_search(b4.title, b4.bookId);
   }


}
