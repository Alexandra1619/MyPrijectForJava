package simpleone;

public class two implements Runnable{
   private String name;
    public two(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println("Имя этому "+name+"");

    }
}
