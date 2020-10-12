import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Library {

    FactoryLibrary l = new FactoryLibrary(5555, "Библиотека", 32);



    private static final int BOOKS_SIZE = 340;
    private static final int AUTORS_SIZE = 50;

    private static Map<Integer, Book> books = new HashMap<Integer, Book>();
    private static Map<Integer, Autor> autors = new HashMap<Integer, Autor>();
    private AtomicInteger numberOfId;


    private final Random random = new Random();

    private void populateBooks() throws Exception {
        if (l.getCounterCell() < BOOKS_SIZE) {
            throw new Exception("Мало ячеек для заполнеия");
        } else{
            for (int i = 0; i < BOOKS_SIZE; i++) {
                Book d = new Book(numberOfId.getAndIncrement(), "Book  " + i, random.nextInt(AUTORS_SIZE));
                books.put(d.getId(), d);
            }
        }

    }



    private void populateAutors() {
        for (int i = 0; i < AUTORS_SIZE; i++) {
            Autor d = new Autor(numberOfId.getAndIncrement(), "Autor  " + i);
            autors.put(d.getId(), d);
        }
    }

    public List<Book> getBooksByAutorId(int idAutor) {
        Collection<Book> c = books.values();
        List<Book> list = new ArrayList<Book>(c);
        List<Book> booksGet = new ArrayList<>();
        for (Book book : list) {
            if (book.getId() == idAutor) {
                booksGet.add(book);
            }
        }
        return booksGet;
    }
    public void addBook(Book book){
        Optional<Map.Entry<Integer, Book>> m = books.entrySet().stream()
                .filter(entry -> entry.getValue().equals(null))
                .findFirst();
        showConsole(books.put(m.get().getKey(), book));
    }


    public void takeBook(int numberCell){
        showConsole(books.get(numberCell));
        books.replace(numberCell, null);

    }
    public void showConsole(Object o){
        System.out.println("Book");
        System.out.println("Book: " + o);
    }

}
