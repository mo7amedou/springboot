package com.example.demo15.Prj.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "typeCours")
@Entity
@Data
@NoArgsConstructor
public class TypeCours {
    @Id
    @GeneratedValue
    @Column(name = "idty")
    private Integer idty;
    @Column(name = "type")
    private String type;
    @Column(name = "subject")
    private String subject;
}
