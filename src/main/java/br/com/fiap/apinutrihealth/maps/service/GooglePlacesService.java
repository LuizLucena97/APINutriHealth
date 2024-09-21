package br.com.fiap.apinutrihealth.maps.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@Service
public class GooglePlacesService {

    @Value("${google.api.key}")
    private String apiKey;

    public Map<String, Object> findVeganRestaurants(double lat, double lng) {
        String url = UriComponentsBuilder.fromHttpUrl("https://maps.googleapis.com/maps/api/place/nearbysearch/json")
                .queryParam("location", lat + "," + lng)
                .queryParam("radius", 5000)  // 5 km de raio
                .queryParam("type", "restaurant")
                .queryParam("keyword", "vegan")
                .queryParam("key", apiKey)
                .toUriString();

        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);

        return response;
    }
}
