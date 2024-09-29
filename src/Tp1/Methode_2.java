package Tp1;

public class Methode_2 implements Runnable{
    private int entier_1;
    private int entier_2;

    public Methode_2(int entier_1,int entier_2){
        this.entier_1=entier_1;
        this.entier_2=entier_2;
    }

    public int getEntier_1() {
        return entier_1;
    }

    public int getEntier_2() {
        return entier_2;
    }

    public void setEntier_1(int entier_1) {
        this.entier_1 = entier_1;
    }

    public void setEntier_2(int entier_2) {
        this.entier_2 = entier_2;
    }


    @Override
    public void run() {
        for (int i=entier_1;i<=entier_2;i+=2){
            System.out.println(i);
        }
    }
}
