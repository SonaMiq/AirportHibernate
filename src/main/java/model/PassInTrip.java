package model;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="pass_in_trip")
public class PassInTrip {

    @EmbeddedId
    private PassInTripId passInTripId;


    private String place;

    public PassInTrip() {
    }

    @Embeddable
    private static class PassInTripId implements Serializable {

        public Long tripNumber;
        public Long passengerID;
        public Date date;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PassInTripId passInTripId = (PassInTripId) o;
            return tripNumber.equals(passInTripId.tripNumber) && passengerID.equals(passInTripId.passengerID) && date.equals(passInTripId.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(tripNumber, passengerID, date);
        }
    }
}
