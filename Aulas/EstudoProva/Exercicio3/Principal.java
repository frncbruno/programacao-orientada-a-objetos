import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Principal {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Bruno", 21);

        // SERIALIZANDO
        try {

            FileOutputStream arquivo = new FileOutputStream("aluno.ser");

            ObjectOutputStream objeto = new ObjectOutputStream(arquivo);

            objeto.writeObject(aluno);

            objeto.close();
            arquivo.close();

            System.out.println("Objeto salvo.");

        } catch (Exception e) {

            e.printStackTrace();

        }

        // DESSERIALIZANDO
        try {

            FileInputStream arquivo = new FileInputStream("aluno.ser");

            ObjectInputStream objeto = new ObjectInputStream(arquivo);

            Aluno a = (Aluno) objeto.readObject();

            System.out.println(a);

            objeto.close();
            arquivo.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
