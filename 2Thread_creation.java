class Demothread1 extends Thread{
    public void run(){// over ride run method in thread class
        System.out.println("Child thread 1");
    }
}
class Demothread2 extends Thread{
    public void run(){// over ride run method in thread class
        System.out.println("Child thread2");
    }
}
public class Main{
    public static void main(String[] args){
        Demothread1 t1=new Demothread1();//instantiation
        Demothread2 t2=new Demothread2();
        t1.start();//strt method automatically call the run()
        t2.start();
    }
}
