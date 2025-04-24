package n2;

public class Produto {

    // atributos
    private String nome;
    private double preco;
    private int qtd;

    // construtor
    public Produto (String nome, double preco, int qtd) {
        setNome(nome);
        setPreco(preco);
        setQtd(qtd);
    }

    // métodos
    public double calcularValorTotal() {
        return preco * qtd;
    }

    public void aplicarDesconto(double percentual) { // ele só quer aplicar o desconto e não mostrar -> void
        double desconto = preco * (percentual / 100);
        setPreco(preco - desconto);
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0.0) {
            this.preco = preco;
        }
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if (qtd > 0) {
            this.qtd = qtd;
        }
    }
    
}