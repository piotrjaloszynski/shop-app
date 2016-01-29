public class Shop {

    private Computer[] computers;
    private Jacket[] jackets;

    public Shop() {
        computers = new Computer[10]; // tworzymy tablice pilotow do obiektu pies.. w naszym przyp. komputer.
        jackets = new Jacket[10];
    }
// lenght wielkosc tablicy na 10 elementow to zostanie zwrocone 10 elementow
    public void addComputer(Computer computer) {// dodaj komputer do sklepu
        for (int i = 0; i < computers.length; i++) { // dla i ktory sie   jezeli jest null to ma moziwlosc przech obiektu
            if (computers[i] == null) {// petla definiuje w petli i i zmienia od 0 do 9, null jest przy tablicach.
                computers[i] = computer; // wpisujemy  komputer w ite miejsce ,
                break;// dokladnie jak dojdziemy  do pierwszego nulla i wstawimmy komputer ,  do puiki  nie wypelnimy
                // tablicy to zatrzymywalo na pierwszym elemencie null
            }// zeby sprawdzic  kazdy element .  jesli siedzi null to mozemy cos wpisac i wpisujemy komputer
        }
//  string null  odnosi sie do obiektow co nie jest typem  prymitywnym na stercie
       // do tych pilotow do zmiennych referencyjnych , jezeli zmienna nie pokazuje na zaden obiekt to jest pusta
        // nie pokazuje zadnego obiektu.
    }

    public void addJacket(Jacket jacket) {
        for (int i = 0; i < jackets.length; i++) {
            if (jackets[i] == null) {
                jackets[i] = jacket;
                break;
            }// wypelnia  jacketami  zamiast pierwszego nulla wstawia jacket z nastepengo parametru
            // jedno wywolanie powoduje wypelniego 1 miejsca w tablicy
        }
    }

    @Override
    public String toString() {// przekonwertowac  obiekt na napis string,  zwraca string represention object
        String result = "";// chcemy zeby sklepy przekonwertowac napis jeden po drugim , ma narazie informacje
        // ze przechowuje komps  i jackets i ma je wypisac w metodzie to string. zobaczymy liste wszystkich produktow
// comp comp to jest tymczasowa zmienna  i mowisz w tablicy komputerow.
        for (Computer computer : computers) {//  w tablicy bedzie literowal i bedzie przypisywal kolejne elemety z tablicy produkty
            if (computer != null) {// jesli produkt w komorce nie ejst nullem,  zmienna referencyjna ,
                result += computer + "\n"; // komputer + napis ktor reprezentuje  , do tego resultu sumuje kompu
            }// jesli masz 2 stringi to nie m

        }
// Jacket jacket - odwolanie do obiektu to jest nasz pilot. rysunek 3
        for (Jacket jacket : jackets) {// dla kazdej kurki w tej tablicy wykonaj co w petli
            if (jacket != null) {
                result += jacket + "\n";
            }
        }

        return result;
    }
}
