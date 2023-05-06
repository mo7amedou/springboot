package com.example.demo15.Prj.Dto;
import com.example.demo15.Prj.Entity.Cours;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoursDto {
    private Integer idc;
    private Integer idd;
    private Integer idh;
    private Integer idty;
    private Integer idt;
    private Integer idl;
    private String fullName;

    public Integer getIdc() {
        return idc;
    }

    public void setIdc(Integer idc) {
        this.idc = idc;
    }

    public Integer getIdd() {
        return idd;
    }

    public void setIdd(Integer idd) {
        this.idd = idd;
    }

    public Integer getIdh() {
        return idh;
    }

    public void setIdh(Integer idh) {
        this.idh = idh;
    }

    public Integer getIdty() {
        return idty;
    }

    public void setIdty(Integer idty) {
        this.idty = idty;
    }

    public Integer getIdt() {
        return idt;
    }

    public void setIdt(Integer idt) {
        this.idt = idt;
    }

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

    public static CoursDto toDto(Cours cours){
        return CoursDto.builder().
                idc(cours.getIdc()).
                idd(cours.getIdd()).
                idh(cours.getIdh()).
                idty(cours.getIdty()).
                idt(cours.getIdt()).
                idl(cours.getIdl()).
                fullName(cours.getFullName()).
                build();
    }
}
