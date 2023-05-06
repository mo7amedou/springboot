package com.example.demo15.Prj.Controller;
import com.example.demo15.Prj.Dto.LevelsDto;
import com.example.demo15.Prj.Service.LevelsServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/levels")
public class LevelsController {


    @Autowired
    private LevelsServ levelsServ;

    @PostMapping(path = "/saveLevel")
    public LevelsDto saveLevels(@RequestBody LevelsDto levelsDto) //throws Exception
    {
       /* if(levelsDto.getFullName().equals("") || levelsDto.getFullName() == null){
            throw new Exception("level name is empty");
        }*/
        return levelsServ.saveLevels(levelsDto);
    }
    @GetMapping(path="/getAllLevels")
    public List<LevelsDto> getAllLevels(){
        return levelsServ.gelAllLevels();
    }
    @PutMapping(path = "/updateLevel/{idl}")
    public LevelsDto upDateLevels(@PathVariable(value = "idl") Integer idl ,@RequestBody LevelsDto levelsDto){
        System.out.println(""+idl);
        return levelsServ.upDateLevels(levelsDto);
    }
    @DeleteMapping( path = "/deleteLevels/{idl}")
    public String deleteLevels(@PathVariable(value = "idl") Integer idl){
        boolean deleteLevels= levelsServ.deleteLevels(idl);
        return "deleted";
    }
}
