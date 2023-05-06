package com.example.demo15.Prj.Dto;
import com.example.demo15.Prj.Entity.Session;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SessionDto {
    private Integer idss;
    private Date dated;
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

    public static SessionDto toDto(Session session){
        return SessionDto.builder().
                idss(session.getIdss()).
                dated(session.getDated()).
                datef(session.getDatef()).
                build();
    }
}
