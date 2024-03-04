package com.springturor.springtutor.service;

import com.springturor.springtutor.model.Eyo;
import com.springturor.springtutor.repository.EyoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EyoService {
    public final EyoRepository eyoRepository;


    public EyoService(EyoRepository eyoRepository) {
        this.eyoRepository = eyoRepository;
    }

    public Eyo createCustomer() {

    }

    public List<Eyo> getAllCustomer() {
        return eyoRepository.findAll();
    }

    public Optional<Eyo> getCustomer(Long id) {
        return eyoRepository.findById(id);
    }

    public Eyo updateCustomer(Eyo eyo, Long id) {
        Optional<Eyo> customer = this.eyoRepository.findById(id);
        customer.get().setName(eyo.getName());
        customer.get().setEmail(eyo.getEmail());
        customer.get().setPassword(eyo.getPassword());

        return eyoRepository.save(customer);
    }

    public String deleteCustomer(Long id) {
    }
}
