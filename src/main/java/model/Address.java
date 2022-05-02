package model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String city;
    @OneToOne(mappedBy = "address")
    private Passenger passenger;

    public Address(Long id, String country, String city) {
        this.id = id;
        this.country = country;
        this.city = city;
    }
    public Address(){}

}
