import javax.xml.namespace.QName;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(){
    }

    public Book(String name, Author author,int publicationYear) {
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


}



