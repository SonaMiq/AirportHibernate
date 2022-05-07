import Service.AddressService;
import model.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AddressServiceTest {

    AddressService addressService=new AddressService();
   @Test
 void readTest(){

       Address address=addressService.read(15L);
       Assertions.assertEquals(address.getCity(),"Dori");
       Assertions.assertEquals(address.getCountry(),"Burkina Faso");
    }
    @Test
    void deleteTest(){
     addressService.delete(30L);
     Assertions.assertEquals(addressService.read(30L),null);
    }
    @Test
 void updateTest(){
       addressService.update(15L,new Address("BurkinaFaso","Dorii"));
       Address address=addressService.read(15L);
       Assertions.assertEquals(address.getCountry(),"BurkinaFaso");
       Assertions.assertEquals(address.getCity(),"Dorii");
 }
}
