package br.com.fiap.savemo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_hired_advertisement")
public class HiredAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_hired_id", nullable = false)
    private Long advertisementHiredId;

    @ManyToOne
    @JoinColumn(name = "ad_published_id")
    private PublishedAdvertisement publishedAdvertisement;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User publisherUser;

    @ManyToMany
    @JoinTable(name = "tb_hired_advertisement_user",
            joinColumns = @JoinColumn(name = "ad_hired_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> hiringUsers;

    private LocalDateTime hiredDate;

    public HiredAdvertisement() {
    }

    public Long getAdvertisementHiredId() {
        return advertisementHiredId;
    }

    public void setAdvertisementHiredId(Long advertisementHiredId) {
        this.advertisementHiredId = advertisementHiredId;
    }

    public PublishedAdvertisement getPublishedAdvertisement() {
        return publishedAdvertisement;
    }

    public void setPublishedAdvertisement(PublishedAdvertisement publishedAdvertisement) {
        this.publishedAdvertisement = publishedAdvertisement;
    }

    public User getPublisherUser() {
        return publisherUser;
    }

    public void setPublisherUser(User publisherUser) {
        this.publisherUser = publisherUser;
    }

    public List<User> getHiringUsers() {
        return hiringUsers;
    }

    public void setHiringUsers(List<User> hiringUsers) {
        this.hiringUsers = hiringUsers;
    }

    public PublishedAdvertisement getAdvertisement() {
        return publishedAdvertisement;
    }

    public void setAdvertisement(PublishedAdvertisement publishedAdvertisement) {
        this.publishedAdvertisement = publishedAdvertisement;
    }

    public LocalDateTime getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(LocalDateTime hiredDate) {
        this.hiredDate = hiredDate;
    }
}
