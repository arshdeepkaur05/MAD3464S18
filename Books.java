
import java.util.Comparator;





//import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Books  {
    int BookID;
    String BookTitle;
    int BookRating;
    //Scanner in = new Scanner(System.in);
    
    Books(){
        this.BookID = 0;
        this.BookTitle = "Unknown";
        this.BookRating = 0;
        
    }
    
    Books(int BookID, String BookTitle, int BookRating){
        this.BookID = BookID;
        this.BookTitle = BookTitle;
        this.BookRating = BookRating;
    }
    void setID(int ID)
    {
        this.BookID= ID;
    }
    int getID(){
        return this.BookID;
    }
    
    
    void setTitle(String Title)
    {
        this.BookTitle= Title;
    }
    String getTitle(){
        return this.BookTitle;
    }
    
    
    void setRating(int Rating)
    {
        this.BookRating=Rating;
    }
    int getRating(){
        return this.BookRating;
    }
    
    void DisplayInfo(){
        System.out.println("BookID : " + this.BookID + " " +"BookTitle : " + this.BookTitle + " " + "BookRating : " + this.BookRating);
    }}
    
    class BookTitleComparator implements Comparator<Books>
    {
        
        public int compare(Books o1, Books o2){
            return o1.BookTitle.compareToIgnoreCase(o2.BookTitle);
        }}
   
        class BookRatingComaparator implements Comparator<Books>
        {
            public int compare(Books o1 ,Books o2){
                if(o1.BookRating == o2.BookRating)
                return 0;
            
                else if(o1.BookRating < o2.BookRating)
                    return 1;
                else
                    return -1;
            }}
        
    
    
    
