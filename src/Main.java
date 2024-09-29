import Tp1.Exercice3.Animal;
import Tp1.Methode_1;
import Tp1.Methode_2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Exercice_1
        /*Methode_1 thread_1=new Methode_1('r','z');
        Methode_1 thread_2=new Methode_1('A','Q');
        Methode_2 thread_3= new Methode_2(1,60);
        Thread thread= new Thread(thread_3);

        thread_1.start();
        thread_2.start();
        thread.start();
    }
}*/
        Thread Lievre = new Thread(new Animal(10), "Lievre");
        Thread Tortue = new Thread(new Animal(8), "Tortue");
        Lievre.start();
        Tortue.start();



    }
}