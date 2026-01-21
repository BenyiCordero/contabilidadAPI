package com.bcsystems.contabilidad.domain.en;

/*
* En esta clase definimos el estatus de la comision, ya que la comision de venta se paga al instante,
* la comision de cobro se paga al final, todo esto para tener mejor control de ellas sin revolver nada
* */

public enum CommissionStatus {
    PENDIENTE,
    PAGADA
}
