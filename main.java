
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intelligence level: ");
        double intelligence = sc.nextDouble();
        var i = 1;
        double total = 0;
        while (i < 11) {

            double basedmg = intelligence * 5;
            double modifier = rand.nextDouble() + 0.5;
            double moddmg = modifier * basedmg;
            System.out.println(moddmg);
            total = total + moddmg;

            i++;

        }
        System.out.println("The monster was dealt a total of " + total + " damage after 10 turns.");
        System.out.println("Intelligence level was "+ intelligence + ".");
        //7 times the monster was killed out of 10 trials
    }
}



//second version of code for intelligence lvl of 10


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intelligence level: ");
        double intelligence = sc.nextDouble();
        var i = 1;
        double total = 0;
        while (i < 11) {

            double basedmg = intelligence * 11;
            double modifier = rand.nextDouble() + 0.5;
            double moddmg = modifier * basedmg;
            System.out.println(moddmg);
            total = total + moddmg;

            i++;

        }
        System.out.println("The monster was dealt a total of " + total + " damage after 10 turns.");
        //7 times the monster was killed out of 10 trials
    }
}
