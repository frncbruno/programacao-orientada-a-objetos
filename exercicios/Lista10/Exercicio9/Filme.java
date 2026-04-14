public class Filme {
        public String titulo;
        public String diretor;
        public int duracaoEmMinutos;
        public String genero;

        Filme () {}

        public Filme(String titulo, String diretor, int duracaoEmMinutos, String genero) {
            this.titulo = titulo;
            this.diretor = diretor;
            this.duracaoEmMinutos = duracaoEmMinutos;
            this.genero = genero;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDiretor() {
            return diretor;
        }

        public void setDiretor(String diretor) {
            this.diretor = diretor;
        }

        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        };

        public void exibirInformacoes(){
            System.out.println("Título: " + titulo);
            System.out.println("Diretor: " + diretor);
            System.out.println("Duração: " + duracaoEmMinutos + " minutos");
            System.out.println("Gênero: " + genero);
        }

        public boolean ehLongo(){
            if (duracaoEmMinutos > 120) {
                System.out.println("O filme é longo.");
                return true; 
            } else {
                System.out.println("O filme não é longo.");
                return false;
            }
        }
    
    }
