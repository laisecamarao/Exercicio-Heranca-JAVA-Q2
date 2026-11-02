public class Vendedor extends Colaborador {
    protected double totalVendas;

    public Vendedor(String nome, String matricula) {
        super(nome, matricula);
        this.totalVendas = 0.0;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void registrarVenda(double valor) {
        totalVendas = totalVendas + valor;
    }

    public double calcularComissao() {
        if (totalVendas >= 5000.0) {
            return totalVendas * 0.05;
        }
        else{
            return totalVendas * 0.03;
        }
    }
}
