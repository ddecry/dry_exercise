package dry_exercise;

public abstract class Produto {
    String nome;
    double precoBase;
    double percentualDesconto;

    public Produto(String nome, double precoBase, double percentualDesconto) {
        super();
        this.nome = nome;
        this.precoBase = precoBase;
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularPreco() {
        return precoBase - (precoBase * percentualDesconto);
    }

    public void exibirPreco() {
        System.out.printf("Preço final do %s: R$%.2f%n", nome, calcularPreco());
    }

}