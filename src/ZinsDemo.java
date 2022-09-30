public class ZinsDemo {
    public static void main(String[] args) {
        double kontostand;
        double zinsen;

        kontostand = 10000;
        zinsen = 5.5;

        double ergebnis;
        ergebnis = (kontostand * 5.5) / 100;

        System.out.println(ergebnis);
        System.out.println(zinsrechnung(2500, 1.5));
    }
    public static double zinsrechnung(double kontostand, double zinsen) {
        double result = (kontostand * 5.5) / 100;
        return result;
    }
}
