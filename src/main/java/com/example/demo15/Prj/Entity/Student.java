package com.example.demo15.Prj.Entity;
import com.example.demo15.Prj.Dto.StudentDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "student")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "idst")
    private Integer idst;
    @Column(name = "idprs")
    private Integer idprs;
    @Column(name = "id")
    private Integer id;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "age")
    private Integer age;
    @Column(name = "nni")
    private Integer nni;


    public Integer getIdst() {
        return idst;
    }

    public void setIdst(Integer idst) {
        this.idst = idst;
    }

    public Integer getIdprs() {
        return idprs;
    }

    public void setIdprs(Integer idprs) {
        this.idprs = idprs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNni() {
        return nni;
    }

    public void setNni(Integer nni) {
        this.nni = nni;
    }

    public static Student toEntity(StudentDto studentDto){
        return Student.builder().
                idst(studentDto.getIdst()).
                idprs(studentDto.getIdprs()).
                id(studentDto.getId()).
                fullName(studentDto.getFullName()).
                gender(studentDto.getGender()).
                numero(studentDto.getNumero()).
                age(studentDto.getAge()).
                nni(studentDto.getNni()).
                build();
    }
}
