package com.example.demo15.Prj.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Table(name = "inscription")
@Entity
@Data
@NoArgsConstructor
public class Inscription {
    @Id
    @GeneratedValue
    @Column(name = "idi")
    private Integer idi;
    @Column(name = "idss")
    private Integer idss;
    @Column(name = "idst")
    private Integer idst;
    @Column(name = "idl")
    private Integer idl;
    @Column(name = "dateInscription")
    private LocalDate dateInscription;
    @Column(name = "montenPaye")
    private Integer montenPaye;
}
