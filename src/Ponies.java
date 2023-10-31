public class Ponies {
    //true/false -> boolean
    //numbers -> int, double int
    //words -> Strings

    boolean isUnicorn = false;
    boolean isPegasus = false;

    double size = 20.56;
    String name = "Pinkie Pie";
    String color = "pink";

    public void describePony(){
        System.out.println("this is pony " + name + ". they are the color " + color + ". The size of " +name+ " is " + size + " inches. it is " +isUnicorn+ " that the pony is a unicorn. it is "+isPegasus+" that the pony is a pegasus");
    }
}
