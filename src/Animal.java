public class Animal {
    private int id;
    private String nome;
    private int idade;
    private String raca;
    private String estadoSaude;
    private boolean disponivelParaAdocao;


    public Animal(int id, String nome, int idade, String raca, String estadoSaude, boolean disponivelParaAdocao) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.estadoSaude = estadoSaude;
        this.disponivelParaAdocao = disponivelParaAdocao;
    }

    public String getNome() {
        return nome;
    }

    public void marcarComoAdotado(Adotador adotador, Animal animal) {
        if (disponivelParaAdocao) {
            disponivelParaAdocao = false;

        } else {
          
        }
    }

    public void atualizarEstadoSaude(String novoEstado) {
        this.estadoSaude = novoEstado;
    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isDisponivelParaAdocao() {
        return disponivelParaAdocao;
    }
}