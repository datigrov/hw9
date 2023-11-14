import javax.swing.text.Position;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Author danSimmons = new Author("Дэн", "Симмонс");
        Book book = new Book("Террор", danSimmons,2007);

        Author nikolayOstrovskiy = new Author("Николай", "Островский");
        Book book1 = new Book("Как закалялась сталь", nikolayOstrovskiy, 1934);

        book1.setPublicationYear(1955);

        System.out.println(book1);
        System.out.println(danSimmons);

        System.out.println(book.equals(book1));
        System.out.println(danSimmons.equals(danSimmons));



    }
}