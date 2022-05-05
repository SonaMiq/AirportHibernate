package model;

import javax.persistence.*;

@Entity
@Table(name = "passenger")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name_psg")
    private String name;
    private String phone;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id",
            foreignKey = @ForeignKey(name = "contract_address_fk"))
    private Address address;

    public Passenger(String name, String phone, Address address) {

        this.name = name;
        this.phone = phone;
        this.address = address;
    }
    public Passenger(){}

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
