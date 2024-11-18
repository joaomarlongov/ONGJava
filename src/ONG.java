import java.util.ArrayList;
import java.util.List;

public class ONG {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private List<Animal> animais = new ArrayList<>();
    private List<Doador> doadores = new ArrayList<>();
    private List<Adotador> adotadores = new ArrayList<>();
    private List<Doacao> doacoes = new ArrayList<>();
    public ONG(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void cadastrarDoador(Doador doador) {
        doadores.add(doador);
    }

    public void cadastrarAdotador(Adotador adotador) {
        adotadores.add(adotador);
    }


    public void registrarDoacao(Doacao doacao) {
        doacoes.add(doacao);
    }

    public List<Animal> listarAnimais() {
        return animais;
    }

    public List<Doador> listarDoadores() {
        return doadores;
    }

    public List<Adotador> listarAdotadores() {
        return adotadores;
    }

    public List<Doacao> listarDoacoes() {
        return doacoes;
    }

}