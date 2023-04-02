package br.com.fiap.savemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_published_advertisement")
public class PublishedAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_published_id", nullable = false)
    private Long advertisementPublishedId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User publisherUser;

    private String advertisementTitle;

    private String advertisementDescription;

    private Long advertisementValue;


    public PublishedAdvertisement() {
    }

    public Long getAdvertisementPublishedId() {
        return advertisementPublishedId;
    }

    public void setAdvertisementPublishedId(Long advertisementPublishedId) {
        this.advertisementPublishedId = advertisementPublishedId;
    }

    public String getAdvertisementTitle() {
        return advertisementTitle;
    }

    public void setAdvertisementTitle(String advertisementTitle) {
        this.advertisementTitle = advertisementTitle;
    }

    public String getAdvertisementDescription() {
        return advertisementDescription;
    }

    public void setAdvertisementDescription(String advertisementDescription) {
        this.advertisementDescription = advertisementDescription;
    }

    public Long getAdvertisementValue() {
        return advertisementValue;
    }

    public void setAdvertisementValue(Long advertisementValue) {
        this.advertisementValue = advertisementValue;
    }

    public User getPublisherUser() {
        return publisherUser;
    }

    public void setPublisherUser(User publisherUser) {
        this.publisherUser = publisherUser;
    }
}
