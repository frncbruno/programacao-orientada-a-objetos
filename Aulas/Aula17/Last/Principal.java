package pkg;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class Principal {

	public static void main(String[] args) {
		// Criando um objeto para serializar
		Pessoa p = new Pessoa("Ricardo", 30);
		
		// Convertendo o objeto em um JSON Object
		JSONObject json = new JSONObject();
		json.put("nome", p.getNome());
		json.put("idade", p.getIdade());
		String jsonString = json.toJSONString();
		
		gravaArquivo(jsonString);
		try { 
			lerArquivo();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void gravaArquivo(String jsonString) {
		try (FileWriter fileWriter = new FileWriter("pessoa.json")) {
			fileWriter.write(jsonString);
			System.out.println("Arquivo pessoa.json salvo com sucesso.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void lerArquivo() throws ParseException { 
		// Lendo o arquivo e desserializando o JSON para objeto
		try (FileReader fileReader = new FileReader("pessoa.json")) {
			JSONParser jsonParser = new JSONParser();
			
			// CORRIGIDO: de jsonOjbect para jsonObject
			JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
			
			// Criando um objeto Pessoa a partir do JSON
			String nome = (String) jsonObject.get("nome");
			long idade = (long) jsonObject.get("idade");
			Pessoa deserializedPerson = new Pessoa(nome, (int) idade);
			
			System.out.println("Objeto desserializado: " + deserializedPerson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
