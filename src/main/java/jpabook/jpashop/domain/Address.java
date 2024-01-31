package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String name;
    private String city;
    private String zipcode;

    public Address() {
    }

    public Address(String name, String city, String zipcode) {
        this.name = name;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
