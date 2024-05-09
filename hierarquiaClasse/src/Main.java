public class Main {
    public static void main(String[] args) {

     Elefante elefante = new Elefante ("Lara ", 10 , "Zoologico ", "Tromba ");
        System.out.println("\nElefante:");
        System.out.println("Nome: "+ elefante.getNome());
        System.out.println("Idade: "+ elefante.getIdade());
        System.out.println("Habitat: "+ elefante.getHabitat());
        System.out.println("Caracteristica: "+ elefante.getTromba());

        // Chamando métodos específicos de Elefante
        elefante.emitirSom();
        elefante.comer();
        elefante.dormir();


     Leao leao = new Leao ("Simba",5,"Safari","Juba");
        System.out.println("Leão:");
        System.out.println("Nome: "+ leao.getNome());
        System.out.println("Idade: "+ leao.getIdade());
        System.out.println("Habitat: "+ leao.getHabitat());
        System.out.println("Caracteristica: "+ leao.getJuba());

        // Chamando métodos específicos de Leao
        leao.emitirSom();
        leao.comer();
        leao.dormir();
    }

}