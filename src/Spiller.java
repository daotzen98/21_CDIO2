public class Spiller {
    private String name;
    private int Saldo = 1000;

    public Spiller(String name) {
        this.name = name;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int x) {
        Saldo += x;
    }

    public String toString() {
        String toReturnDansk = name + " din balance er nu: " + Saldo;
        return toReturnDansk;
    }

    public String toStringEngelsk() {
        String toReturnEngelsk = name + " your balance is now: " + Saldo;
        return toReturnEngelsk;

    }

    public String toName() {
        String returnName = name;
        return returnName;
    }
}

