package com.example.demo15.Prj.Controller;
import com.example.demo15.Prj.Dto.SessionDto;
import com.example.demo15.Prj.Service.SessionServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/session")
public class SessionController {
    @Autowired
    private SessionServ sessionServ;

    @PostMapping(path = "/saveSession")
    public SessionDto saveSession(@RequestBody SessionDto sessionDto) //throws Exception
    {
        /*if(sessionDto.getDated().equals("") || sessionDto.getDated() == null ||
                sessionDto.getDatef().equals("") || sessionDto.getDatef() == null){
            throw new Exception("date is empty");
        }*/
        return sessionServ.saveSession(sessionDto);
    }
    @GetMapping(path="/getAllSession")
    public List<SessionDto> getAllSession(){
        return sessionServ.getAllSession();
    }
    @PutMapping(path = "/updateSession/{idss}")
    public SessionDto upDateSession(@PathVariable(value = "idss") Integer idss ,@RequestBody SessionDto sessionDto){
        System.out.println(""+idss);
        return sessionServ.upDateSession(sessionDto);
    }
    @DeleteMapping( path = "/deleteSession/{idss}")
    public String deleteSession(@PathVariable(value = "idss") Integer idss){
        boolean deleteSession= sessionServ.deleteSession(idss);
        return "deleted";
    }
}
