public class Konto {

    static int Saldo = 1000;

    public static int getSaldo(){
        return Saldo;
    }
    public static int addSaldo(int x){
        return Saldo += x;
    }
}
