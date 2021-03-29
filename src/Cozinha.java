import java.util.ArrayList;

public class Cozinha {
    private int horaAbertura;
    private int horaFechamento;
    private String pratoPrincipal;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Funcionario> funcionarios;

    public Cozinha(int horaAbertura, int horaFechamento, String pratoPrincipal) {
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
        ingredientes = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }
}
