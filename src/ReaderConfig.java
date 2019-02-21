import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ReaderConfig {

    @Bean
    public LibraryReader libraryReaderBean(){
        return new LibraryReader(booksRead());
    }

    @Bean
    public ArrayList<Book> booksRead(){
        ArrayList<Book> booksRead = new ArrayList<>();
        booksRead.add(crimeAndPunishmentBean());
        booksRead.add(zeroKBean());
        return booksRead;
    }

    @Bean
    public ArrayList<Book> books(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(warAndPeaceBean());
        books.add(prideAndPrejudiceBean());
        return books;
    }

    @Bean
    public WarAndPeace warAndPeaceBean(){
        return new WarAndPeace();
    }

    @Bean
    public PrideAndPrejudice prideAndPrejudiceBean(){
        return new PrideAndPrejudice();
    }

    @Bean
    public CrimeAndPunishment crimeAndPunishmentBean(){
        return new CrimeAndPunishment();
    }

    @Bean
    public ZeroK zeroKBean(){
        return new ZeroK();
    }
}
