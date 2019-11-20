package exercicios.pilaresoo;

public class Verdureira {
    public static void main(String[] args) {
        Batata batata = new Batata();
        Batata batataNova = new Batata();

        System.out.println(batata);
        System.out.println(batataNova);

        System.out.println("Comparação do objeto");
        System.out.println(batata == batataNova);
        System.out.println(batata.equals(batataNova));
    }
}