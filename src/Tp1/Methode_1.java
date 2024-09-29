package Tp1;

public class Methode_1 extends Thread{
    private char alpha_1;
    private char alpha_2;

    //constructor
    public Methode_1(char alpha_1,char alpha_2){
        this.alpha_1=alpha_1;
        this.alpha_2=alpha_2;
    }

    //Setters and Getters

    public char getAlpha_2() {
        return alpha_2;
    }

    public char getAlpha_1() {
        return alpha_1;
    }

    public void setAlpha_1(char alpha_1) {
        this.alpha_1 = alpha_1;
    }

    public void setAlpha_2(char alpha_2) {
        this.alpha_2 = alpha_2;
    }

    @Override
    public void run() {
        for (char i=alpha_1;i<=alpha_2;i++){
            System.out.println(i);
        }
    }
}
