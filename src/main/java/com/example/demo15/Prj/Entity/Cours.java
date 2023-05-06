package com.example.demo15.Prj.Entity;
import com.example.demo15.Prj.Dto.CoursDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "course")
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cours {

    @Id
    @GeneratedValue
    @Column(name = "idc")
    private Integer idc;
    @Column(name = "idd")
    private Integer idd;
    @Column(name = "idh")
    private Integer idh;
    @Column(name = "idty")
    private Integer idty;
    @Column(name = "idt")
    private Integer idt;
    @Column(name = "idl")
    private Integer idl;
    @Column(name = "fullname")
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

    public static Cours toEntity(CoursDto coursDto){
        return Cours.builder().
                idc(coursDto.getIdc()).
                idd(coursDto.getIdd()).
                idh(coursDto.getIdh()).
                idty(coursDto.getIdty()).
                idt(coursDto.getIdt()).
                idl(coursDto.getIdl()).
                fullName(coursDto.getFullName()).
                build();
    }
}
