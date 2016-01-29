import java.util.Scanner;

public class Menu {

    public void menu() {
        ShopBetter shop = new ShopBetter();  // zmieniamy na shopBetter
        Scanner scanner = new Scanner(System.in);

        String userInput = "";

        displayMenu();

        while (!userInput.equals("q")) {// do puki jest rozne od q petla bedzie sie krecic.

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
                    int ram = scanner.nextInt();// wczytuje kolejny input od urzytkowwnia
// scaner bedzie czekac jak wpiszesz w klawiature
                    Computer computer = new Computer(name, price, cpu, ram);// obojetne Product computer= new Computer (name, price , cpu,ram)
                    //shop.addComputer(computer); add product zamiast computer !!
                    shop.addProduct(computer);// bedzie dzialac dlatego ze ko,mputer to jest element produktu
                    // bedzie akceptowac wszstkie klasy. Poliformiz  w zaleznosci jaki obiekt podajemy obiekt

                }
                break;
                case "3": {
                    System.out.println("Adding new jacket: ");
                    System.out.print("Enter name: ");
                    String name = scanner.next();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();//  jesli price to double zdefi w jacket comp to wywoluje double

                    System.out.print("Enter size: ");
                    int size = scanner.nextInt();

                    System.out.print("Enter producer: ");
                    String producer = scanner.next();

                    Jacket jacket = new Jacket(name, price, size, producer);
                    //shop.addJacket(jacket);
                    shop.addProduct(jacket);
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
