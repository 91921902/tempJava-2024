class Imovel {
    private String endereco;
    private String area;
    private int numeroQuartos;
    private int id;
    private String tipo; // Tipo do imóvel: Casa, Apartamento, Comercial
    private String padrao; // Padrão do imóvel: Alto, Médio, Baixo
    protected String precisaReforma; // Atributo para indicar se precisa reforma ("sim" ou "não")

    // Construtor da classe Imovel
    public Imovel(int id, String endereco, String area, int numeroQuartos, String tipo, String padrao, String precisaReforma) {
        this.id = id;
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.tipo = tipo;
        this.padrao = padrao;
        this.precisaReforma = precisaReforma;
    }

    // Método para reformar o imóvel
    public void reformar() {
        if (precisaReforma.equalsIgnoreCase("sim")) {
            precisaReforma = "não";
            System.out.println("Reforma iniciada para o imóvel ID: " + id);
        } else {
            System.out.println("Reforma não necessária para o imóvel ID: " + id);
        }
    }

    // Getters para os atributos
    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getArea() {
        return area;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPadrao() {
        return padrao;
    }
}