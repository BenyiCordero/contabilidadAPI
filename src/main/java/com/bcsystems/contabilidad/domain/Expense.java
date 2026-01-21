package com.bcsystems.contabilidad.domain;

import com.bcsystems.contabilidad.domain.en.ExpenseTypeET;
import com.bcsystems.contabilidad.domain.en.ExpenseStatus;
import com.bcsystems.contabilidad.domain.en.ExpenseType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/*
* Tenemos la clase gasto, la cual tiene su id, tipo de gasto, estatus del gasto, descripcion, fecha,
* monto, y tarjeta, solo se manejan gastos todo(tengo que agregar enum para decidir si es contado o credito,
*                                           entonces ahi poder hacer pagos tambien, ingresar a payment esta
*                                           expense...)
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "expense")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_expense;
    @Enumerated(EnumType.STRING)
    private ExpenseType expenseType;
    @Enumerated(EnumType.STRING)
    private ExpenseStatus expenseStatus;
    @Enumerated(EnumType.STRING)
    private ExpenseTypeET expenseTypeET;
    @Column(length = 50)
    private String description;
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false)
    private Float monto;
    @ManyToOne
    @JoinColumn(name = "id_card", nullable = true)
    private Card card;

}
