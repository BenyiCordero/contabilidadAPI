package com.bcsystems.contabilidad.domain.en;

/*
* En esta clase se expresan los estados de los gastos, ya sea pendiente pagado o cancelado,
* por los cuales podremos sacar la sumatoria de los gastos pagados y gastos pendientes.
* */

public enum ExpenseStatus {
    PENDIENTE,
    PAGADO,
    CANCELADO
}
