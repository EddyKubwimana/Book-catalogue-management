/* This project is meant to simulate the library
 * @ co-author EddyKubwimana
 * @ co-author Clovis Mushagalusa Cirubakadhera
 * @ co-author Muhammed
 * @ co-author Cajetan
 * 
 * 
 */
public class Book{


    //instance variables for book object

    private String authorFirstName;
    private String authorLastName;
    private String ISBN;
    private int numberBook = 0;
    private String bookTitle;
    private String bookSummary;
    
    // constructor
    public Book(String authFirst, String autLast, String ISBN, String title, String summary){

        this.authorFirstName = authFirst;
        this.authorLastName = autLast;
        this.ISBN = ISBN;
        this.bookTitle = title;
        this.numberBook+=1;
        this.bookSummary = summary;
    }


    public String toString(){


        return "Author : "+ this.authorFirstName+" ISBN :"+this.authorLastName+" Book  Title:"+ this.bookTitle;

    }




    public static void main(String[]args){
    
   String a= new Book("Eddy","Kubwimana","84092025","Capitalism"," jdjdjdjdj").authorFirstName;


   System.out.println(a);


   



    }






}