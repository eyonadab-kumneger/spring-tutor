package com.springturor.springtutor.controller;

import com.springturor.springtutor.model.Eyo;
import com.springturor.springtutor.service.EyoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/")
public class EyoController {
    private final EyoService eyoService;

    public EyoController(EyoService eyoService) {
        this.eyoService = eyoService;
    }

    @PostMapping
    public Eyo createCustomer(@RequestBody Eyo eyo) {
        return eyoService.createCustomer();
    }

    @GetMapping
    public List<Eyo> getCustomers() {
        return eyoService.getAllCustomer();
    }

    @GetMapping(path = "{id}")
    public Optional<Eyo> getCustomer(@PathVariable("id") Long id) {
        return eyoService.getCustomer(id);
    }

    @PutMapping(path = "{id}")
    public Eyo getCustomers(@RequestBody Eyo eyo,@PathVariable("id")  Long id ) {
        return eyoService.updateCustomer(eyo,id);
    }
    @DeleteMapping(path = "{id}")
    public String deleteCustomer(@PathVariable("id") Long id) {
        return eyoService.deleteCustomer(id);
    }

}
