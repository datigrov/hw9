public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return "Автор произведения : " + name + " " + surname;
    }

    public int hashCode() {
        return java.util.Objects.hashCode(surname);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null) {
            return false;
        }
        return false;
    }
}




