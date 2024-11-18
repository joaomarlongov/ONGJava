import java.util.Date;

public class SistemaONG {
    public static void main(String[] args) {
        ONG ong = new ONG("Amigos dos Animais", "Rua das Flores, 123", "1234-5678", "contato@amigosdosanimais.org");

        Animal animal1 = new Animal(1, "Bobby", 3, "Labrador", "Saudável", true);
        Animal animal2 = new Animal(2, "Fred", 5, "Spitz", "Saudável", false);
        Animal animal3 = new Animal(3, "Bruce", 4, "Viralata", "Saudável", true);
        Animal animal4 = new Animal(4, "Princesa", 7, "Pitbull", "Doente", false);
        Animal animal5 = new Animal(5, "Luna", 2, "Poodle", "Saudável", true);
        Animal animal6 = new Animal(6, "Thor", 6, "Rottweiler", "Doente", false);
        Animal animal7 = new Animal(7, "Nina", 1, "Siamês", "Saudável", true);
        Animal animal8 = new Animal(8, "Max", 4, "Golden Retriever", "Saudável", true);

        Adotador adotador1 = new Adotador(1, "João Silva", "9876-5432", "joao@email.com", "Rua das Acácias, 45");
        Adotador adotador2 = new Adotador(2, "Ana Oliveira", "8765-4321", "ana@email.com", "Rua dos Ipês, 78");
        Adotador adotador3 = new Adotador(3, "Pedro Santos", "7654-3210", "pedro@email.com", "Rua das Rosas, 90");
        Adotador adotador4 = new Adotador(4, "Mariana Lima", "6543-2109", "mariana@email.com", "Rua das Margaridas, 112");
        Adotador adotador5 = new Adotador(5, "Clara Mendes", "5432-8765", "clara@email.com", "Rua dos Lírios, 234");
        Adotador adotador6 = new Adotador(6, "Roberto Alves", "4321-9876", "roberto@email.com", "Avenida Central, 567");
        Adotador adotador7 = new Adotador(7, "Beatriz Costa", "3210-8765", "beatriz@email.com", "Rua das Palmeiras, 890");
        Adotador adotador8 = new Adotador(8, "Fernando Lima", "2109-7654", "fernando@email.com", "Rua dos Girassóis, 123");

        ong.cadastrarAnimal(animal1);
        ong.cadastrarAnimal(animal2);
        ong.cadastrarAnimal(animal3);
        ong.cadastrarAnimal(animal4);
        ong.cadastrarAnimal(animal5);
        ong.cadastrarAnimal(animal6);
        ong.cadastrarAnimal(animal7);
        ong.cadastrarAnimal(animal8);

        Doador doador1 = new Doador(1, "Maria Oliveira", "8765-4321", "maria@email.com");
        Doador doador2 = new Doador(2, "Carlos Santos", "7654-3210", "carlos@email.com");
        Doador doador3 = new Doador(3, "Ana Maria", "6543-2109", "ana@email.com");
        Doador doador4 = new Doador(4, "Luiz Oliveira", "5432-1098", "luiz@email.com");
        Doador doador5 = new Doador(5, "Paulo Souza", "4321-8765", "paulo@email.com");
        Doador doador6 = new Doador(6, "Julia Santos", "3210-7654", "julia@email.com");
        Doador doador7 = new Doador(7, "Ricardo Pereira", "2109-6543", "ricardo@email.com");
        Doador doador8 = new Doador(8, "Camila Ferreira", "1098-5432", "camila@email.com");
        
        Doacao doacao1 = new Doacao(1, "Ração", 10, new Date(), doador1);
        Doacao doacao2 = new Doacao(2, "Cobertores", 3, new Date(), doador2);
        Doacao doacao3 = new Doacao(3, "Ração", 15, new Date(), doador3);
        Doacao doacao4 = new Doacao(4, "Dinheiro", 100, new Date(), doador4);
        Doacao doacao5 = new Doacao(5, "Medicamentos", 5, new Date(), doador5);
        Doacao doacao6 = new Doacao(6, "Brinquedos", 8, new Date(), doador6);
        Doacao doacao7 = new Doacao(7, "Ração", 20, new Date(), doador7);
        Doacao doacao8 = new Doacao(8, "Dinheiro", 200, new Date(), doador8);

        ong.cadastrarDoador(doador1);
        ong.cadastrarDoador(doador2);
        ong.cadastrarDoador(doador3);
        ong.cadastrarDoador(doador4);
        ong.cadastrarDoador(doador5);
        ong.cadastrarDoador(doador6);
        ong.cadastrarDoador(doador7);
        ong.cadastrarDoador(doador8);

        ong.cadastrarAdotador(adotador1);
        ong.cadastrarAdotador(adotador2);
        ong.cadastrarAdotador(adotador3);
        ong.cadastrarAdotador(adotador4);
        ong.cadastrarAdotador(adotador5);
        ong.cadastrarAdotador(adotador6);
        ong.cadastrarAdotador(adotador7);
        ong.cadastrarAdotador(adotador8);
        
        ong.registrarDoacao(doacao1);
        ong.registrarDoacao(doacao2);
        ong.registrarDoacao(doacao3);
        ong.registrarDoacao(doacao4);
        ong.registrarDoacao(doacao5);
        ong.registrarDoacao(doacao6);
        ong.registrarDoacao(doacao7);
        ong.registrarDoacao(doacao8);
        adotador1.adotarAnimal(animal1);

        // Listando animais cadastrados na ONG

        System.out.println("\n=== ANIMAIS ADOTADOS ===");
        for (Animal animal : ong.listarAnimais()) {
            if (!animal.isDisponivelParaAdocao()) {
                System.out.println("Animal: " + animal.getNome() + " - " + animal.getRaca());
                System.out.println("Idade: " + animal.getIdade() + " anos");
                System.out.println("Estado de saúde: " + animal.getEstadoSaude() + "\n");
            }
        }

        System.out.println("\n=== ANIMAIS DISPONÍVEIS PARA ADOÇÃO ===");
        for (Animal animal : ong.listarAnimais()) {
            if (animal.isDisponivelParaAdocao()) {
                System.out.println("Animal: " + animal.getNome() + " - " + animal.getRaca());
            }
        }


        System.out.println("\n=== DOAÇÕES REGISTRADAS ===");
        for (Doacao doacao : ong.listarDoacoes()) {
            System.out.println("Item: " + doacao.getTipoItem());
            System.out.println("Quantidade: " + doacao.getQuantidade());
            System.out.println("Doador(a): " + doacao.getDoador().getNome() + "\n");
        }

        System.out.println("\n=== ANIMAIS CADASTRADOS ===");
        for (Animal animal : ong.listarAnimais()) {
            System.out.println("Animal: " + animal.getNome() + " - " + 
                (animal.isDisponivelParaAdocao() ? "Disponível para adoção" : "Indisponível para adoção"));
        }

        System.out.println("\n=== DOADORES CADASTRADOS ===");
        for (Doador doador : ong.listarDoadores()) {
            System.out.println("Doador: " + doador.getNome());
        }

        System.out.println("\n=== ADOTADORES CADASTRADOS ===");
        for (Adotador adotador : ong.listarAdotadores()) {
            System.out.println("Adotador: " + adotador.getNome());
        }
    }
}