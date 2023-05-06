package com.example.demo15.Prj.Service;
import com.example.demo15.Prj.Dto.CoursDto;
import com.example.demo15.Prj.Entity.Cours;
import com.example.demo15.Prj.Repository.CoursRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CoursServ {

    @Autowired
    private CoursRep coursRep;

    //c
    public CoursDto saveCours(CoursDto coursDto){
            CoursDto.toDto(coursRep.save(Cours.toEntity(coursDto)));
            return coursDto;
    }
    //r
    public List<CoursDto> getAllCours(){
        List<Cours> getcours=coursRep.findAll();
        List<CoursDto> coursDtoList= new ArrayList<>();
        for (Cours c:getcours) {
            coursDtoList.add(CoursDto.toDto(c));}
        return coursDtoList;
    }
    //u
    public CoursDto upDateCours(CoursDto coursDto) {
        if (coursRep.existsById(coursDto.getIdc())) {
            return CoursDto.toDto(coursRep.save(Cours.toEntity(coursDto)));
        } else {
            System.out.println("cour id not exist");
        }
        return null;
    }
    //d
    public Boolean deleteCours(Integer id){
        if (coursRep.existsById(id)){
            coursRep.deleteById(id);
        }
        else {
            System.out.println("cour id not exist");
        }
        return false;
    }
}
