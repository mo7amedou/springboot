package com.example.demo15.Prj.Service;
import com.example.demo15.Prj.Dto.LevelsDto;
import com.example.demo15.Prj.Entity.Levels;
import com.example.demo15.Prj.Repository.LevelsRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LevelsServ {

    @Autowired
    private LevelsRep levelsRep;

    //c
    public LevelsDto saveLevels(LevelsDto levelsDto){
        LevelsDto.toDto(levelsRep.save(Levels.toEntity(levelsDto)));
        return levelsDto;
    }
    //r
    public List<LevelsDto> gelAllLevels(){
        List<Levels> getlevels=levelsRep.findAll();
        List<LevelsDto> levelsDtoList= new ArrayList<>();
        for (Levels l:getlevels) {
            levelsDtoList.add(LevelsDto.toDto(l));}
        return levelsDtoList;
    }
    //u
    public LevelsDto upDateLevels(LevelsDto levelsDto) {
        if (levelsRep.existsById(levelsDto.getIdl())) {
            return LevelsDto.toDto(levelsRep.save(Levels.toEntity(levelsDto)));
        } else {
            System.out.println("level id not exist");
        }
        return null;
    }
    //d
    public Boolean deleteLevels(Integer id){
        if (levelsRep.existsById(id)){
            levelsRep.deleteById(id);
        }
        else {
            System.out.println("level id not exist");
        }
        return false;
    }
}
