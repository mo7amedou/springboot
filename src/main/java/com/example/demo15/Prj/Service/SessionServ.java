package com.example.demo15.Prj.Service;
import com.example.demo15.Prj.Dto.SessionDto;
import com.example.demo15.Prj.Entity.Session;
import com.example.demo15.Prj.Repository.SessionRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SessionServ {

    @Autowired
    private SessionRep sessionRep;

    //c
    public SessionDto saveSession(SessionDto sessionDto){
        SessionDto.toDto(sessionRep.save(Session.toEntity(sessionDto)));
        return sessionDto;
    }
    //r
    public List<SessionDto> getAllSession(){
        List<Session> getsession=sessionRep.findAll();
        List<SessionDto> sessionDtoList= new ArrayList<>();
        for (Session s:getsession) {
            sessionDtoList.add(SessionDto.toDto(s));}
        return sessionDtoList;
    }
    //u
    public SessionDto upDateSession(SessionDto sessionDto) {
        if (sessionRep.existsById(sessionDto.getIdss())) {
            return SessionDto.toDto(sessionRep.save(Session.toEntity(sessionDto)));
        } else {
            System.out.println("session id not exist");
        }
        return null;
    }
    //d
    public Boolean deleteSession(Integer id){
        if (sessionRep.existsById(id)){
            sessionRep.deleteById(id);
        }
        else {
            System.out.println("session id not exist");
        }
        return false;
    }
}
