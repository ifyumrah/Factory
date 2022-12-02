public class City {
    int pop;
    String cont;
    String name;
    int avgTemp;

    public City(){
        name = "Lagos";
        pop = 1000;
        cont = "Ohio";
        avgTemp = 20;
        print();
    }

    public void print(){
        System.out.println("The city " + name + " in " + cont);
        System.out.println("has an average temp of " + avgTemp + " and a population of " + pop);


    }
}
