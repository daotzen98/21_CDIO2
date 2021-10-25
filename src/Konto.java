public class Konto {

    static int Saldo, x;

    public void Saldo(){
        Saldo = 1000 + x;
    }
    public static int getSaldo(){
        return Saldo;
    }
    public static int addSaldo(int x){
        return Saldo += x;
    }
}
