package pl.sda.travel360.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.sda.travel360.controller.request.AddCountryRequest;
import pl.sda.travel360.controller.response.GetCountriesResponse;
import pl.sda.travel360.dto.CountryDTO;
import pl.sda.travel360.service.CountryService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/country")
public class CountryController {

    private final CountryService service;

    @GetMapping
    public GetCountriesResponse getCountries() {
        var countries = service.getAllCountry();
        return GetCountriesResponse.of(countries);
    }

    @PostMapping
    public void addCountry(@RequestBody AddCountryRequest request) {
        var countryDto = CountryDTO.builder()
                .name(request.getCountry())
                .build();
        service.addCountry(countryDto);
    }
}
