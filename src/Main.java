public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Object Factory!");
        Ponies p = new Ponies("Pinky Pie", "pink", 20.56, false, true);
        System.out.println(p.isUnicorn);
        p.isUnicorn = true;
        System.out.println(p.isUnicorn);
        System.out.println(p.name);



        Ponies a;
        a = new Ponies("Apple Jack", "orange", 19.89, true, false); //this "Ponies" is a constructor, there is no "Ponies" method in ponies.java so it is a constructor method.
        // a.name = "Apple Jack";
        System.out.println("pony a's name is " + a.name);


        Ponies f;
        f = new Ponies("Fluttershy", "yellow", 17.38, true, true);
        // f.name = "Fluttershy";
        //f.color = "yellow";
        //f.size = 17.38;
        //f.isUnicorn = false;
        //f.isPegasus = true;
        System.out.println("pony f's name is " + f.name);


        Ponies t;
        t = new Ponies();
        System.out.println("pony t's name is " + t.name);


        Ponies r;
        r = new Ponies("Rainbow Dash", "Blue", 55.55, false, true);
        System.out.println("pony r's name is " + r.name);


        HarryPotter h;
        h = new HarryPotter("Harry Potter", "Gryffindor", "brown hair");

        HarryPotter d;
        d = new HarryPotter();
        d.describeHarryPotter();

    }
}