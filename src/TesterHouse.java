import java.util.Scanner;

public class TesterHouse {
    public static void main(String[] args) {

        Scanner Administrator = new Scanner(System.in);
        House house = new House();

        System.out.println("Insert number of the floor");
        int Floors = Administrator.nextInt();
        house.setFloorsNumber(Floors);


        Administrator.nextLine();

        System.out.println("Insert your address");
        String Address = Administrator.nextLine();
        house.setAddress(Address);


        System.out.print("Insert the name of residents : ");
        String nameOfResidents = Administrator.nextLine();
        String[] names = nameOfResidents.split(",");
        house.setNameOfResidents(names);


        Administrator.close();

        System.out.println("House details: ");
        String format123 = "Floors: %d\nAddress: %s\nResidents: %s";
        System.out.println(String.format(format123, house.getFloorsNumber(), house.getAddress(), String.join(",", house.getNameOfResidents())));


    }
}
