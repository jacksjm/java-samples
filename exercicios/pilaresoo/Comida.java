package exercicios.pilaresoo;

public abstract class Comida {

    private int peso;
    private String marca;
    private double preco;

    public Comida(String marca, int peso, double preco){
        this.marca = marca;
        this.peso = peso;
        this.preco = preco;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getMarca(){
        return this.marca;
    }

    public int getPeso(){
        return this.peso;
    }

    public double getPreco(){
        return this.preco;
    }

    public String toString(){
        return "Marca:" + this.getMarca() + "\n" +
                "Peso: " + this.getPeso() + "\n" + 
                "Preco: " + this.getPreco();
    }

    public boolean equals(Comida comida){
        return this.getMarca() == comida.getMarca();
    }
}