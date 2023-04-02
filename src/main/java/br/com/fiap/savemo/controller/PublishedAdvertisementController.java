package br.com.fiap.savemo.controller;

import br.com.fiap.savemo.entity.PublishedAdvertisement;
import br.com.fiap.savemo.repository.PublishedAdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/published-advertisements")
public class PublishedAdvertisementController {

    @Autowired
    private PublishedAdvertisementRepository publishedAdvertisementRepository;

    @GetMapping
    public List<PublishedAdvertisement> findAllPublishedAdvertisements() {
        return publishedAdvertisementRepository.findAll();
    }

    @GetMapping(value = "/{publishedAdvertisementId}")
    public PublishedAdvertisement findPublishedAdvertisementById(@PathVariable Long publishedAdvertisementId) {
        return publishedAdvertisementRepository.findById(publishedAdvertisementId).get();
    }

    @PostMapping
    public PublishedAdvertisement savePublishedAdvertisement(@RequestBody PublishedAdvertisement publishedAdvertisement) {
        return publishedAdvertisementRepository.save(publishedAdvertisement);
    }

    @PutMapping(value = "/{publishedAdvertisementId}")
    public PublishedAdvertisement updatePublishedAdvertisement(@PathVariable Long publishedAdvertisementId, @RequestBody PublishedAdvertisement publishedAdvertisement) {
        PublishedAdvertisement publishedAdvertisementToUpdate = publishedAdvertisementRepository.findById(publishedAdvertisementId).get();
        publishedAdvertisementToUpdate.setAdvertisementTitle(publishedAdvertisement.getAdvertisementTitle());
        publishedAdvertisementToUpdate.setAdvertisementDescription(publishedAdvertisement.getAdvertisementDescription());
        publishedAdvertisementToUpdate.setAdvertisementValue(publishedAdvertisement.getAdvertisementValue());
        publishedAdvertisementToUpdate.setPublisherUser(publishedAdvertisement.getPublisherUser());
        return publishedAdvertisementToUpdate;
    }

    @DeleteMapping(value = "/{publishedAdvertisementId}")
    public void deletePublishedAdvertisement(@PathVariable Long publishedAdvertisementId) {
        publishedAdvertisementRepository.deleteById(publishedAdvertisementId);
    }
}
