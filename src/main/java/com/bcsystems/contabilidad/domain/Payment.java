package com.bcsystems.contabilidad.domain;

import com.bcsystems.contabilidad.domain.en.PaymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/*
* En esta clase modelamos el pago, ya sea pago a alguna tarjeta, o alguna venta, o gasto,
* guarda el monto y la venta, junto con el tipo de pago, y si es tipo de pago en tarjeta, ligamos
* la tarjeta tambien, la cual puede ser null.
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_payment;
    @Column(nullable = false)
    private Float monto;
    @Column(nullable = false)
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "id_sale", nullable = true)
    private Sale sale;
    @ManyToOne
    @JoinColumn(name = "id_expense", nullable = true)
    private Expense expense;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    @ManyToOne
    @JoinColumn(name = "id_card", nullable = true)
    private Card card;

}
