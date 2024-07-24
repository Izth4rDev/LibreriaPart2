package cl.praxis.biblioteca2.service.serviceImp;
import cl.praxis.biblioteca2.entity.Book;
import cl.praxis.biblioteca2.repository.IBookRepository;
import cl.praxis.biblioteca2.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImp implements IBookService {
    @Autowired
    IBookRepository iBookRepository;

    @Override
    public List<Book> getBooks() {
        return iBookRepository.findAll();
    }
}
