import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Funcionario> Funcionario = new ArrayList<>();

        // Adicionando diferentes tipos de funcionários
        Funcionario.add(new Desenvolvedor("Ana", 3000, 3));
        Funcionario.add(new Desenvolvedor("Bruno", 2800, 5));
        Funcionario.add(new Gerente("Carla", 5000, 1500));
        Funcionario.add(new Gerente("Diego", 6000, 2000));


        System.out.println("=== Folha de Pagamento ===");
        for (Funcionario f : Funcionario) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário final: R$ " + f.calcularSalario());
            System.out.println("--------------------------");
        }
    }
}