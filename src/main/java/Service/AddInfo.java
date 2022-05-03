package Service;

import dao.CompanyDao;
import dao.PassengerDao;
import dao.TripDao;
import model.Address;
import model.Company;
import model.Passenger;
import model.Trip;

import java.io.*;
import java.sql.Date;
import java.sql.SQLData;
import java.sql.Time;

public class AddInfo {


    BufferedReader bufferedReader;

    public void addPassenger() {

        PassengerDao passengerDao = new PassengerDao();
        String[] read = new String[4];
        String s = "";
        try {
            bufferedReader = new BufferedReader(new FileReader("src\\main\\resources\\passengers.txt"));

            while (true) {
                s = bufferedReader.readLine();
                if (s == null)
                    break;
                read = s.split(",");
                passengerDao.create(new Passenger(read[0], read[1], (new Address(read[2], read[3]))));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addCompany() {

        CompanyDao companyDao = new CompanyDao();
        String[] read;
        String s = "";
        String[] dt;
        try {
            bufferedReader = new BufferedReader(new FileReader("src\\\\main\\\\resources\\\\companies.txt"));
            bufferedReader.readLine();
            while (true) {
                s = bufferedReader.readLine();
                if (s == null)
                    break;
                read = s.split(",");
                dt = read[1].split("/");
                companyDao.create(new Company(read[0], Date.valueOf(dt[2] + "-" + dt[0] + "-" + dt[1])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addTrip() {
        TripDao tripDao = new TripDao();
        CompanyDao companyDao = new CompanyDao();
        String[] read;
        String s = "";
        try {
            bufferedReader = new BufferedReader(new FileReader("src\\\\main\\\\resources\\\\trips.txt"));
            while (true) {
                s = bufferedReader.readLine();
                if (s == null)
                    break;
                read = s.split(",");
                String time_out = read[5].split(" ")[1].substring(0, 8);
                String time_in = read[6].split(" ")[1].substring(0, 8);
                tripDao.create(new Trip(Long.valueOf(read[0]), companyDao.get(Long.valueOf(read[1])),
                        read[2], read[3], read[4], Time.valueOf(time_out), Time.valueOf(time_in)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



