import java.io.IOException;

public record CambioMoneda(
        String base_code,
        String target_code,
        float conversion_rate
) {
    public void ConvertirMoneda() throws IOException {
        var monto=Utilidad.validarMonto();
        System.out.printf("El valor de %.2f [%s] corresponde al valor de %.2f [%s]%n",
                monto,base_code,
                monto* conversion_rate,target_code);
    }
}
