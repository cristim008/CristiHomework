//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Runnable helloRunnable =()-> System.out.println("Hello Word");

        Thread thread=new Thread(helloRunnable);
        thread.start();
        }
    }
