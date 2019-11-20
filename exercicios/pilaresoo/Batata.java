package exercicios.pilaresoo;

public class Batata extends Comida implements PrecoTotal, PrecoPorItem {

    public Batata(){
        this("Batata do Moacir", 10, 2.5);
    }

    private Batata(String marca, int peso, double preco){
        super(marca, peso, preco);
    }

    @Override
    public String getMarca(){
        return "Batata";
    }

    public double precoTotal() {
        return this.getPeso() * this.getPreco();
    }

    public String precoPorItem(){
        return "O preço da " + this.getMarca() + " é R$" + this.getPreco(); 
    }

}