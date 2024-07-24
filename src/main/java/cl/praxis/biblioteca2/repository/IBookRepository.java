package cl.praxis.biblioteca2.repository;
import cl.praxis.biblioteca2.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
