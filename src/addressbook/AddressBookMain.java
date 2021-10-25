package addressbook;


public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        AddressBook c1 = new AddressBook();
        c1.setFirstName("Shashank");
        c1.setLastName("Chauhan");
        c1.setAddress("No 11 Hanumanthnagar");
        c1.setCity("Bangalore");
        c1.setState("Karnataka");
        c1.setZip("560015");
        c1.setPhoneNumber("565478521");
        c1.setEmail("Shashank@gmail.com");

        AddressBook c2= new AddressBook();
        c2.setFirstName("Hindusthani");
        c2.setLastName("Bhau");
        c2.setAddress("Andheri");
        c2.setCity("Mumbai");
        c2.setState("Maharasthra");
        c2.setZip("445877");
        c2.setPhoneNumber("123456987");
        c2.setEmail("Bhau@gmail.com");

        System.out.println(c1);
        System.out.println(c2);
    }
}