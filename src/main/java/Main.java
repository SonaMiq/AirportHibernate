import Service.AddInfo;
import Service.CreateTables;

public class Main {
    public static void main(String[] args) {
        //CreateTables.CreateTables();
        new AddInfo().addPassenger();
        new AddInfo().addCompany();
        new AddInfo().addTrip();
    }
}
