package cl.praxis.biblioteca2.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book", nullable = false,unique = true)
    private int idBook;
    @Column(name = "tittle", nullable = false, length = 100)
    private String tittle;
    @Column(name = "author", nullable = false, length = 50)
    private String author;
    @Column(name = "isbn", nullable = false, unique = true, length = 150)
    private String isbn;
    @Column(name = "published_date", nullable = false)
    private Date publishedDate;
    @Column(name="genre", nullable = false, length = 50)
    private String genre;
    @Column(name="avaible", nullable = false)
    private Boolean avaible;
}
