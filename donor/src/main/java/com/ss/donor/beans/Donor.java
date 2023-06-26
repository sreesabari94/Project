package com.ss.donor.beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@Entity
@Table(name = "plasma_donor")
@Getter
@Setter
@NoArgsConstructor
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;

    @Column(name = "BLOOD_GROUP")
    private String bloodGroup;

    @Column(name = "CITY")
    private String city;

    @Column(name = "DONATION_DATE")
    private Date donationDate;

    public Donor(int id, String firstName, String lastName, String email, String contactNumber, String bloodGroup, String city, Date donationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.city = city;
        this.donationDate = donationDate;
    }
}
