
    public class Animal {

        protected String nome;
        protected int idade;
        protected String habitat;

        public Animal(String nome, int idade, String habitat) {
            this.nome = nome;
            this.idade = idade;
            this.habitat = habitat;
        }

        protected String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }



        public String getHabitat() {
            return habitat;
        }

        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }

        // Métodos que serão implementados nas subclasses
        public void comer() {
            System.out.println("Animal comendo");
        }

        public void dormir() {
            System.out.println("Animal dormindo");
        }

        public void emitirSom() {
            System.out.println("Animal emitindo som");
        }
    }
