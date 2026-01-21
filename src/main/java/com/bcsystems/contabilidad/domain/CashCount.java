package com.bcsystems.contabilidad.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/*
* Esta es la clase corte, la cual guardara diariamente los datos del dia, como la fecha, total de ingresos,
* total de egresos, comisiones pagadas, comisiones generadas, utilidad del dia, y se tendra el valor del
* almacen.-
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "cashcount")
public class CashCount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cashcount;
    @Column(unique = true)
    private LocalDate fecha;
    @Column(nullable = false)
    private Float totalIngresos;
    @Column(nullable = false)
    private Float totalEgresos;
    @Column(nullable = false)
    private Float comisionesPagadas;
    @Column(nullable = false)
    private Float comisionesGeneradas;
    @Column(nullable = false)
    private Float utilidadDia;
    @ManyToOne
    @JoinColumn(name = "id_vault")
    private Vault vault;

}
