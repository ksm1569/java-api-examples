package com.smsoft.blogsamplecode.jsondataparsing.after;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
    private String city;
    private String country;

    // Getter와 Setter
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}
