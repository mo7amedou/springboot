package com.example.demo15.Prj.Dto;
import com.example.demo15.Prj.Entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDto {
    private Integer idt;
    private Integer idpay;
    private Integer idprp;
    private String fullName;
    private Integer number;
    private String gender;

    public Integer getIdt() {
        return idt;
    }

    public void setIdt(Integer idt) {
        this.idt = idt;
    }

    public Integer getIdpay() {
        return idpay;
    }

    public void setIdpay(Integer idpay) {
        this.idpay = idpay;
    }

    public Integer getIdprp() {
        return idprp;
    }

    public void setIdprp(Integer idprp) {
        this.idprp = idprp;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public static TeacherDto toDto(Teacher teacher){
        return TeacherDto.builder().
                idt(teacher.getIdt()).
                idpay(teacher.getIdpay()).
                idprp(teacher.getIdprp()).
                fullName(teacher.getFullName()).
                number(teacher.getNumber()).
                gender(teacher.getGender()).
                build();
    }

}
