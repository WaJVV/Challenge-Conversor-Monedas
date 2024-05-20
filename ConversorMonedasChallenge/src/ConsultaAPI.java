import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsultaAPI {

    public CambioMoneda buscarTipoMoneda(String tipoMoneda){


        URI direccionAPI =URI.create("https://v6.exchangerate-api.com/v6/c961aa42a3450b4f6f5529a1/latest/" + tipoMoneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccionAPI)
                .build();


        try {

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //return new Gson().fromJson(response.body(), CambioMoneda.class);
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
            String baseCode = jsonResponse.get("base_code").getAsString();
            JsonObject conversionRatesObject = jsonResponse.get("conversion_rates").getAsJsonObject();

            var conversionRatesMap = new Gson().fromJson(conversionRatesObject, Map.class);

            return new CambioMoneda(baseCode,conversionRatesMap);
        }catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
