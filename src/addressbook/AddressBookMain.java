package addressbook;


import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        AddressBook contactOne = new AddressBook();

        AddressBook c1 = new AddressBook();
        c1.setFirstName("Shashank");
        c1.setLastName("Chauhan");
        c1.setAddress("No 11 Hanumanthnagar");
        c1.setCity("Bangalore");
        c1.setState("Karnataka");
        c1.setZip("560015");
        c1.setPhoneNumber("565478521");
        c1.setEmail("Shashank@gmail.com");

        // create object in AddressBook class for add new person
        AddressBook contactTwo = new AddressBook();

        // create object for taking input
        Scanner scanner = new Scanner(System.in);

        // Print Message for user
        System.out.println("------- Enter details of new person ---------");

        // take input from user
        System.out.print("Enter Frist Name: ");
        contactTwo.setFirstName(scanner.nextLine());
        System.out.print("Enter Last Name: ");
        contactTwo.setLastName(scanner.nextLine());
        System.out.print("Enter Address: ");
        contactTwo.setAddress(scanner.nextLine());
        System.out.print("Enter City: ");
        contactTwo.setCity(scanner.nextLine());
        System.out.print("Enter State: ");
        contactTwo.setState(scanner.nextLine());
        System.out.print("Enter Pin: ");
        contactTwo.setZip(scanner.nextLine());
        System.out.print("Enter Phone Number: ");
        contactTwo.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter Email: ");
        contactTwo.setEmail(scanner.nextLine());

        // create object for contactStore
        ContactStore contactStore = new ContactStore();
        contactStore.add(contactOne);
        contactStore.add(contactTwo);

        // create object for userInterface
        UserInterface userInterface = new UserInterface();

        // print contact details
        userInterface.print(contactStore.getContactList());

        System.out.println("--------- Contact Edit ------------");
        // print message for user

        System.out.print("Find contact detail using First Name: ");
        String name = scanner.nextLine();

        // check contact is available or not
        if(contactOne.getFirstName().equalsIgnoreCase(name) == true)
            userInterface.edit(contactOne);
        else if (contactTwo.getFirstName().equalsIgnoreCase(name)== true)
            userInterface.edit(contactTwo);
        else
            System.out.println("Contact Details invalid");

        System.out.println(" -------- Contact List after edit ---------- ");
        userInterface.print(contactStore.getContactList());



    }
}