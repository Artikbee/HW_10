import java.util.Objects;

public class Author {

    private String nameAuthor;
    private String firstName;

    public Author(String nameAuthor, String firstName) {
        this.nameAuthor = nameAuthor;

        this.firstName = firstName;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String toString() {
        return nameAuthor + " " + firstName+" ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameAuthor.equals(author.nameAuthor) && firstName.equals(author.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, firstName);
    }
}

