package com.bcsystems.contabilidad.domain;

import com.bcsystems.contabilidad.domain.en.PurchaseStatus;
import com.bcsystems.contabilidad.domain.en.PurchaseType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/*
* Aqui modelamos una compra interna, con atributos como fecha, total, estatus de la compra (pendiente, pagada,
* cancelada) y el tipo de compra (EFECTIVO/TARJETA), ya que la tarjeta ya dice si es a debito o a credito,
* se liga tambien a tarjeta(nulleable).
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_purchase;
    @Column(nullable = false)
    private LocalDateTime fecha;
    @Column(nullable = false)
    private Float total;
    @Enumerated(EnumType.STRING)
    private PurchaseStatus purchaseStatus;
    @Enumerated(EnumType.STRING)
    private PurchaseType purchaseType;
    @ManyToOne
    @JoinColumn(name = "id_tarjeta", nullable = true)
    private Card card;

}
