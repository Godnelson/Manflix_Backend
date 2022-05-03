package com.senai.manflix.model;

import lombok.*;
import org.springframework.lang.NonNull;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Table(name = "User")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private Date dataNascimento;
    @Column(nullable = false)
    private String senha;

    public User() {
    }
}
