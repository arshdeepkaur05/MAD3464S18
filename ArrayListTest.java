
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class ArrayListTest {
    public static void main(String args[]){
        
        //int [] productName = new int[6]; which restricts the array size
        ArrayList<String> productsName = new ArrayList<String>();
        
        
        productsName.add("Projector");
        productsName.add("Excel");
        productsName.add("Contigo");
        productsName.add("Apple");
        productsName.add("Samsung");
        
        productsName.add(2,"Oracle");
        
        for(String raman : productsName){
            System.out.println(raman);
        }
        
        System.out.println("========");
        
        if(productsName.contains("Oracle")){    
        
        productsName.remove("Oracle");
        }
        else{
            System.out.println("Buy Oracle First");
        }
        Collections.sort(productsName);
         System.out.println("========");
        
        
        for(String raman : productsName){
            System.out.println(raman);
        }
        
        
        ArrayList<Books> Library = new ArrayList<Books>();
        Books Book1 = new Books(101,"the sky is falling" , 9);
        Books Book2 = new Books(102,"pride and prejudice", 6);
        Books Book3 = new Books(103,"the monk", 7);
        Books Book4 = new Books(104,"courage", 12);
        
        Library.add(Book1);
        Library.add(Book2);
        Library.add(Book3);
        Library.add(Book4);
        
        for(Books bk : Library){    // iteration method
            bk.DisplayInfo();
        }
        
        System.out.println(" No of books in library : " + Library.size());
        
        if(Library.contains(Book2)){
            Library.remove(Book2);
        }
        
      System.out.println(" No of books in library : " + Library.size());//library.size is to check how many books are present in lib
      
      Library.add(2,new Books(120,"Perals",11));
      
    
        
        Collections.sort(Library, new BookTitleComparator());
        for(Books bk : Library){    // iteration method
            bk.DisplayInfo();
        }
        Collections.sort(Library, new BookRatingComaparator());
           for(Books bk : Library){   
            bk.DisplayInfo(); 
           }
        
    }}
    

