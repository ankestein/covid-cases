package de.neuefische.covidcases.service;

import de.neuefische.covidcases.model.ConfirmedByDay;
import de.neuefische.covidcases.model.api.CovidApiCountryPerDay;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CovidCasesMapper {

    public List<ConfirmedByDay> mapToConfirmedByDay(CovidApiCountryPerDay[] covidApiCountryPerDays) {
        List<ConfirmedByDay> confirmedByDays = new ArrayList<>();

        for (CovidApiCountryPerDay covidApiCountryPerDay : covidApiCountryPerDays) {
            ConfirmedByDay confirmedByDay = new ConfirmedByDay(
                    covidApiCountryPerDay.getDate(),
                    covidApiCountryPerDay.getConfirmed()
            );
            confirmedByDays.add(confirmedByDay);
        }
        return confirmedByDays;
    }
}
