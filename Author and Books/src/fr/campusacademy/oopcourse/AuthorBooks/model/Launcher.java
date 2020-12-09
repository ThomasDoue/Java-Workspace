package fr.campusacademy.oopcourse.AuthorBooks.model;
import fr.campusacademy.oopcourse.AuthorBooks.model.Author;
import fr.campusacademy.oopcourse.AuthorBooks.model.Books;

public class Launcher {

    public static void main(String[] args) {

        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'M');
        
        System.out.println(anAuthor.getName());
        System.out.println(anAuthor.getEmail());
        System.out.println(anAuthor.getGender());
        
        System.out.println(anAuthor);
        
        System.out.println("");

        Books aBook = new Books("Java for dummy", anAuthor, 19.95, 1000);
        Books anotherBook = new Books("more Java for dummy", new Author("Tan Ah Teck", "ahteck@somewhere.com", 'M'), 29.95, 888);
        
        System.out.println(aBook.getName());
        System.out.println(aBook.getAuthor());
        System.out.println(aBook.getPrice());
        System.out.println(aBook.getQtyInStock());

        System.out.println(aBook);
        
        System.out.println("");
        
        System.out.println(anotherBook.getName());
        System.out.println(anotherBook.getAuthor());
        System.out.println(anotherBook.getPrice());
        System.out.println(anotherBook.getQtyInStock());

        System.out.println(anotherBook);
    }

}