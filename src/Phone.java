/**
 * Created by Gosia on 2016-01-30.
 */
public class Phone extends Product implements ElectronicDevice {
    private double memot;
    private int size;  //specjalne nie zieniam ale nie zaakceptowalo jako bylo double !!!!

    public Phone(String name, double price, double memot, int size) { // DLACZEGO NIE MOZE BYC DOUBLE

        super(price, name);

        this.memot = memot;
        this.size = size;
    }

    public double getMemot() {
        return memot;
    }

    public void setMemot(double memot) {
        this.memot = memot;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public void discount(){
        System.out.println("Phone: max rabat to 10%");

    }


    @Override
    public String toString() {
        return "Phone{" +
                "memot=" + memot +// dlaczego nie pojawil sie price ani name ! !!!!!!!!!!!!!11
                ", price=" + price +
                ", name=" + name +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return true;
        }

        Phone phone = (Phone) o;

        return name.equals(phone.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public double getVoltage() {
        return 30;
    }
}


//@Override
//public boolean equals(Object o) {
//       if (this == o) {
//     return true;
//   }
// if (o == null || getClass() != o.getClass()) {
//return false;
//}

//Computer computer = (Computer) o;// mamy  object rzutujemy na komputer i mamy dostep do jego skladowych

//return name.equals(computer.name);

//}

//@Override
//public int hashCode() {
//       return name.hashCode();
//     }
