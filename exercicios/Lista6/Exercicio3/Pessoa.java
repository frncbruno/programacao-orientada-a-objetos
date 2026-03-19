package pkg;

public class Pessoa {
	public String nome;
	public String email;
	public String dataNascimento;
	public String endereco; 
	public boolean admin;
	
	public boolean retornaAdmin() {
		return admin;
	}
	
	public void promoverAdmin() {
        admin = true;
    }
	
}
