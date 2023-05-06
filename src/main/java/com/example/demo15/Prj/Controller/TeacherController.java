package com.example.demo15.Prj.Controller;
import com.example.demo15.Prj.Dto.TeacherDto;
import com.example.demo15.Prj.Service.TeacherServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

    @Autowired
    private TeacherServ teacherServ;

    @PostMapping(path = "/saveTeacher")
    public TeacherDto saveTeacher(@RequestBody TeacherDto teacherDto) //throws Exception
    {
       /* if(teacherDto.getFullName().equals("") || teacherDto.getFullName() == null ||
                teacherDto.getNumber().equals("")|| teacherDto.getNumber()==null){
            throw new Exception("teacher name or number is empty");
        }*/
        return teacherServ.saveTeacher(teacherDto);
    }
    @GetMapping(path="/getAllTeacher")
    public List<TeacherDto> getAllStudent(){
        return teacherServ.getAllTeacher();
    }
    @PutMapping(path = "/updateTeacher/{idt}")
    public TeacherDto upDateTeacher(@PathVariable(value = "idt") Integer idt ,@RequestBody TeacherDto teacherDto){
        System.out.println(""+idt);
        return teacherServ.upDateTeacher(teacherDto);
    }
    @DeleteMapping( path = "/deleteTeacher/{idt}")
    public String deleteTeacher(@PathVariable(value = "idt") Integer idt){
        boolean deleteTeacher= teacherServ.deleteTeacher(idt);
        return "deleted";
    }
}
