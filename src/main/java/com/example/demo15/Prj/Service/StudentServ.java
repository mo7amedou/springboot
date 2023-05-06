package com.example.demo15.Prj.Service;


import com.example.demo15.Prj.Dto.StudentDto;
import com.example.demo15.Prj.Entity.Student;
import com.example.demo15.Prj.Repository.StudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServ {

    @Autowired
    private StudentRep studentRep;

    //c
    public StudentDto saveStudent(StudentDto studentDto){
            StudentDto.toDto(studentRep.save(Student.toEntity(studentDto)));
            return studentDto;
        }
    //r
    public List<StudentDto> getAllStudent(){
            List<Student> getstudent=studentRep.findAll();
            List<StudentDto> studentDtoList= new ArrayList<>();
           for (Student s:getstudent) {
               studentDtoList.add(StudentDto.toDto(s));
           }
            return studentDtoList;
        }
    //u
    public StudentDto upDateStudent(StudentDto studentDto) {
            if (studentRep.existsById(studentDto.getIdst())) {
                return StudentDto.toDto(studentRep.save(Student.toEntity(studentDto)));

            } else {
                System.out.println("student id not exist");
            }
            return null;
        }
    //d
    public Boolean deleteStudent(Integer id){
        if (studentRep.existsById(id)){
            studentRep.deleteById(id);
        }
        else {
            System.out.println("student id not exist");
        }
        return false;
    }
}
