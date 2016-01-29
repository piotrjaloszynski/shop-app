public class Computer extends Product  {
   // private String name;  USUWAMYY
   // private double price; USUWAMY JAK ROBI DZIEDZICZENIE

    private double cpu;
    private int ram;

    public Computer(String name, double price, double cpu, int ram) {

  super(price,name);
       // this.name = name; usuwamy  bo bedzie super
       // this.price = price;
        this.cpu = cpu;
        this.ram = ram;
    }

   // public String getName() {
     //   return name;
    //}

    //public void setName(String name) {
      //  this.name = name;
   // }

    //public double getPrice() {
    //    return price;
    //} USUWAMY BO SA  W NASZYM PRODUKCIE

    //public void setPrice(double price)
    // //{
        //this.price = price;
    //}

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {// skleja informacje o objekcie nazwe cene cpu.
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cpu=" + cpu +
                ", ram=" + ram +
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

        Computer computer = (Computer) o;// mamy  object rzutujemy na komputer i mamy dostep do jego skladowych

        return name.equals(computer.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
