public class Tecnico extends Colaborador {
    private double valorHora;

    public Tecnico(String nome, String matricula, double valorHora) {
        super(nome, matricula);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double calcularOrcamento(int horas) {
        if (horas > 0) {
            return horas * valorHora;
        }
        else{
            return 0;
        }
    }
}
