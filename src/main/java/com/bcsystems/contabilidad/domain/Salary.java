package com.bcsystems.contabilidad.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/*
* En esta clase se modela el salario de los empleados, todo esto para sacar las nominas, contiene
*                                                       fecha de inicio, fecha de fin trabajado, monto,
*                                                       si esta pagado y se liga a los empleados.
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_sueldo;
    @Column(nullable = false)
    private LocalDate fechaInicio;
    @Column(nullable = false)
    private LocalDate fechaFin;
    @Column(nullable = false)
    private Float monto;
    @Column(nullable = false)
    private Boolean pagado = false;
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee employee;

}
