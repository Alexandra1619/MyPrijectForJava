package simpleone;

public class one {
    public static void main(String[] args) throws InterruptedException {
        String name="Карл";
        String name1="Джон";
        long start = System.currentTimeMillis();
        two now=new two(name);
        two now1=new two(name1);
        now1.start();
        now1.join();
        now.start();

        Thread.sleep(5000);

        System.out.println(" А сколько тут проспал? \n - " + ((System.currentTimeMillis()-start)));

    }
}
