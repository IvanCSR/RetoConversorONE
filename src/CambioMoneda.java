public record CambioMoneda(
        String nombreMonedaBase,
        float monedaBase,
        String nombreMonedaCambio,
        float monedacambio
) {
    public String getDatos(){
        return String.format("Moneda base: %s - Valor: %.2f | Moneda Cambio: %s - Valor: %.2f",
                nombreMonedaBase,monedaBase,nombreMonedaCambio,monedacambio);
    }
}
