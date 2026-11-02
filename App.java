public class App {
    public static void main(String[] args) throws Exception {
        Vendedor v = new Vendedor("Alan", "26070048");
        Tecnico t = new Tecnico("Isabella", "26070014", 67);

        System.out.println("=+=Vendedor=+=");
        System.out.println("Nome: " + v.getNome());
        System.out.println("Matrícula: " + v.getMatricula());

        v.registrarVenda(3000);

        System.out.println("\nTotal de vendas: " + v.getTotalVendas());
        System.out.println("Comissão: " + v.calcularComissao());

        //so pra atingir 5000
        v.registrarVenda(2000);

        System.out.println("\nTotal de vendas: " + v.getTotalVendas());
        System.out.println("Comissão: " + v.calcularComissao());

        System.out.println("\n=+= TÉCNICO =+=");
        System.out.println("Nome: " + t.getNome());
        System.out.println("Matrícula: " + t.getMatricula());

        System.out.println("Orçamento (3 horas): " + t.calcularOrcamento(3));

        System.out.println("Orçamento (0 horas): " + t.calcularOrcamento(0));
    }
}
