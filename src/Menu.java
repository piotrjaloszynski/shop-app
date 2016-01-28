import java.util.Scanner;

public class Menu {

    public void menu() {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        String userInput = "";

        displayMenu();

        while (!userInput.equals("q")) {

            System.out.print("Enter your choice: ");
            userInput = scanner.next();

            switch (userInput) {
                case "1": {
                    System.out.println(shop);
                    break;
                }
                case "2": {
                    System.out.println("Adding new computer: ");
                    System.out.print("Enter name: ");
                    String name = scanner.next();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter cpu: ");
                    double cpu = scanner.nextDouble();

                    System.out.print("Enter ram: ");
                    int ram = scanner.nextInt();

                    Computer computer = new Computer(name, price, cpu, ram);
                    shop.addComputer(computer);
                }
                break;
                case "3": {
                    System.out.println("Adding new jacket: ");
                    System.out.print("Enter name: ");
                    String name = scanner.next();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter size: ");
                    int size = scanner.nextInt();

                    System.out.print("Enter producer: ");
                    String producer = scanner.next();

                    Jacket jacket = new Jacket(name, price, size, producer);
                    shop.addJacket(jacket);
                }
                break;
                case "m":
                    displayMenu();
                    break;
                case "q":
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Invalid options, valid are:  ");
                    displayMenu();
                    break;

            }
        }
    }

    private void displayMenu() {
        System.out.println("1 - display shop products");
        System.out.println("2 - add computer");
        System.out.println("3 - add jacket");
        System.out.println("m - display menu");
        System.out.println("q - exit program");
    }
}
