public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Object Factory!");
        Ponies p = new Ponies();
        System.out.println(p.isUnicorn);
        p.isUnicorn = true;
        System.out.println(p.isUnicorn);
        System.out.println(p.name);

        p.describePony();

        Ponies a;
        a = new Ponies();
        a.name = "Apple Jack";
        System.out.println("pony a's name is" + a.name);
    }
}