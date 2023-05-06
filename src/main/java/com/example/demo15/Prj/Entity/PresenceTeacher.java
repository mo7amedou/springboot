package com.example.demo15.Prj.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Table(name = "presenceTeacher")
@Entity
@Data
@NoArgsConstructor

public class PresenceTeacher {
    @Id
    @GeneratedValue
    @Column(name = "idprp")
    private Integer idprp;
    @Column(name = "datep")
    private Date datep;
    @Column(name = "isPresent")
    private Boolean isPresent;
}
