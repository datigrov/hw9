import javax.xml.namespace.QName;
import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book() {
    }

    public Book(String name, Author author, int publicationYear) {
        this.author = author;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationYear);
    }

    public String toString() {
        return "Книга : " + this.name + "." + " Год публикации : " + this.publicationYear;
    }



}






