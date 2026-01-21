package com.bcsystems.contabilidad.domain;

import com.bcsystems.contabilidad.domain.en.CommissionStatus;
import com.bcsystems.contabilidad.domain.en.CommissionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/*
* Esta es la clase donde se definen las comisiones, esta tiene su id, se liga al empleado,
* tipo de comision, tiene a la venta, tiene el monto, el estatus de la comision y la fecha.
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "commission")
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_commission;
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee employee;
    @Enumerated(EnumType.STRING)
    private CommissionType commissionType;
    @ManyToOne
    @JoinColumn(name = "id_sale")
    private Sale sale;
    @Column(nullable = false)
    private Float monto;
    @Enumerated(EnumType.STRING)
    private CommissionStatus commissionStatus;
    private LocalDate fecha;

}
