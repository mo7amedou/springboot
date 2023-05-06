package com.example.demo15.Prj.Controller;
import com.example.demo15.Prj.Dto.CoursDto;
import com.example.demo15.Prj.Service.CoursServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cours")
public class CoursController {
    @Autowired
    private CoursServ coursServ;

    @PostMapping(path = "/saveCours")
    public CoursDto saveCours(@RequestBody CoursDto coursDto) //throws Exception
    {
        /*if(coursDto.getFullName().equals("") || coursDto.getFullName() == null){
            throw new Exception("Cour name is empty");
        }*/
        return coursServ.saveCours(coursDto);
    }
    @GetMapping(path="/getAllCours")
    public List<CoursDto> getAllCours(){
        return coursServ.getAllCours();
    }
    @PutMapping(path = "/updateCours/{idc}")
    public CoursDto upDateCours(@PathVariable(value = "idc") Integer idc ,@RequestBody CoursDto coursDto){
        System.out.println(""+idc);
        return coursServ.upDateCours(coursDto);
    }
    @DeleteMapping( path = "/deleteCours/{idc}")
    public String deleteCours(@PathVariable(value = "idc") Integer idc){
        boolean deleteCours= coursServ.deleteCours(idc);
        return "deleted";
    }
}
