package cl.praxis.biblioteca2.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id", nullable = false,unique = true)
    private int idUser;
    @Column(name = "user_name",nullable = false,length = 50)
    private String userName;
    @Column(name="first_name", nullable = false, length = 50)
    private String firstname;
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;
    @Column(name="mail", nullable = false, unique = true)
    private String mail;
    @Column(name="age")
    private int age;
}
