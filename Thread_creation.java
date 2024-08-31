//Creation of thread by extending Thread classes
class Demothread extends Thread{
    public void run(){// over ride run method in thread class
        System.out.println("Child thread");
    }
}
public class Main{
    public static void main(String[] args){
        Demothread t1=new Demothread();//instantiation
        t1.start();//strt method automatically call the run()
    }
}
