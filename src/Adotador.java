public class Adotador {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    public Adotador(int id, String nome, String telefone, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public void adotarAnimal(Animal animal) {
        animal.marcarComoAdotado(this, animal);
    }

    public String getNome() {
        return nome;
    }
}