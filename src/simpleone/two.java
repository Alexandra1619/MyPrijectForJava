package simpleone;

public class two extends Thread{
   private String name;
    public two(String name)
    {
        this.name=name;
    }



    @Override
    public void run() {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Имя этому "+name+" Имя потока "+getName());
        System.out.println(" - Сколько я проспал? \n - " + ((System.currentTimeMillis()-start)));

    }
}
