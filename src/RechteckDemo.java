public class RechteckDemo {
    public static void main(String[] args) {
        // System.out.println("Hello World!"); // erste Überprüfung ob die Umgebung lauffähig ist.

        int breite = 4;
        int laenge = 6;
        int umfang = (2 * (laenge + breite));
        int flaeche = (laenge * breite);

        System.out.println("Der Umfang beträgt: " + umfang + " cm");
        System.out.println("Die Fläche beträgt: " + flaeche + " cm²");
    }
}
