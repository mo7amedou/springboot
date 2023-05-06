package com.example.demo15.Prj.Entity;
import com.example.demo15.Prj.Dto.SessionDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Table(name = "sessions")
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    @Id
    @GeneratedValue
    @Column(name = "idss")
    private Integer idss;
    @Column(name = "dated")
    private Date dated;
    @Column(name = "datef")
    private Date datef;

    public Integer getIdss() {
        return idss;
    }

    public void setIdss(Integer idss) {
        this.idss = idss;
    }

    public Date getDated() {
        return dated;
    }

    public void setDated(Date dated) {
        this.dated = dated;
    }

    public Date getDatef() {
        return datef;
    }

    public void setDatef(Date datef) {
        this.datef = datef;
    }

    public static Session toEntity(SessionDto sessionDto){
        return Session.builder().
                idss(sessionDto.getIdss()).
                dated(sessionDto.getDated()).
                datef(sessionDto.getDatef()).
                build();
    }
}
