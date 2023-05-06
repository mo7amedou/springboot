package com.example.demo15.Prj.Entity;
import com.example.demo15.Prj.Dto.TeacherDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "teacher")
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue
    @Column(name = "idt")
    private Integer idt;
    @Column(name = "idpay")
    private Integer idpay;
    @Column(name = "idprp")
    private Integer idprp;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "number")
    private Integer number;
    @Column(name = "gender")
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

    public static Teacher toEntity(TeacherDto teacherDto){
        return Teacher.builder().
                idt(teacherDto.getIdt()).
                idpay(teacherDto.getIdpay()).
                idprp(teacherDto.getIdprp()).
                fullName(teacherDto.getFullName()).
                number(teacherDto.getNumber()).
                gender(teacherDto.getGender()).
                build();
    }
}
