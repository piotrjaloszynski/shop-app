/**
 * Created by Gosia on 2016-01-29.
 */
public class ShopBetter {
    private Product[] products; // tablica products


    public ShopBetter() {
        products = new Product[10]; // tworzymy tablice pilotow do obiektu pies.. w naszym przyp. komputer.

    }
    // lenght wielkosc tablicy na 10 elementow to zostanie zwrocone 10 elementow
    public void addProduct(Product product) {//  bo bedzie tworzony produkt w meni i bedziemy go przekazywac,dodaj komputer do sklepu
        for (int i = 0; i < products.length; i++) { // dla i ktory sie   jezeli jest null to ma moziwlosc przech obiektu
            if (products[i] == null) {// petla definiuje w petli i i zmienia od 0 do 9, null jest przy tablicach.
                products[i] = product; // wpisujemy  komputer w ite miejsce ,
                break;// dokladnie jak dojdziemy  do pierwszego nulla i wstawimmy komputer ,  do puiki  nie wypelnimy
                // tablicy to zatrzymywalo na pierwszym elemencie null
            }// zeby sprawdzic  kazdy element .  jesli siedzi null to mozemy cos wpisac i wpisujemy komputer
        }
//  string null  odnosi sie do obiektow co nie jest typem  prymitywnym na stercie
        // do tych pilotow do zmiennych referencyjnych , jezeli zmienna nie pokazuje na zaden obiekt to jest pusta
        // nie pokazuje zadnego obiektu.
    }

    // USUNELISMY BO JEDNA  METODA WYZEJ ZALATWILEM  DODAWANIE KAZDEGO PRODUKTU Z KLASY PRODUKT

    @Override
    public String toString() {// przekonwertowac  obiekt na napis string,  zwraca string represention object
        String result = "";// chcemy zeby sklepy przekonwertowac napis jeden po drugim , ma narazie informacje
        // ze przechowuje komps  i jackets i ma je wypisac w metodzie to string. zobaczymy liste wszystkich produktow
// comp comp to jest tymczasowa zmienna  i mowisz w tablicy komputerow.
        for (Product product : products) {//  w tablicy bedzie literowal i bedzie przypisywal kolejne elemety z tablicy produkty
            if (product != null) {// jesli produkt w komorce nie ejst nullem,  zmienna referencyjna ,
                result += product + "\n"; // komputer + napis ktor reprezentuje  , do tego resultu sumuje kompu
            }// jesli masz 2 stringi to nie m

        }
//usuwamy petle jacket bvo zalatwione w petli powuzej /  USUNAC  POWUZSE  KOENTARZE ODNOSZA DO CZEGOS INNEGO.

        return result;
    }
}


