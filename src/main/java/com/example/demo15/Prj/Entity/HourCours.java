package com.example.demo15.Prj.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalTime;

@Table(name = "hourCours")
@Entity
@Data
@NoArgsConstructor
public class HourCours {
    @Id
    @GeneratedValue
    @Column(name = "idh")
    private Integer idh;
    @Column(name = "hourC")
    private LocalTime hourC;
}
