package Tp1.Exercice3;

public class Animal extends Thread{
    private static String vainqueure;
    private final int distanceTotale=100;
    private int pas;

    //constructor
    public Animal(int pas){
        this.pas=pas;
    }

    public int getDistanceTotale() {
        return distanceTotale;
    }

    public int getPas() {
        return pas;
    }

    public String getVainqueure() {
        return vainqueure;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }

    public void setVainqueure(String vainqueure) {
        this.vainqueure = vainqueure;
    }

    @Override
    public void run() {
        courir();

    }

    public void courir(){
        String threadName= Thread.currentThread().getName();
        Boolean a=true;

        for (int dis=0;dis<=distanceTotale;dis+=pas){
            try {
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(threadName+" : "+dis+"m");

            if(threadName.equals("Lievre") && dis >20 && a == true){
                try{
                    System.out.println("Lievre dort");
                    sleep(10000);
                    System.out.println("Lievre reveillé");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                a=false;
            }

        }
        if(vainqueure==null){
            vainqueure=threadName;
            System.out.println("Le vainqueure est :"+vainqueure);
        }
        else {
            System.out.print(threadName+"n'est pas le vainqueure");
        }
    }
}
