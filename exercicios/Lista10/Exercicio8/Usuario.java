public class Usuario {
        public String nomeUsuario;
        public String senha;
        public boolean logado; 

        Usuario () {}

        public Usuario(String nomeUsuario, String senha, boolean logado) {
            this.nomeUsuario = nomeUsuario;
            this.senha = senha;
            this.logado = logado;
        }

        public String getNomeUsuario() {
            return nomeUsuario;
        }

        public void setNomeUsuario(String nomeUsuario) {
            this.nomeUsuario = nomeUsuario;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public boolean isLogado() {
            return logado;
        }

        public void setLogado(boolean logado) {
            this.logado = logado;
        };

        public void login(String usuario, String senha){
            if(this.nomeUsuario.equals(usuario) && this.senha.equals(senha)){
                this.logado = true;
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Nome de usuário ou senha incorretos.");
            }
        }

        public void logout(){
            this.logado = false;
            System.out.println("Logout realizado com sucesso!");
        }

        public void exibirStatus(){
            if(this.logado){
                System.out.println("Usuário " + this.nomeUsuario + " está logado.");
            } else {
                System.out.println("Usuário " + this.nomeUsuario + " não está logado.");
            }
        }
    }
