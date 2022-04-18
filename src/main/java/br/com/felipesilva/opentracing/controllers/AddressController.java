package br.com.felipesilva.opentracing.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@RestController
public class AddressController {

    private final RestTemplate restTemplate;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/address/{zipCode}")
    public String getAddress(@PathVariable String zipCode) {

        return restTemplate.getForObject(String.format("https://viacep.com.br/ws/%s/json/", zipCode), String.class);
    }
}
