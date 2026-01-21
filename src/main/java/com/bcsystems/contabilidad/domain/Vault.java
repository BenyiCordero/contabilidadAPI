package com.bcsystems.contabilidad.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

/*
* En esta clase se modela el almacen, el cual es basico, ya que solamente tiene el valor, y fecha de registro,
* mi pensar es ir creando uno por dia, esto en el corte, para poder tener las versiones anteriores.
* */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "vault")
public class Vault {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_vault;
    @Column(nullable = false)
    private Float valor;
    @CreationTimestamp
    @Column(updatable = false, unique = true, nullable = false)
    private LocalDate fecha_registro;

}
