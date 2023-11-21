/**
 * Welcome to the Library Management System Project in Java!
 *
 * This project aims to develop a straightforward yet robust in-memory system for managing a library's catalogue. The system
 * facilitates various operations such as adding books, checking them in and out, searching for books, and efficiently
 * managing book availability. Leveraging key data structures, including hash tables, queues, and binary trees, we aim to
 * deliver an organized and user-friendly environment for both library staff and patrons.
 *
 * **Project Collaborators:**
 *
 * - **Eddy Kubwimana
 * - ** Clovis Mushagalusa Cirubakadhera
 * - ** Cajetan Songwae
 * - ** Muhammed Habib Soumahoro
 * - *Email:* eddy.kubwimana@ashesi.edu.gh
 * - *Email :
 * - *Email :
 * - *Email :
 * 

 *   - *GitHub:* https://github.com/EddyKubwimana/Book-catalogue-management
 *
 * - **UI/UX Designer:** Jane Smith
 *   - *Email:* eddy.kubwimana@ashesi.edu.gh
 *
 * **Core Features and Design Choices:**
 *
 * 1. **Catalogue Management:**
 *    - Utilizes a hash table for efficient management of the book catalogue, ensuring quick retrieval of book information.
 *
 * 2. **Checkout System:**
 *    - Implements a queue system to handle book checkouts and returns in a first-come, first-served manner.
 *
 * 3. **Search Functionality:**
 *    - Empowers users to search for books by title, author, or ISBN using efficient search algorithms for a seamless experience.
 *
 * 4. **Book Availability:**
 *    - Utilizes a binary tree to keep track of available and checked-out books, ensuring efficient updates on book status.
 *
 * 5. **User Interface:**
 *    - Provides a simple text-based Command Line Interface (CLI) for users to interact with the library management functionalities.
 *
 * **Expected Outcomes:**
 *
 * - Demonstrates the appropriate use of data structures for efficient book management and user interactions.
 * - Handles book checkouts and availability updates in real-time, providing users with up-to-date information.
 * - Provides comprehensive documentation explaining design choices and complexity analysis for the implemented features.
 *
 * We look forward to the successful development of this Library Management System, contributing to an organized and
 * user-friendly environment for library patrons. For updates and contributions, please refer to the GitHub repository:
 * https://github.com/EddyKubwimana/Book-catalogue-management
 *
 * Thank you for your collaboration and dedication to this project!
 */
public class Book{


    //instance variables for book object

    private String authorFirstName;
    private String authorLastName;
    private String ISBN;
    static int numberBook = 0;
    private String bookTitle;
    private String bookSummary;
    
    // constructor
    public Book(String authFirst, String autLast, String ISBN, String title, String summary){

        this.authorFirstName = authFirst;
        this.authorLastName = autLast;
        this.ISBN = ISBN;
        this.bookTitle = title;
        Book.numberBook+=1;
        this.bookSummary = summary;
    }


    public String toString(){


        return "Author : "+ this.authorFirstName+" ISBN :"+this.authorLastName+" Book  Title:"+ this.bookTitle;

    }




    public static void main(String[]args){
    
      String a= new Book("Eddy","Kubwimana","84092025","Capitalism"," jdjdjdjdj").authorFirstName;


   System.out.println(Book.numberBook);


    }






}