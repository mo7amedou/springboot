package com.example.demo15.Prj.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Table(name = "dayCours")
@Entity
@Data
@NoArgsConstructor
public class DayCours {
    @Id
    @GeneratedValue
    @Column(name = "idd")
    private Integer idd;
    @Column(name = "datec")
    private Date datec;
    @Column(name = "name")
    private String name;

}
