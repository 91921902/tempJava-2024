
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Imovel> imoveis = new ArrayList<>();

        // Adicionar objetos Imovel, ImovelDeAluguel e ImovelDeVenda à lista
        Imovel apLua = new Imovel(1, "Rua A, 123", "120m²", 3, "Apartamento", "Alto", "sim");
        ImovelDeAluguel casaTed = new ImovelDeAluguel(2, "Rua B, 456", "80m²", 2, "Casa", "Médio", 1500.0f, "sim", "não");
        Imovel casaMara = new Imovel(3, "Rua C, 654", "100m²", 5, "Casa", "Alto", "não");
        Imovel apSamara = new Imovel(4, "Rua D, 589", "200m²", 4, "Apartamento", "Alto", "sim");
        ImovelDeVenda casaLucia = new ImovelDeVenda(5, "Rua E, 789", "150m²", 4, "Casa", "Luxo", 750000.0f, "não");
        ImovelDeAluguel apJulia = new ImovelDeAluguel(6, "Rua F, 101", "90m²", 2, "Apartamento", "Médio", 1200.0f, "não", "sim");

        imoveis.add(apLua);
        imoveis.add(casaTed);
        imoveis.add(casaMara);
        imoveis.add(apSamara);
        imoveis.add(casaLucia);
        imoveis.add(apJulia);

        // Iterar sobre a lista e realizar as operações relevantes
        for (Imovel imovel : imoveis) {
            System.out.println("***************************************");
            System.out.println("Imóvel ID: " + imovel.getId() + " | Endereço: " + imovel.getEndereco() + " | Área: " + imovel.getArea() + " | Quartos: " + imovel.getNumeroQuartos() + " | Tipo: " + imovel.getTipo() + " | Padrão: " + imovel.getPadrao());

            if (imovel instanceof ImovelDeAluguel) {
                ImovelDeAluguel imovelDeAluguel = (ImovelDeAluguel) imovel;
                System.out.println("Disponibilidade para aluguel: " + imovelDeAluguel.getDisponibilidade());
                imovelDeAluguel.alugarImovel();

            } else if (imovel instanceof ImovelDeVenda) {
                ImovelDeVenda imovelDeVenda = (ImovelDeVenda) imovel;
                System.out.println("Imóvel à venda com preço: R$" + imovelDeVenda.getPreco());

            } else {
                System.out.println("Este imóvel não está disponível para aluguel ou venda.");
            }

            // Verificar se precisa reformar
            imovel.reformar();
        }
    }
}