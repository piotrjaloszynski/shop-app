public class Jacket {
    private String name;
    private double price;

    private int size;
    private String producer;

    public Jacket(String name, double price, int size, String producer) {
        this.price = price;
        this.name = name;
        this.size = size;
        this.producer = producer;
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
                "price=" + price +
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
