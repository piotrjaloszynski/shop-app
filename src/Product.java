/**
 * Created by Gosia on 2016-01-29.
 */
public class Product {
protected double price;// private d;a wszystkich ale public dla klas ktore dziedziczenia - protected
 protected String name;// private dla wszystkich   ale public dla klas ktore dziedzicza - protected

    public Product(double price, String name) {
        this.price = price;
        this.name = name;// parametryczny  ma paraenty
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
