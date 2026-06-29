# 📦 06 - Serialização em Java

> Material de estudo para Programação Orientada a Objetos (Java)

---

# O que você vai aprender

Ao final deste capítulo você será capaz de:

* Entender o que é serialização.
* Saber para que ela serve.
* Utilizar `Serializable`.
* Salvar objetos em arquivos.
* Recuperar objetos salvos.
* Resolver exercícios de prova envolvendo serialização.

---

# O que é Serialização?

Serialização é o processo de **salvar um objeto inteiro em um arquivo**.

Imagine o seguinte objeto:

```text
Produto

Código: 1

Nome: Mouse

Preço: 120

Estoque: 10
```

Se o programa fechar, todas essas informações serão perdidas.

Com a serialização podemos salvar esse objeto em um arquivo.

Depois podemos recuperá-lo exatamente como estava.

---

# Como funciona?

Fluxo da serialização

```text
Objeto

↓

Serializable

↓

ObjectOutputStream

↓

Arquivo (.ser)
```

Fluxo da desserialização

```text
Arquivo (.ser)

↓

ObjectInputStream

↓

Objeto
```

---

# O que é Serializable?

É uma interface do Java.

Ela informa que aquela classe pode ser salva em um arquivo.

Exemplo

```java
implements Serializable
```

---

# Exemplo

```java
import java.io.Serializable;

public class Produto implements Serializable{

}
```

Sem isso o Java gera erro.

---

# Arquivo .ser

Quando serializamos um objeto normalmente criamos um arquivo

```text
produto.ser
```

O ".ser" significa

```text
Serializado
```

Não é obrigatório.

Mas é o padrão utilizado.

---

# Salvando um Objeto

Primeiro criamos um objeto.

```java
Produto produto = new Produto();
```

Depois criamos o arquivo.

```java
FileOutputStream arquivo =
new FileOutputStream("produto.ser");
```

Agora criamos o ObjectOutputStream.

```java
ObjectOutputStream objeto =
new ObjectOutputStream(arquivo);
```

Por último salvamos.

```java
objeto.writeObject(produto);
```

---

# Exemplo Completo

## Produto.java

```java
import java.io.Serializable;

public class Produto implements Serializable{

    private int codigo;

    private String nome;

    private double preco;

    public Produto(int codigo,String nome,double preco){

        this.codigo = codigo;

        this.nome = nome;

        this.preco = preco;

    }

    @Override
    public String toString(){

        return "Codigo: " + codigo +
               "\nNome: " + nome +
               "\nPreco: " + preco;

    }

}
```

---

## Principal.java

```java
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Principal{

    public static void main(String[] args){

        Produto produto =
        new Produto(1,"Mouse",120);

        try{

            FileOutputStream arquivo =
            new FileOutputStream("produto.ser");

            ObjectOutputStream objeto =
            new ObjectOutputStream(arquivo);

            objeto.writeObject(produto);

            objeto.close();

            arquivo.close();

            System.out.println("Objeto salvo.");

        }

        catch(Exception e){

            System.out.println(e.getMessage());

        }

    }

}
```

---

# Desserialização

Desserializar significa recuperar o objeto salvo.

Fluxo

```text
Arquivo

↓

ObjectInputStream

↓

Objeto
```

---

# Lendo o Objeto

Primeiro abrimos o arquivo.

```java
FileInputStream arquivo =
new FileInputStream("produto.ser");
```

Depois

```java
ObjectInputStream objeto =
new ObjectInputStream(arquivo);
```

Agora recuperamos.

```java
Produto produto =
(Produto)objeto.readObject();
```

Observe o cast.

```java
(Produto)
```

Ele é obrigatório.

---

# Exemplo Completo

```java
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Principal{

    public static void main(String[] args){

        try{

            FileInputStream arquivo =
            new FileInputStream("produto.ser");

            ObjectInputStream objeto =
            new ObjectInputStream(arquivo);

            Produto produto =
            (Produto)objeto.readObject();

            System.out.println(produto);

            objeto.close();

            arquivo.close();

        }

        catch(Exception e){

            System.out.println(e.getMessage());

        }

    }

}
```

---

# Classe ManipulaArquivo

Uma boa prática é criar uma classe responsável pela serialização.

## ManipulaArquivo.java

```java
import java.io.*;

public class ManipulaArquivo{

    public void salvar(Produto produto){

        try{

            FileOutputStream arquivo =
            new FileOutputStream("produto.ser");

            ObjectOutputStream objeto =
            new ObjectOutputStream(arquivo);

            objeto.writeObject(produto);

            objeto.close();

            arquivo.close();

        }

        catch(Exception e){

            System.out.println(e.getMessage());

        }

    }

    public Produto carregar(){

        Produto produto = null;

        try{

            FileInputStream arquivo =
            new FileInputStream("produto.ser");

            ObjectInputStream objeto =
            new ObjectInputStream(arquivo);

            produto =
            (Produto)objeto.readObject();

            objeto.close();

            arquivo.close();

        }

        catch(Exception e){

            System.out.println(e.getMessage());

        }

        return produto;

    }

}
```

---

# Utilizando a Classe

```java
public class Principal{

    public static void main(String[] args){

        Produto produto =
        new Produto(1,"Mouse",120);

        ManipulaArquivo arquivo =
        new ManipulaArquivo();

        arquivo.salvar(produto);

        Produto p =
        arquivo.carregar();

        System.out.println(p);

    }

}
```

---

# Fluxograma Completo

```text
Principal

↓

Produto

↓

ManipulaArquivo

↓

FileOutputStream

↓

ObjectOutputStream

↓

produto.ser

↓

ObjectInputStream

↓

Produto

↓

System.out.println()
```

---

# Erros Mais Comuns

## Esquecer Serializable

Errado

```java
public class Produto{

}
```

Correto

```java
public class Produto implements Serializable{

}
```

---

## Esquecer o cast

Errado

```java
Produto p =
objeto.readObject();
```

Correto

```java
Produto p =
(Produto)objeto.readObject();
```

---

## Esquecer de fechar os arquivos

Sempre faça

```java
objeto.close();

arquivo.close();
```

---

## Esquecer o try/catch

Todos esses métodos podem gerar exceções.

Sempre utilize

```java
try{

}
catch(Exception e){

}
```

---

# Exercício Resolvido

## Enunciado

Crie uma classe chamada Aluno.

Ela possui

* nome

* idade

Depois:

* serialize o objeto;

* leia novamente;

* mostre na tela.

---

## Saída

```text
Nome: Bruno

Idade: 21
```

---

# Diferença entre Arquivos e Serialização

| Arquivos (.txt)  | Serialização (.ser)              |
| ---------------- | -------------------------------- |
| Salva textos     | Salva objetos                    |
| Usa write()      | Usa writeObject()                |
| Usa readLine()   | Usa readObject()                 |
| Fácil de abrir   | Arquivo binário                  |
| Pode ser editado | Não deve ser editado manualmente |

---

# O que normalmente cai na prova?

O professor pode pedir algo como:

> Crie uma classe Aluno.

Depois:

* implemente Serializable;

* salve o objeto;

* leia novamente;

* mostre as informações.

Ou então:

> Crie uma classe ManipulaArquivo.

Ela deve possuir

* salvar()

* carregar()

---

# Resumo

| Classe             | Função                      |
| ------------------ | --------------------------- |
| Serializable       | Permite serializar a classe |
| FileOutputStream   | Cria o arquivo              |
| ObjectOutputStream | Salva o objeto              |
| writeObject()      | Escreve o objeto            |
| FileInputStream    | Abre o arquivo              |
| ObjectInputStream  | Lê o objeto                 |
| readObject()       | Recupera o objeto           |

---

# Checklist

Antes de entregar a prova confira:

* [ ] Coloquei `implements Serializable`?
* [ ] Criei o `FileOutputStream`?
* [ ] Criei o `ObjectOutputStream`?
* [ ] Usei `writeObject()`?
* [ ] Fechei os arquivos?
* [ ] Para ler, usei `FileInputStream`?
* [ ] Criei o `ObjectInputStream`?
* [ ] Usei `(Classe) readObject()`?
* [ ] Fechei os arquivos novamente?

---

# Macete para lembrar

## Salvar

```text
Objeto

↓

Serializable

↓

FileOutputStream

↓

ObjectOutputStream

↓

writeObject()
```

## Ler

```text
Arquivo

↓

FileInputStream

↓

ObjectInputStream

↓

readObject()

↓

Objeto
```

---

# Dica de Prova ⭐

Uma questão completa normalmente mistura vários conteúdos.

Exemplo:

1. Criar uma classe abstrata `Produto`.
2. Criar uma classe `ProdutoLoja` que herda de `Produto`.
3. Validar regras utilizando uma exceção personalizada.
4. Salvar o objeto utilizando serialização.
5. Criar uma classe `ManipulaArquivo` para salvar e carregar os objetos.

Esse tipo de exercício reúne praticamente toda a matéria e costuma aparecer em provas de Programação Orientada a Objetos.
