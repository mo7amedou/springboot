package com.example.demo15.Prj.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "presenceStudent")
@Entity
@Data
@NoArgsConstructor
public class PresenceStudent {
    @Id
    @GeneratedValue
    @Column(name = "idprs")
    private Integer idprs;
    @Column(name = "datep")
    private Date datep;
    @Column(name = "isPresent")
    private Boolean isPresent;
}
