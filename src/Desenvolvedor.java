public class Desenvolvedor extends Funcionario {

    private int quantidadeProjetos;


    public Desenvolvedor(String nome, double salarioBase, int quantidadeProjetos) {
        super(nome, salarioBase);
        this.quantidadeProjetos = quantidadeProjetos;
    }


    public int getQuantidadeProjetos() {
        return quantidadeProjetos;
    }

    public void setQuantidadeProjetos(int quantidadeProjetos) {
        this.quantidadeProjetos = quantidadeProjetos;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (quantidadeProjetos * 600);
    }
}


