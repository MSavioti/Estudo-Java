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
}
