package com.example.demo15.Prj.Service;
import com.example.demo15.Prj.Dto.TeacherDto;
import com.example.demo15.Prj.Entity.Teacher;
import com.example.demo15.Prj.Repository.TeacherRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServ {

    @Autowired
    private TeacherRep teacherRep;

    //c
    public TeacherDto saveTeacher(TeacherDto teacherDto){
        TeacherDto.toDto(teacherRep.save(Teacher.toEntity(teacherDto)));
        return teacherDto;
    }
    //r
    public List<TeacherDto> getAllTeacher(){
        List<Teacher> getteacher=teacherRep.findAll();
        List<TeacherDto> teacherDtoList= new ArrayList<>();
        for (Teacher t:getteacher) {
            teacherDtoList.add(TeacherDto.toDto(t));}
        return teacherDtoList;
    }
    //u
    public TeacherDto upDateTeacher(TeacherDto teacherDto) {
        if (teacherRep.existsById(teacherDto.getIdt())) {
            return TeacherDto.toDto(teacherRep.save(Teacher.toEntity(teacherDto)));
        } else {
            System.out.println("teacher id not exist");
        }
        return null;
    }
    //d
    public Boolean deleteTeacher(Integer id){
        if (teacherRep.existsById(id)){
            teacherRep.deleteById(id);
        }
        else {
            System.out.println("teacher id not exist");
        }
        return false;
    }
}
