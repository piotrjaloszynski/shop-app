public class Shop {

    private Computer[] computers;
    private Jacket[] jackets;

    public Shop() {
        computers = new Computer[10];
        jackets = new Jacket[10];
    }

    public void addComputer(Computer computer) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == null) {
                computers[i] = computer;
                break;
            }
        }

    }

    public void addJacket(Jacket jacket) {
        for (int i = 0; i < jackets.length; i++) {
            if (jackets[i] == null) {
                jackets[i] = jacket;
                break;
            }
        }
    }

    @Override
    public String toString() {
        String result = "";

        for (Computer computer : computers) {
            if (computer != null) {
                result += computer + "\n";
            }
        }

        for (Jacket jacket : jackets) {
            if (jacket != null) {
                result += jacket + "\n";
            }
        }

        return result;
    }
}
