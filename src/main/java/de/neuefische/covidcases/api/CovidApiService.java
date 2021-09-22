package de.neuefische.covidcases.api;

import de.neuefische.covidcases.model.api.CovidApiCountryPerDay;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidApiService {

    private static final String API_URL = "https://api.covid19api.com/country/germany";
    private final RestTemplate restTemplate = new RestTemplate();

    public CovidApiCountryPerDay[] getCovidApiCountryPerDay() {
        ResponseEntity<CovidApiCountryPerDay[]> response = restTemplate.getForEntity(API_URL, CovidApiCountryPerDay[].class);
        return response.getBody();
    }
}
