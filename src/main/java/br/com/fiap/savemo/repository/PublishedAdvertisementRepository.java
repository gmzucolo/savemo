package br.com.fiap.savemo.repository;

import br.com.fiap.savemo.entity.PublishedAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishedAdvertisementRepository extends JpaRepository<PublishedAdvertisement, Long> {
}
