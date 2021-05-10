/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookstoreapp;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class BookStore {
    //Book[] books = new Book[10];
    ArrayList<Book> books = new ArrayList<Book>();
   
    void order(String bookTitle,String bookAuthor,String isbn,int numOfCopies){
       int a = 0;
        for(int i=0; i<books.size();i++)
        {
            Book bk = books.get(i);
            if(bk.bookIsBN == isbn )
            {
                bk.numOfCopies += numOfCopies;
                a = 1;
            }
            
        }
        if(a==0)
            {
                Book book = new Book( bookTitle, bookAuthor, isbn,numOfCopies );
                books.add(book);
            }
    }
    
    void sell(String bookTitle, int numOfCopies){      
        //loop over the Array//
        for(int i = 0;i<books.size();i++)
        {
            Book bk = books.get(i);
            if(bk.bookTitle == bookTitle)
            {
                bk.numOfCopies -= numOfCopies; 
            }
        }
            
        }
    
      void display(){
        
        for(int i=0; i<books.size();i++){
            
           Book bk = books.get(i);
           bk.display(); 
        }
      }
    }  
        
    
    

