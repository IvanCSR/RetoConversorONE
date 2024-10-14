import java.io.IOException;

public record CambioMoneda(
        String base_code,
        String target_code,
        float conversion_rate
) {
    public void ConvertirMoneda() throws IOException {
        var monto=Utilidad.validarMonto();
        System.out.printf("Cambio Moneda: %.2f\n", monto* conversion_rate);
    }
}
