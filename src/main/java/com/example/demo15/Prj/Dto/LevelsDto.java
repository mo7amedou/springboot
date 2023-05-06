package com.example.demo15.Prj.Dto;
import com.example.demo15.Prj.Entity.Levels;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LevelsDto {
    private Integer idl;
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

    public static LevelsDto toDto(Levels levels){
        return LevelsDto.builder().
                idl(levels.getIdl()).
                fullName(levels.getFullName()).
                build();
    }
}
