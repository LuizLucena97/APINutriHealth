package br.com.fiap.apinutrihealth.maps.controller;

import br.com.fiap.apinutrihealth.maps.service.GooglePlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/restaurants")
@CrossOrigin(origins = "*")  // Permite acesso de qualquer origem
public class RestaurantController {

    @Autowired
    private GooglePlacesService googlePlacesService;

    @GetMapping("/vegan")
    public Map<String, Object> getVeganRestaurants(@RequestParam double lat, @RequestParam double lng) {
        return googlePlacesService.findVeganRestaurants(lat, lng);
    }
}
