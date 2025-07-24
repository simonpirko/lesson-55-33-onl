package by.tms.lesson5533onl.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_accounts")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String username;
    private String password;
}
