package de.neuefische.covidcases.controller;

import de.neuefische.covidcases.model.ConfirmedByDay;
import de.neuefische.covidcases.service.CovidCasesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("covid/cases")
public class CovidCasesController {

    private final CovidCasesService covidCasesService;

    public CovidCasesController(CovidCasesService covidCasesService) {
        this.covidCasesService = covidCasesService;
    }

    @GetMapping
    public List<ConfirmedByDay> getConfirmedCases() {
        return covidCasesService.getConfirmedCases();
    }

}
