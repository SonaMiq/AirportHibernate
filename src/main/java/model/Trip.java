package model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;


@Entity
@Table(name = "trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tripNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;
    private String plane;
    @Column(name = "town_from")
    private String townFrom;
    @Column(name = "town_to")
    private String townTo;
    @Column(name = "time_Out")
    private Time timeOut;
    @Column(name = "time_In")
    private Time timeIn;

    @ManyToMany
    @JoinTable(name = "pass_in_trip", joinColumns = @JoinColumn(referencedColumnName = "tripNumber", name = "tripNumber"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "id", name = "passengerID"))
    private Set<Passenger> passengers;

}
