import java.util.Scanner;

public class Spiller {
   private String name;
   private int Saldo = 1000;

   public Spiller(String name){
       this.name = name;
   }
   public int getSaldo (){
       return Saldo;
   }
   public void setSaldo(int x){
       Saldo += x;
   }

   public String toString(){
       String toReturn = name + " Balance: " + Saldo;
       return toReturn;
   }
    }

