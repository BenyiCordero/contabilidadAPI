package com.bcsystems.contabilidad.domain;

import com.bcsystems.contabilidad.domain.en.CardType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* En esta clase definimos las tarjetas, las cuales tendran id, banco, ultimos 4 digitos, tipo de tarjeta
* debito o credito, y activas o no activas
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_card;
    @Column(length = 50, nullable = false)
    private String banco;
    @Column(length = 4, nullable = false)
    private String digitos;
    @Enumerated(EnumType.STRING)
    private CardType cardType;
    private Boolean activa = true;

}
