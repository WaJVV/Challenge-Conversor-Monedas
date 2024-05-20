import java.util.Map;

public record CambioMoneda(String base_code, Map<String, Double> conversion_rates) {
}
