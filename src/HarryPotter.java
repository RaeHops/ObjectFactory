public class HarryPotter {

    String name;
    String house;
    String haircolor;

    public HarryPotter(String hname, String hhouse, String hhaircolor){

     name = hname;
     house = hhouse;
     haircolor = hhaircolor;
     describeHarryPotter();

    }
    public HarryPotter(){
        name = "Draco";
        house = "Slytherin";
        haircolor = "blonde";


    }
    public void describeHarryPotter(){
        System.out.println("this characters name is " +name+ ". they are in " +house+ " house. Their hair color is " +haircolor+ ".");
    }


}
