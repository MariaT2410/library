
public class Book {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int id;
    public String name;
    public int authorId;

    public Book(int id, String name, int authorId) {
        this.id = id;
        this.name = name;
        this.authorId = authorId;
    }

    public Book(String name,  int authorId) {
        this.name = name;
        this.authorId = authorId;

    }
}
