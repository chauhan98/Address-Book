package addressbook;


import java.util.Scanner;

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


        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------- Enter details of new person ---------");

        System.out.print("Enter Frist Name: ");
        addressBook.setFirstName(scanner.nextLine());
        System.out.print("Enter Last Name: ");
        addressBook.setLastName(scanner.nextLine());
        System.out.print("Enter Address: ");
        addressBook.setAddress(scanner.nextLine());
        System.out.print("Enter City: ");
        addressBook.setCity(scanner.nextLine());
        System.out.print("Enter State: ");
        addressBook.setState(scanner.nextLine());
        System.out.print("Enter Pin: ");
        addressBook.setZip(scanner.nextLine());
        System.out.print("Enter Phone Number: ");
        addressBook.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter Email: ");
        addressBook.setEmail(scanner.nextLine());



        System.out.println(c1);
        System.out.println(addressBook);
    }
}