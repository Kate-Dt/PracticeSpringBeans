import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        LibraryReader reader = (LibraryReader) context.getBean("libraryReaderBean");
        reader.getBooks().forEach(Book::read);
        reader.getBooksRead().forEach(Book::read);
    }
}
