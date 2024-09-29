package Tp1.Exercice2;

import javax.swing.*;

public class HorlogeGraphique extends Thread{
    JLabel label;
    public HorlogeGraphique(JLabel label){
        this.label=label;
    }
    @Override
    public void run() {
        String minutes="00";
        String secondes="00";
        label.setText(minutes+":"+secondes);
        int sec=0;
        int min=0;
        while (true){
            try {
                Thread.sleep(1000);
                sec++;
                if(sec<60){
                    if(sec<10){
                        secondes="0"+sec;
                    }
                    else{
                        secondes= String.valueOf(sec);
                    }
                }
                else{
                    sec=0;
                    min++;
                    secondes="0"+sec;
                }
                if(min<59){
                    if(min<10){
                        minutes="0"+min;
                    }
                    else {
                        minutes=String.valueOf(min);
                    }
                }
                label.setText(minutes+":"+secondes);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


