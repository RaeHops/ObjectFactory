public class Ponies {
    //true/false -> boolean
    //numbers -> int, double int
    //words -> Strings

    boolean isUnicorn;
    boolean isPegasus;

    double size;
    String name;
    String color;

    public Ponies(String pName, String pColor, double pSize, boolean pIsPegasus, boolean pIsUnicorn){
        //Constructors are special methods
        //Constructors dont have "void" like other methods
        //Constructors need to have the same exact name as the class.
        System.out.println("Made a new pony!");
        isUnicorn = pIsUnicorn;
        isPegasus = pIsPegasus;
        size = pSize;
        name = pName;
        color = pColor;

        describePony();



        if(color.equals("pink")) {
            System.out.println("I am a PINK pony!");
        }else{
            System.out.println("I am NOT a PINK pony!");
        }

    }

    public Ponies(){ //method ovrloading: we have the same name for 2 methods, but different perameters.
        isUnicorn = true;
        isPegasus = false;
        size = 22.5;
        name = "Twilight Sparkle";
        color = "purple";
        describePony();
    }

    public void describePony(){
        System.out.println("this is pony " + name + ". they are the color " + color + ". The size of " +name+ " is " + size + " inches. it is " +isUnicorn+ " that the pony is a unicorn. it is "+isPegasus+" that the pony is a pegasus");
    }
}
