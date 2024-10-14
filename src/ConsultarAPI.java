import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarAPI {
    public static void Consultar(String monedaBase,String monedaCambio,float monto){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ba3886f9553f4deb76fbc776/pair/"+monedaBase
                +"/"+monedaCambio+"/AMOUNT");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (Exception e) {
            throw new RuntimeException("No se puedo hacer la conversion moneda");
        }

    }
}
