package demo.thread.classes;

public class Test {

	public static void main(String[] args) 
    {
        //Thread t=new Thread(new MyRun(),"My Name");
		ThreadClass t=new ThreadClass("My Thread 1");
        t.start();
        t.interrupt();
        /*System.out.println("ID "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        t.start();
        System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());*/
    }
}
