# 📂 05 - Manipulação de Arquivos em Java

> Material de estudo para Programação Orientada a Objetos (Java)

---

# O que você vai aprender

Ao final deste capítulo você será capaz de:

* Criar arquivos em Java.
* Escrever informações em arquivos.
* Ler informações de arquivos.
* Entender a função de cada classe do pacote `java.io`.
* Resolver exercícios de prova envolvendo manipulação de arquivos.

---

# O que é Manipulação de Arquivos?

Manipular arquivos significa permitir que o programa consiga:

* criar arquivos;
* escrever informações;
* ler informações;
* salvar dados para utilizar depois.

Exemplo:

Imagine um cadastro de alunos.

Quando o programa fecha, todos os dados seriam perdidos.

Para evitar isso, podemos gravar essas informações em um arquivo.

---

# Pacote java.io

As principais classes utilizadas são:

| Classe         | Função                          |
| -------------- | ------------------------------- |
| FileWriter     | Escreve em um arquivo           |
| BufferedWriter | Escreve de forma mais eficiente |
| FileReader     | Lê um arquivo                   |
| BufferedReader | Lê um arquivo linha por linha   |

---

# Escrevendo Arquivos

## FileWriter

É responsável por criar ou abrir um arquivo.

```java
FileWriter arquivo = new FileWriter("alunos.txt");
```

Se o arquivo não existir, ele será criado.

Se existir, seu conteúdo será substituído.

---

## BufferedWriter

Serve para escrever no arquivo.

```java
BufferedWriter escritor = new BufferedWriter(arquivo);
```

Depois utilizamos:

```java
escritor.write("Bruno");
```

Resultado:

```text
Bruno
```

---

# newLine()

Para pular uma linha utilizamos

```java
escritor.newLine();
```

Exemplo

```java
escritor.write("Bruno");
escritor.newLine();
escritor.write("Carlos");
```

Arquivo

```text
Bruno
Carlos
```

---

# close()

Sempre devemos fechar o arquivo.

```java
escritor.close();
arquivo.close();
```

Se não fechar, podem ocorrer problemas na gravação.

---

# Exemplo Completo

```java
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Principal{

    public static void main(String[] args){

        try{

            FileWriter arquivo = new FileWriter("nomes.txt");

            BufferedWriter escritor = new BufferedWriter(arquivo);

            escritor.write("Bruno");

            escritor.newLine();

            escritor.write("Carlos");

            escritor.close();

            arquivo.close();

            System.out.println("Arquivo criado com sucesso.");

        }

        catch(Exception e){

            System.out.println(e.getMessage());

        }

    }

}
```

---

# Lendo Arquivos

Agora vamos ler o arquivo criado.

---

## FileReader

Abre um arquivo para leitura.

```java
FileReader arquivo = new FileReader("nomes.txt");
```

---

## BufferedReader

Permite ler linha por linha.

```java
BufferedReader leitor = new BufferedReader(arquivo);
```

---

## readLine()

Lê apenas uma linha.

```java
String linha = leitor.readLine();
```

---

# while

Como normalmente não sabemos quantas linhas existem, utilizamos:

```java
while((linha = leitor.readLine()) != null){

    System.out.println(linha);

}
```

Enquanto existir uma linha, ela será exibida.

---

# Exemplo Completo

```java
import java.io.FileReader;
import java.io.BufferedReader;

public class Principal{

    public static void main(String[] args){

        try{

            FileReader arquivo = new FileReader("nomes.txt");

            BufferedReader leitor = new BufferedReader(arquivo);

            String linha;

            while((linha = leitor.readLine()) != null){

                System.out.println(linha);

            }

            leitor.close();

            arquivo.close();

        }

        catch(Exception e){

            System.out.println(e.getMessage());

        }

    }

}
```

---

# Criando uma Classe para Manipular Arquivos

É uma boa prática criar uma classe responsável apenas pelos arquivos.

Exemplo:

```text
Principal

↓

ManipulaArquivo

↓

Arquivo Texto
```

---

## ManipulaArquivo.java

```java
import java.io.*;

public class ManipulaArquivo{

    public void gravar(String texto){

        try{

            FileWriter arquivo = new FileWriter("dados.txt");

            BufferedWriter escritor = new BufferedWriter(arquivo);

            escritor.write(texto);

            escritor.close();

            arquivo.close();

        }

        catch(Exception e){

            System.out.println(e.getMessage());

        }

    }

    public void ler(){

        try{

            FileReader arquivo = new FileReader("dados.txt");

            BufferedReader leitor = new BufferedReader(arquivo);

            String linha;

            while((linha = leitor.readLine()) != null){

                System.out.println(linha);

            }

            leitor.close();

            arquivo.close();

        }

        catch(Exception e){

            System.out.println(e.getMessage());

        }

    }

}
```

---

## Principal.java

```java
public class Principal{

    public static void main(String[] args){

        ManipulaArquivo arquivo = new ManipulaArquivo();

        arquivo.gravar("Programação Orientada a Objetos");

        arquivo.ler();

    }

}
```

---

# Fluxo de Funcionamento

```text
Principal

↓

ManipulaArquivo

↓

FileWriter

↓

BufferedWriter

↓

Arquivo (.txt)
```

Leitura

```text
Arquivo (.txt)

↓

FileReader

↓

BufferedReader

↓

Principal
```

---

# Erros Mais Comuns

## Esquecer o try/catch

Todas essas classes podem gerar exceções.

Sempre utilize:

```java
try{

}
catch(Exception e){

}
```

---

## Esquecer de fechar o arquivo

Sempre faça

```java
leitor.close();

arquivo.close();
```

ou

```java
escritor.close();

arquivo.close();
```

---

## Esquecer o while

Muitos alunos fazem

```java
System.out.println(leitor.readLine());
```

Isso lê apenas a primeira linha.

O correto é utilizar:

```java
while((linha = leitor.readLine()) != null){

}
```

---

# Exercício Resolvido

## Enunciado

Crie uma classe chamada ManipulaArquivo.

Ela deve possuir:

* gravar(String texto)
* ler()

Na classe Principal:

Grave seu nome.

Depois leia o arquivo.

---

## Saída

```text
Bruno Tubino
```

---

# O que normalmente cai na prova?

O professor pode pedir algo como:

> Crie uma classe responsável por manipular arquivos.

Ela deve possuir:

* um método para gravar informações;
* um método para ler informações.

Depois utilize essa classe na Principal.

---

# Resumo

| Classe         | Função                               |
| -------------- | ------------------------------------ |
| FileWriter     | Cria ou abre um arquivo para escrita |
| BufferedWriter | Escreve no arquivo                   |
| write()        | Escreve um texto                     |
| newLine()      | Pula uma linha                       |
| close()        | Fecha o arquivo                      |
| FileReader     | Abre um arquivo para leitura         |
| BufferedReader | Lê o arquivo                         |
| readLine()     | Lê uma linha                         |
| while          | Lê todas as linhas                   |

---

# Checklist

Antes de entregar a prova confira:

* [ ] Importei `java.io.*`?
* [ ] Usei `try/catch`?
* [ ] Criei o `FileWriter`?
* [ ] Criei o `BufferedWriter`?
* [ ] Usei `write()`?
* [ ] Usei `newLine()` quando necessário?
* [ ] Fechei o arquivo?
* [ ] Para leitura usei `FileReader`?
* [ ] Usei `BufferedReader`?
* [ ] Usei `while(readLine() != null)`?

---

# Próximo capítulo

➡️ **06 - Serialização.md**

Nele veremos:

* `Serializable`
* `ObjectOutputStream`
* `ObjectInputStream`
* `writeObject()`
* `readObject()`
* Como salvar objetos completos em arquivos.
