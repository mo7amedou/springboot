package com.example.demo15.Prj.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Table(name = "noteCours")
@Entity
@Data
@NoArgsConstructor
public class NoteCourse {
    @Id
    @GeneratedValue
    @Column(name = "idnc")
    private Integer idnc;
    @Column(name = "idc")
    private Integer idc;
    @Column(name = "idst")
    private Integer idst;
    @Column(name = "datee")
    private Date datee;
    @Column(name = "note")
    private Double note;
    @Column(name = "type")
    private String type;
    @Column(name = "finalnote")
    private Double finalNote;
    @Column(name = "score")
    private Double score;
}
