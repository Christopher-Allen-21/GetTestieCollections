package rocks.zipcode;

import java.util.HashSet;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        HashSet<String> myHashSet = new HashSet();
        myHashSet.add("Chris");
        myHashSet.add("Robert");
        myHashSet.add("Stephen");
        myHashSet.remove("Robert");


    }
}
