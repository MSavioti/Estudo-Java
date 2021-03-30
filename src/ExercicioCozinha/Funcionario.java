package ExercicioCozinha;

public class Funcionario {
    private String nome;
    private Funcao funcao;

    public enum Funcao {
        Cozinheiro, Ajudante, Limpeza, Outro
    }

    public Funcionario(String nome, Funcao funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario: \n - Nome: " + nome + "\n - Função: " + funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
}
