import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Library {

    private   int id;
    private  String name;
    private int counterCell;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCounterCell() {
        return counterCell;
    }

    public void setCounterCell(int counterCell) {
        this.counterCell = counterCell;
    }

    public Library() {
    }

    //сщздать библиотеку заданной вмнстимости counterCell
    public Library(int id, String name, int counterCell) {
        this.id = id;
        this.name = name;
        this.counterCell = counterCell;
    }
}
