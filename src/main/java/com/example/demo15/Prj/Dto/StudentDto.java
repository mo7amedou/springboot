package com.example.demo15.Prj.Dto;
import com.example.demo15.Prj.Entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Integer idst;
    private Integer idprs;
    private Integer id;
    private String fullName;
    private String gender;
    private Integer numero;
    private Integer age;
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

    public static StudentDto toDto(Student student){
        return StudentDto.builder().
                idst(student.getIdst()).
                idprs(student.getIdprs()).
                id(student.getId()).
                fullName(student.getFullName()).
                gender(student.getGender()).
                numero(student.getNumero()).
                age(student.getAge()).
                nni(student.getNni()).
                build();
    }
}
