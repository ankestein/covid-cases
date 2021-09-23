package de.neuefische.covidcases.service;

import de.neuefische.covidcases.api.CovidApiService;
import de.neuefische.covidcases.model.ConfirmedByDay;
import de.neuefische.covidcases.model.api.CovidApiCountryPerDay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CovidCasesService {

    private final CovidApiService covidApiService;
    private final CovidCasesMapper covidCasesMapper;

    public CovidCasesService(CovidApiService covidApiService, CovidCasesMapper covidCasesMapper) {
        this.covidApiService = covidApiService;
        this.covidCasesMapper = covidCasesMapper;
    }

    public List<ConfirmedByDay> getConfirmedCases() {
        CovidApiCountryPerDay[] covidApiCountryPerDays = covidApiService.getCovidApiCountryPerDay();
        List<ConfirmedByDay> confirmedByDays = covidCasesMapper.mapToConfirmedByDay(covidApiCountryPerDays);
        return confirmedByDays;
    }
}
