class ImovelDeVenda extends Imovel {
    private float preco;

    // Construtor da classe ImovelDeVenda
    public ImovelDeVenda(int id, String endereco, String area, int numeroQuartos, String tipo, String padrao, float preco, String precisaReforma) {
        super(id, endereco, area, numeroQuartos, tipo, padrao, precisaReforma);
        this.preco = preco;
    }

    // Getter para o preço
    public float getPreco() {
        return preco;
    }
}
