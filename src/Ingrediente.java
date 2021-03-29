import java.time.LocalDate;

public class Ingrediente {
    private String nome;
    private LocalDate dataValidade;

    public Ingrediente(String nome, LocalDate dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }
}
