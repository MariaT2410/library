import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oracle.deploy.update.UpdateCheck;

import java.awt.print.Book;
import java.util.List;
import java.util.Scanner;

public class Aplication {


    public static void main(String[] args) throws Exception {
         Library booksView = new Library();
         Scanner in = new Scanner(System.in);

        System.out.println("Enter autor id: ");
        int autorId = in.nextInt();


        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();



        //FactoryLibrary f = FactoryLibrary.getInstance();
        injector.getInstance(FactoryLibrary.class).library(capacity));
    }
}
