package SpringCoreExercise1.LibraryManagement.src.main.java.org.example;


import SpringCoreExercise1.LibraryManagement.src.main.java.org.example.repository.BookRepository;
import SpringCoreExercise1.LibraryManagement.src.main.java.org.example.service.BookService;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        BookRepository repository =
                context.getBean("bookRepository", BookRepository.class);

        service.showService();
        repository.displayBook();

    }
}