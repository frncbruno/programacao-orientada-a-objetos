# ⚠️ 04 - Exceções em Java

> Material de estudo para Programação Orientada a Objetos (Java)

---

# O que você vai aprender

Ao final deste capítulo você será capaz de:

* Entender o que é uma exceção.
* Criar exceções personalizadas.
* Utilizar `throw`.
* Utilizar `throws`.
* Utilizar `try` e `catch`.
* Saber quando usar cada um.
* Resolver exercícios de prova envolvendo exceções.

---

# O que é uma Exceção?

Uma exceção é um **erro que acontece durante a execução do programa**.

Ela serve para impedir que o programa continue executando de forma incorreta.

Exemplos:

* Divisão por zero.
* Abrir um arquivo que não existe.
* Sacar mais dinheiro do que existe na conta.
* Digitar um valor negativo.

---

# Exemplo

Imagine uma conta bancária.

Saldo:

```text
100
```

O usuário tenta sacar

```text
500
```

Sem exceções, o saldo ficaria negativo.

Utilizando exceções, o Java interrompe a operação e mostra uma mensagem de erro.

---

# Fluxo de uma Exceção

```text
Programa

↓

Executa método

↓

Verifica regra

↓

Erro?

↓

SIM

↓

throw

↓

try/catch

↓

Mensagem de erro
```

---

# try

O bloco `try` contém o código que pode gerar erro.

```java
try{

    // código

}
```

Exemplo

```java
try{

    conta.sacar(500);

}
```

---

# catch

O `catch` captura a exceção.

```java
catch(Exception e){

}
```

Exemplo

```java
try{

    conta.sacar(500);

}
catch(Exception e){

    System.out.println(e.getMessage());

}
```

---

# e.getMessage()

Mostra a mensagem enviada pela exceção.

Exemplo

```java
throw new Exception("Saldo insuficiente.");
```

No catch

```java
System.out.println(e.getMessage());
```

Saída

```text
Saldo insuficiente.
```

---

# throw

O `throw` serve para **lançar uma exceção**.

Sempre que uma regra for violada usamos:

```java
throw
```

Exemplo

```java
if(valor < 0){

    throw new Exception("Valor inválido.");

}
```

Tradução

> Pare a execução e informe um erro.

---

# throws

O `throws` informa que um método **pode lançar uma exceção**.

Exemplo

```java
public void sacar(double valor) throws Exception
```

Ele não lança a exceção.

Ele apenas avisa que isso pode acontecer.

---

# Diferença entre throw e throws

## throw

Lança a exceção.

```java
throw new Exception("Erro");
```

---

## throws

Avisa que o método pode lançar exceção.

```java
public void sacar() throws Exception
```

---

# Resumindo

```text
throws

↓

avisa

↓

throw

↓

lança

↓

catch

↓

trata
```

---

# Exceções Personalizadas

Também podemos criar nossas próprias exceções.

Isso deixa o código mais organizado.

---

## Exemplo

```java
public class ProdutoException extends Exception{

    public ProdutoException(String mensagem){

        super(mensagem);

    }

}
```

---

# O que significa extends Exception?

Significa que nossa classe agora é uma exceção.

```java
public class ProdutoException extends Exception
```

Agora podemos utilizá-la como qualquer exceção do Java.

---

# super()

Observe

```java
super(mensagem);
```

Ele envia a mensagem para a classe Exception.

Depois essa mensagem será recuperada por

```java
e.getMessage();
```

---

# Exemplo Completo

## ProdutoException.java

```java
public class ProdutoException extends Exception{

    public ProdutoException(String mensagem){

        super(mensagem);

    }

}
```

---

## Produto.java

```java
public class Produto{

    private String nome;

    private double preco;

    public Produto(String nome,double preco){

        this.nome = nome;

        this.preco = preco;

    }

    public void verificarPreco() throws ProdutoException{

        if(preco <= 0){

            throw new ProdutoException("Preço inválido.");

        }

    }

}
```

---

## Principal.java

```java
public class Principal{

    public static void main(String[] args){

        Produto produto =
        new Produto("Mouse",-50);

        try{

            produto.verificarPreco();

        }

        catch(ProdutoException e){

            System.out.println(e.getMessage());

        }

    }

}
```

---

# Saída

```text
Preço inválido.
```

---

# Outro Exemplo

Conta Bancária

```java
public void sacar(double valor) throws ContaException{

    if(valor > saldo){

        throw new ContaException("Saldo insuficiente.");

    }

    saldo -= valor;

}
```

---

# Fluxograma

```text
Principal

↓

Produto

↓

verificarPreco()

↓

preco <= 0 ?

↓

SIM

↓

throw ProdutoException

↓

catch

↓

Mensagem
```

---

# Exercício Resolvido

## Enunciado

Crie uma exceção chamada

```text
IdadeInvalidaException
```

Crie uma classe Pessoa.

Ela possui

* nome

* idade

Caso a idade seja menor que zero, lance a exceção.

---

## IdadeInvalidaException.java

```java
public class IdadeInvalidaException extends Exception{

    public IdadeInvalidaException(String mensagem){

        super(mensagem);

    }

}
```

---

## Pessoa.java

```java
public class Pessoa{

    private String nome;

    private int idade;

    public Pessoa(String nome,int idade){

        this.nome = nome;

        this.idade = idade;

    }

    public void verificarIdade() throws IdadeInvalidaException{

        if(idade < 0){

            throw new IdadeInvalidaException("Idade inválida.");

        }

    }

}
```

---

## Principal.java

```java
public class Principal{

    public static void main(String[] args){

        Pessoa pessoa =
        new Pessoa("Bruno",-10);

        try{

            pessoa.verificarIdade();

        }

        catch(IdadeInvalidaException e){

            System.out.println(e.getMessage());

        }

    }

}
```

---

# Erros Mais Comuns

## Esquecer o throws

Errado

```java
public void sacar(){

}
```

Correto

```java
public void sacar() throws ContaException{

}
```

---

## Esquecer o throw

Errado

```java
if(valor < 0){

}
```

Correto

```java
if(valor < 0){

    throw new ContaException("Valor inválido.");

}
```

---

## Esquecer o try/catch

Sempre que um método lança exceção, devemos tratá-la.

```java
try{

}
catch(Exception e){

}
```

---

## Esquecer extends Exception

Errado

```java
public class MinhaExcecao{

}
```

Correto

```java
public class MinhaExcecao extends Exception{

}
```

---

# O que normalmente cai na prova?

O professor pode pedir algo como:

> Crie uma classe abstrata Conta.

Depois crie:

* ContaPoupanca
* ContaInvestimento

Agora crie exceções para:

* saque negativo;
* saque maior que o saldo;
* depósito negativo.

Depois trate essas exceções utilizando `try/catch`.

Esse tipo de exercício é muito comum porque mistura:

* Classe abstrata
* Herança
* Exceções
* Override

---

# Resumo

| Palavra           | Função                                    |
| ----------------- | ----------------------------------------- |
| try               | Tenta executar um código                  |
| catch             | Captura a exceção                         |
| throw             | Lança uma exceção                         |
| throws            | Informa que um método pode lançar exceção |
| Exception         | Classe base das exceções                  |
| extends Exception | Cria uma exceção personalizada            |
| getMessage()      | Retorna a mensagem da exceção             |
| super()           | Envia a mensagem para a classe Exception  |

---

# Macete para lembrar

```text
throws

↓

O método AVISA

↓

throw

↓

O método LANÇA

↓

try

↓

TENTA executar

↓

catch

↓

CAPTURA o erro
```

---

# Checklist

Antes de entregar a prova confira:

* [ ] Criei a exceção personalizada?
* [ ] Usei `extends Exception`?
* [ ] Criei o construtor?
* [ ] Coloquei `super(mensagem)`?
* [ ] Coloquei `throws` no método?
* [ ] Usei `throw` para lançar a exceção?
* [ ] Usei `try/catch` na Principal?
* [ ] Mostrei a mensagem usando `e.getMessage()`?

---

# Dica de Prova ⭐

Uma boa forma de lembrar é pensar no fluxo:

```text
Verificar regra

↓

Se estiver errada

↓

throw

↓

O método possui throws

↓

Na Principal usamos try/catch

↓

Mostramos e.getMessage()
```

Se você seguir essa sequência, praticamente todos os exercícios de exceções terão a mesma estrutura. Basta trocar os nomes das classes e das validações.
