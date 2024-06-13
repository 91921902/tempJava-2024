class ImovelDeAluguel extends Imovel {
    private float valorDoAluguel;
    private String disponibilidade; // "Sim" ou "Não"

    // Construtor da classe ImovelDeAluguel
    public ImovelDeAluguel(int id, String endereco, String area, int numeroQuartos, String tipo, String padrao, float valorDoAluguel, String disponibilidade, String precisaReforma) {
        super(id, endereco, area, numeroQuartos, tipo, padrao, precisaReforma);
        this.valorDoAluguel = valorDoAluguel;
        this.disponibilidade = disponibilidade;
    }

    // Método para alugar o imóvel
    public void alugarImovel() {
        if (disponibilidade.equalsIgnoreCase("sim")) {
            disponibilidade = "não";
            System.out.println("Imóvel ID: " + getId() + " Valor: R$" + valorDoAluguel);
        } else {
            System.out.println("Imóvel ID: " + getId() + " já está alugado.");
        }
    }

    // Método para devolver o imóvel
    public void devolverImovel() {
        if (disponibilidade.equalsIgnoreCase("não")) {
            disponibilidade = "sim";
            System.out.println("Imóvel ID: " + getId() + " devolvido com sucesso.");
        } else {
            System.out.println("Imóvel ID: " + getId() + " não está alugado.");
        }
    }

    public void setValorDoAluguel(float valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    // Getter para o valor do aluguel
    public float getValorDoAluguel() {
        return valorDoAluguel;
    }

    // Getter para a disponibilidade
    public String getDisponibilidade() {
        return disponibilidade;
    }
}
