package model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name_cmp")
    private String name;
    @Column(name="date_Found")
    private Date date;
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private Set<Trip> tripes;

    public Company(Long id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }
}