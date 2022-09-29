public class ZinsDemo {
    public static void main(String[] args) {
        // System.out.println("Hello World!"); // erste Überprüfung ob die Umgebung lauffähig ist.

        /*
        double kontostand;
        double zinsen;

        kontostand = 1000;
        zinsen = 2.25;

        double erhalteneZinsen = (zinsen * kontostand / 100);

        System.out.println("Die erhaltenen Zinsen belaufen sich auf " + erhalteneZinsen + " €.");
        */

        double zinsen = getZinsen(1000, 2.25);
        System.out.println("Die erhaltenen Zinsen belaufen sich auf " + zinsen + " €.");

        System.out.println("Die erhaltenen Zinsen belaufen sich auf " + getZinsen(745,3.39) + " €.");

        System.out.println("Die erhaltenen Zinsen belaufen sich auf " + getZinsen(2436,1.75) + " €.");

    }

    public static double getZinsen (double kontostand, double zinsen) {
        double erhalteneZinsen = (zinsen * kontostand / 100);
        return erhalteneZinsen;
    }
}