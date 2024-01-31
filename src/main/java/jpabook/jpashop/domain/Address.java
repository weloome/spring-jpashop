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

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }
}
