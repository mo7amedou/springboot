package com.example.demo15.Prj.Entity;
import com.example.demo15.Prj.Dto.LevelsDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "levels")
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Levels {
    @Id
    @GeneratedValue
    @Column(name = "idl")
    private Integer idl;
    @Column(name = "fullname")
    private String fullName;

    public Integer getIdl() {
        return idl;
    }

    public void setIdl(Integer idl) {
        this.idl = idl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public static Levels toEntity(LevelsDto levelsDto){
        return Levels.builder().
                idl(levelsDto.getIdl()).
                fullName(levelsDto.getFullName()).
                build();
    }
}
