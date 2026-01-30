package co.epvtecnologia.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter @Setter
public class User extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     @NotBlank
     @Column(unique = true, nullable = false)
     private String username;
     @NotBlank
     @Column(nullable = false)
     private String password;
     @NotBlank
     private String role;

}
