package com.bcsystems.contabilidad.domain.en;

/*
* En esta clase definimos los estatus de una venta, LIQUIDADA, PENDIENTE, CANCELADA, liquidada se usara
* para ventas a contado, y ventas a credito ya pagadas, y pendiente para ventas que sean a credito,
* canceladas para ventas que se cancelaron.
* */

public enum SaleStatus {
    LIQUIDADA,
    PENDIENTE,
    CANCELADA
}
