import Service.*;
import model.Address;
import model.Company;
import model.Passenger;
import model.Trip;

public class Main {
    public static void main(String[] args) {
      // CreateTables.CreateTables();
       // new AddInfo().addPassenger();
       //  new AddInfo().addCompany();
     //   new AddInfo().addTrip();
       // new AddInfo().passInTrip();
        System.out.println(new AddressService().read(15L));
       }
        }


