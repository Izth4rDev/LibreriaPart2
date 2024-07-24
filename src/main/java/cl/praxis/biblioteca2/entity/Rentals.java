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
public class Rentals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rental", nullable = false, unique = true)
    private int idRental;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Usuario user;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    @Temporal(TemporalType.DATE)
    @Column(name = "rental_date", nullable = false)
    private Date rentalDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "return_date")
    private Date returnDate;
    @Column(name = "returned", nullable = false)
    private boolean returned = false;
}
