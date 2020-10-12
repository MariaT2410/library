import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.print.Book;
import java.util.List;
import java.util.Scanner;

public class Aplication {


    public static void main(String[] args) {
         Library booksView = new Library();
         Scanner in = new Scanner(System.in);

        System.out.println("Enter autor id: ");
        int autorId = in.nextInt();


        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();




    }
}
