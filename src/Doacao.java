import java.util.Date;

public class Doacao {
    private int id;
    private String tipoItem;
    private int quantidade;
    private Date data;
    private Doador doador;

    public Doacao(int id, String tipoItem, int quantidade, Date data, Doador doador) {
        this.id = id;
        this.tipoItem = tipoItem;
        this.quantidade = quantidade;
        this.data = data;
        this.doador = doador;
    }

    public void registrarDoacao(Doador doador) {
        doador.realizarDoacao(this);
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Doador getDoador() {
        return doador;
    }

    

}