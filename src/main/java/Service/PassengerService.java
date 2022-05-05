package Service;

import model.Passenger;
import repasitory.PassengerRepo;

public class PassengerService {
    PassengerRepo passengerRepo =new PassengerRepo();
    public void create(Passenger passenger){
        passengerRepo.create(passenger);
    }
}
