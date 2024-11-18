import java.util.ArrayList;
import java.util.List;

public class Doador {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private List<Doacao> doacoes = new ArrayList<>();

    public Doador(int id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void realizarDoacao(Doacao doacao) {
        doacoes.add(doacao);
        System.out.println("\n=== NOVA DOAÇÃO REGISTRADA ===");
        System.out.println("Item: " + doacao.getTipoItem());
        System.out.println("Quantidade: " + doacao.getQuantidade());
        System.out.println("Doador(a): " + doacao.getDoador().getNome());
    }

    public String getNome() {
        return nome;
    }
}