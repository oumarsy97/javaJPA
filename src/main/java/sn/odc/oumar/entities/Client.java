package sn.odc.oumar.entities;


import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clients")
public class Client  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // la clé primaire auto générée par la base de données
    private int id;

    @Column(nullable = false, unique = true)
   private String surnom;


    private String telephone ;
    private String adresse;

}
