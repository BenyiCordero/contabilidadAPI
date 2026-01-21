package com.bcsystems.contabilidad.domain.en;

/*
* En est clase podemos observar los diversos estados en los cuales una compra puede estar, como lo son
* PENDIENTE, PAGADA, CANCELADA, las compras siempre estaran separadas del gasto, ya que la compra puede
* traer una remuneracion futura, ya sea la compra de dispositivos moviles etc.
* */

public enum PurchaseStatus {
    PENDIENTE,
    PAGADA,
    CANCELADA
}
