package com.ss.donor.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
public class DonorRequestPayload {

    @JsonProperty("fName")
    private String firstName;

    @JsonProperty("lName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("contactNumber")
    private String contactNumber;

    @JsonProperty("bloodGroup")
    private String bloodGroup;

    @JsonProperty("city")
    private String city;

    @JsonProperty("donationDate")
    private Date donationDate;

    public DonorRequestPayload(String firstName, String lastName, String email, String contactNumber, String bloodGroup, String city, Date donationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.city = city;
        this.donationDate = donationDate;
    }
}
