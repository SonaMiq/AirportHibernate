package model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    @Column(unique = true,length = 50)
    private String city;
    @Column(length = 50)
    @OneToOne(mappedBy = "address")
    private Passenger passenger;

    public Address( String country, String city) {
        this.country = country;
        this.city = city;
    }
    public Address(){}

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                (passenger==null?"null":passenger.toString() )+
                '}';
    }
}
