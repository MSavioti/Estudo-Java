import java.util.ArrayList;

public class Cozinha {
    private Especialidade especialidade;
    private int horaAbertura;
    private int horaFechamento;
    private String pratoPrincipal;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Funcionario> funcionarios;

    public enum Especialidade {
        Mineira, Chinesa, Italiana, Japonesa, Mexicana
    }

    public Cozinha(Especialidade especialidade, int horaAbertura, int horaFechamento, String pratoPrincipal) {
        this.especialidade = especialidade;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
        ingredientes = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }

    @Override
    public String toString() {
        String mensagem = "";
        mensagem += "Cozinha de especialidade " + especialidade + ":\n";
        mensagem += "Horário de abertura: " + horaAbertura + "hrs\n";
        mensagem += "Horário de fechamento: " + horaFechamento + "hrs\n";
        mensagem += "Prato principal: " + pratoPrincipal + "\n";
        mensagem += "Ingredientes:\n";

        for (Ingrediente ingrediente : ingredientes) {
            mensagem += " - " + ingrediente.toString() + "\n";
        }

        mensagem += "Funcionários:\n";

        for (Funcionario funcionario : funcionarios) {
            mensagem += " - " + funcionario.toString() + "\n";
        }

        return mensagem;
    }

    public void adicionarIndrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public int getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(int horaAbertura) {
        this.horaAbertura = horaAbertura;
        validarHorarios();
    }

    public int getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(int horaFechamento) {
        this.horaFechamento = horaFechamento;
        validarHorarios();
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    private void validarHorarios() {
        if (horaAbertura > 23)
            horaAbertura = 23;

        if (horaAbertura < 0)
            horaAbertura = 0;

        if (horaFechamento > 23)
            horaFechamento = 23;

        if (horaFechamento < 0)
            horaFechamento = 0;
    }
}
