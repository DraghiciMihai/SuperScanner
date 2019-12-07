public class Main {
    public static void main(String[] args) {
        SuperScanner superScanner = new SuperScanner();
        System.out.println("Care este numele fisierului?");
        String numeFisier = superScanner.next() + ".txt";
        System.out.println("Ce doriti sa adaugati in fisier?");
        String textDeScris = superScanner.next();
        superScanner.writeToFile(numeFisier, textDeScris);
        String totTextul =  superScanner.readFromFile(numeFisier);
        System.out.println(totTextul);
    }
}
