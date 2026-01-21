package com.bcsystems.contabilidad.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* En esta clase se modela a un proveedor, el cual contiene atributos basicos, como empresa, activo o no
* y se liga a una persona.
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "proveedor")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_provider;
    @Column(nullable = false, length = 30)
    private String empresa;
    @Column(nullable = false)
    private Boolean activo = true;
    @OneToOne
    @JoinColumn(name = "id_person")
    private Person person;

}
