public class Jacket extends Product {


    private int size;
    private String producer;

    public Jacket(String name, double price, int size, String producer) {
       super(price,name); // potrzebne do stworzenia klasy Product ktory jest matka, klasa bazowa
         this.size = size;
        this.producer = producer;
    }





    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "price=" + price + // przestaje swiecic poniewaz klasa bazowa pozwolila zeby dostal.
                ", name='" + name + '\'' +
                ", size=" + size +
                ", producer='" + producer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Jacket jacket = (Jacket) o;

        return name.equals(jacket.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
