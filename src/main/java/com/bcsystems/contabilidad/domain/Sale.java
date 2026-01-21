package com.bcsystems.contabilidad.domain;

import com.bcsystems.contabilidad.domain.en.PurchaseStatus;
import com.bcsystems.contabilidad.domain.en.SaleType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/*
* En esta clase se modela una venta, la cual contiene la fecha, tipo de venta (CREDITO/DEBITO), estatus
* de la venta, total de la venta, vendedor y cobrador (nulleable).
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sale")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private LocalDate fecha;
    @Enumerated(EnumType.STRING)
    private SaleType saleType;
    @Enumerated(EnumType.STRING)
    private PurchaseStatus saleStatus;
    @Column(nullable = false)
    private Float total;
    @ManyToOne
    @JoinColumn(name = "id_vendedor")
    private Employee vendedor;
    @ManyToOne
    @JoinColumn(name = "id_cobrador", nullable = true)
    private Employee cobrador;

}
