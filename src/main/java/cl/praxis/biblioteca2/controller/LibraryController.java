package cl.praxis.biblioteca2.controller;
import cl.praxis.biblioteca2.entity.Book;
import cl.praxis.biblioteca2.service.serviceImp.BookServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class LibraryController {
    @Autowired
    BookServiceImp bookServiceImp;
    @GetMapping("/")
    public String getBooks(Model model){
        List<Book> books = bookServiceImp.getBooks();
        model.addAttribute("books", books);
        return "index";
    }
}
