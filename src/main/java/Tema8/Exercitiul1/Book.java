package Tema8.Exercitiul1;

public class Book {

    // Exercitiul 1
    //Creează clasa Book:
    //- atribute private: title, author
    //- getter + setter pentru fiecare
    //- în main: creează obiect, setează valori, afișează-le

    private String title;
    private String author;


    public String getTitle(){
        return title;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public static void main(){

        Book book = new Book();

        book.setTitle("Amintiri din copilarie");
        String title1 = book.getTitle();
        System.out.println(title1);


        book.setAuthor("Ion Creanga");
        String author1 = book.getAuthor();
        System.out.println(author1);


    }

}
