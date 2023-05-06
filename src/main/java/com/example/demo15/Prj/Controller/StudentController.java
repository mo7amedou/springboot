package com.example.demo15.Prj.Controller;
import com.example.demo15.Prj.Dto.StudentDto;
import com.example.demo15.Prj.Service.StudentServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentServ studentServ;


    @PostMapping(path = "/saveStudent")
    public StudentDto saveStudent(@RequestBody StudentDto studentDto) //throws Exception
    {
       /* if(studentDto.getFullName().equals("") || studentDto.getFullName() == null ||
                studentDto.getNumero().equals("")|| studentDto.getNumero()==null){
            throw new Exception("student name or number is empty");
        }*/
        return studentServ.saveStudent(studentDto);
    }

    @GetMapping(path="/getAllStudent")
    public List<StudentDto> getAllStudent(){
        return studentServ.getAllStudent();
    }

    @PutMapping(path = "/updateStudent/{idst}")
    public StudentDto upDateStudent(@PathVariable(value = "idst") Integer idst ,@RequestBody StudentDto studentDto){
        System.out.println(""+idst);
        return studentServ.upDateStudent(studentDto);
    }

    @DeleteMapping( path = "/deleteStudent/{idst}")
    public void deleteStudent(@PathVariable(value = "idst") Integer idst){
        boolean delete_Student= studentServ.deleteStudent(idst);

    }
}
