import org.kohsuke.randname.RandomNameGenerator;

public class Litvinova {
    public static void main(String[] args) {
        System.out.println("I am Litvinova Tatyana");
        RandomNameGenerator rnd = new RandomNameGenerator(0);
        Litvinova litvinova = new Litvinova();
        litvinova.first(rnd);
        System.out.println();
        litvinova.second(rnd);
    }
    public void first(RandomNameGenerator randomNameGenerator) {
        for(int i = 0; i < 4; i++) {
            System.out.println("Hello, " + randomNameGenerator.next());
        }
    }
    public void second(RandomNameGenerator radndomNameGenerator) {
        for(int i = 0; i < 15; i++) {
            System.out.println("Hello, "+radndomNameGenerator.next());
        }
    }
}
