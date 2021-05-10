/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookstoreapp;

public class Book {
    String bookTitle,bookAuthor,bookIsBN;
    int numOfCopies;
    
    public Book(String bookTitle,String bookAuthor,String bookIsBN,int numOfCopies ){
        
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookIsBN = bookIsBN;
        this.numOfCopies = numOfCopies;
    }
    void display(){
      
      System.out.println("Title:"+bookTitle+" Author:"+bookAuthor+" ISBN:"+bookIsBN+" Quantity:"+numOfCopies);         
                
    }
}
