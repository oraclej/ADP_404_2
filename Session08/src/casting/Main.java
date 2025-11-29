package casting;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Creature creature = new Eagle(); // UpCasting - Automatic
//        creature.hunt();
        Fish fish = (Fish) creature;


        ////////////////

//        TreeSet s = new TreeSet(); // child
//        SortedSet s2 = new TreeSet(); //parent
//        s.first();
//        s2.first();
    }
}
