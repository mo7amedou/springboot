package com.example.demo15.Prj.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "paymentTeacher")
@Entity
@Data
@NoArgsConstructor
public class PaymentTeacher {
    @Id
    @GeneratedValue
    @Column(name = "idpay")
    private Integer idpay;
    @Column(name = "houlyRate")
    private Double houlyRate;
    @Column(name = "hourWorked")
    private Integer hourWorked;
    @Column(name = "totalpay")
    private Integer totalpay;


}
