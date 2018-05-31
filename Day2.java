/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Day2 {
    
    public static void main(String args[]){
        int n1 = 10;
        
        if (n1 % 2 == 0) 
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
            
        }
        
        char pass ='A';
        
        switch(pass){
            case 'A':
            System.out.println("Adlut pass : valid pass");
            break;
            case 'S':
                System.out.println("Student pass : valid pass");
                break;
            case 'O':
                System.out.println("Senior Citizen : valid pass");
                break;
            default :
                System.out.println("Invalid pass");
                break;
        }
        
        switch(10+20)
        {
            case 10 :
                System.out.println("value is 10");
                break;
            case 20 :
                System.out.println("value is 20");
                break;
            case 30:
                System.out.println("value is 30");
                break;
            default :
                System.out.println("invalid value");
                break;
                
        }
            String province = "ON";
            switch (province)
        {
            case "ON" :
                System.out.println("ontario");
                break;
            case "NV" :
                System.out.println("Nova Scotia");
                break;
            default :
                System.out.println("invalid province");
                break;
        }
            //itereration method
          n1 = 20;
          while(n1>10){  
              System.out.println("n1 : " +n1);
               n1--;
              
          }
          //--------------------------------------
           do{
               System.out.println("n1 : " +n1);
               n1--;
           }
           while(n1 >10);
           //------------------------------------
           
           int i=0;          
           for( ; ; ) 
           {
               if (i<5){
               System.out.println(" i : " + i++);
           }
               else{
           break;
           }}
           
           int m=0;          
           for( m=1; m<=5 ; m++ ) 
           {
               if (m==3){
                   continue;
               }
               else{
               System.out.println(" m : " + m);
           }
               
           }
           
           // pattern of stars 
           for (i=1 ;i<=5 ;i++)
           {
               for(int j=1; j<=i ;j++)
               {
                   System.out.print(" * ");
                   
               }
               System.out.println("");
           }
           
           //pattern of stars in triangle
     for (i=1 ;i<=5 ;i++)
           {
               for(int space = 5 ; space>i ;space--){
                   System.out.print(" ");
               }
               for(int j=1; j<=i ;j++)
               {
                   System.out.print(" * ");
                   
               }
               System.out.println("");
           }
               
              //pattern of stars in upside triangle
        for (i=1 ;i<=5 ;i++)
           {
               for(int j=1; j<=i ;j++)
               {
                   System.out.print(" ");
               }
               for(int space = 5 ; space>i ;space--)
               
               {
                   System.out.print(" * ");
                   
               }
               System.out.println("");
               
           }
        int numbers[] = new int[5];
        numbers[0] = 10;
        System.out.println(" numbers [0] :" + numbers[0]);
        
        for (i=0; i<5; i++){
            numbers[i] = (int)Math.pow((i+1),2);
            System.out.println("numbers [" +i+"] : " + numbers[i]);
        }
         
        for (i=0 ;i<numbers.length ; i++)
        {
            System.out.println("value " + (i+1) + ":" + (numbers[i]*10));
    
            
        }
        for(int no : numbers)
           {
          System.out.println("no :" + no);
    
        }
        int table[][] = new int[5][3];
        for (int row=0; row<5 ; row++){
            for(int col=0 ;col<3 ; col++){
                table [row][col] = row+col;
                System.out.print(table[row][col]+ " ");
            }
            System.out.println("");
        }
    }
    
    }

    

