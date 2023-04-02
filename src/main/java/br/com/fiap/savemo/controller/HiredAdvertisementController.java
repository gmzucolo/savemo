package br.com.fiap.savemo.controller;

import br.com.fiap.savemo.entity.HiredAdvertisement;
import br.com.fiap.savemo.repository.HiredAdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hired-advertisements")
public class HiredAdvertisementController {

    @Autowired
    private HiredAdvertisementRepository hiredAdvertisementRepository;

    @GetMapping
    public List<HiredAdvertisement> findAllHiredAdvertisements() {
        return hiredAdvertisementRepository.findAll();
    }

    @GetMapping(value = "/{hiredAdvertisementId}")
    public HiredAdvertisement findHiredAdvertisementById(@PathVariable Long hiredAdvertisementId) {
        return hiredAdvertisementRepository.findById(hiredAdvertisementId).get();
    }

    @PostMapping
    public HiredAdvertisement saveHiredAdvertisement(@RequestBody HiredAdvertisement hiredAdvertisement) {
        return hiredAdvertisementRepository.save(hiredAdvertisement);
    }


}
