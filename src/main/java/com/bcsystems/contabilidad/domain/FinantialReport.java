package com.bcsystems.contabilidad.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

/*
* En esta clase modelamos el reporte financiero, el cual contiene el periodo de inicio, periodo final, total
* de ingresos, total de egresos, comisiones pagadas, comisiones generadas, utilidades del dia, se liga al
* almacen, y fecha de creacion.
* Solamente se guardan los totales
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "finantial_report")
public class FinantialReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_finantial_report;
    @Column(nullable = false)
    private LocalDate periodoInicio;
    @Column(nullable = false)
    private LocalDate periodoFin;
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
    @CreationTimestamp
    @Column(updatable = false, unique = true, nullable = false)
    private LocalDate fecha;

}
