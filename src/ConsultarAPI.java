import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarAPI {
    public static CambioMoneda Consultar(String monedaBase,String monedaCambio){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ba3886f9553f4deb76fbc776/pair/"+monedaBase
                +"/"+monedaCambio);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), CambioMoneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se puedo hacer la conversion moneda");
        }

    }
}
