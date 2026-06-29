# 📚 01 - Classes Abstratas

> Material de estudo para Programação Orientada a Objetos (Java)

---

# O que você vai aprender

Ao terminar este capítulo você será capaz de:

* Entender o que é uma classe abstrata.
* Saber quando utilizá-la.
* Criar métodos abstratos.
* Utilizar herança (`extends`).
* Utilizar `@Override`.
* Entender o funcionamento do `super()`.
* Resolver exercícios de prova envolvendo classes abstratas.

---

# O que é uma Classe Abstrata?

Uma **classe abstrata** é uma classe criada para servir como modelo para outras classes.

Ela normalmente possui:

* atributos;
* construtores;
* métodos comuns;
* métodos abstratos.

Ela **não pode ser instanciada**.

Por exemplo:

```java
Animal animal = new Animal();
```

Isso gera erro.

O correto é criar um objeto de uma classe filha.

Exemplo:

```java
Cachorro cachorro = new Cachorro();
```

---

# Quando usar?

Sempre que várias classes possuem características em comum.

Exemplo:

```
Animal

↓

Cachorro

↓

Gato

↓

Passaro
```

Todos possuem:

* nome
* idade

Todos fazem:

* emitirSom()

Mas cada um implementa esse método de uma maneira diferente.

---

# Sintaxe

Uma classe abstrata é criada utilizando a palavra

```java
abstract
```

Exemplo

```java
public abstract class Animal {

}
```

---

# Exemplo Completo

```java
public abstract class Animal {

    protected String nome;
    protected int idade;

}
```

Nesse exemplo estamos dizendo que todo animal possui:

* nome
* idade

---

# protected

Você verá muito essa palavra.

```java
protected
```

Ela significa que as classes filhas podem acessar esse atributo.

Exemplo

```java
protected String nome;
```

Então o Cachorro poderá utilizar a variável nome.

---

# Métodos Abstratos

Uma classe abstrata também pode possuir métodos abstratos.

Exemplo

```java
public abstract void emitirSom();
```

Observe que ele:

* não possui chaves;
* não possui código;
* termina com ";"

Isso acontece porque quem fará a implementação será a classe filha.

---

# Exemplo

Classe pai

```java
public abstract class Animal {

    protected String nome;

    public abstract void emitirSom();

}
```

Classe filha

```java
public class Cachorro extends Animal {

    @Override
    public void emitirSom(){

        System.out.println("Au Au");

    }

}
```

Agora quem define o som é o Cachorro.

---

# extends

A palavra

```java
extends
```

significa

> Herdar uma classe.

Exemplo

```java
public class Cachorro extends Animal
```

Traduzindo:

"Cachorro é um Animal."

Então Cachorro herda tudo que existe em Animal.

---

# O que a classe filha herda?

Exemplo

```java
public abstract class Animal{

    protected String nome;
    protected int idade;

}
```

Agora:

```java
public class Cachorro extends Animal{

}
```

Automaticamente Cachorro possui

```
nome

idade
```

Mesmo sem escrever novamente.

Isso evita repetição de código.

---

# @Override

Sempre que implementamos um método da classe pai usamos

```java
@Override
```

Exemplo

```java
@Override
public void emitirSom(){

    System.out.println("Miau");

}
```

Ele informa ao Java:

"Estou sobrescrevendo um método da classe pai."

---

# super()

Outra palavra muito utilizada.

Imagine

```java
Animal
```

possui construtor

```java
public Animal(String nome,int idade){

    this.nome = nome;
    this.idade = idade;

}
```

Agora criamos

```java
public class Cachorro extends Animal{
```

O construtor fica

```java
public Cachorro(String nome,int idade){

    super(nome,idade);

}
```

O

```java
super()
```

serve para chamar o construtor da classe pai.

---

# Fluxo de Funcionamento

```
Classe Abstrata

↓

Classe Filha

↓

Objeto

↓

Métodos
```

Exemplo

```
Animal

↓

Cachorro

↓

cachorro1

↓

emitirSom()
```

---

# Exemplo Completo

## Animal.java

```java
public abstract class Animal {

    protected String nome;

    protected int idade;

    public Animal(String nome,int idade){

        this.nome = nome;

        this.idade = idade;

    }

    public abstract void emitirSom();

}
```

---

## Cachorro.java

```java
public class Cachorro extends Animal{

    public Cachorro(String nome,int idade){

        super(nome,idade);

    }

    @Override
    public void emitirSom(){

        System.out.println("Au Au");

    }

}
```

---

## Gato.java

```java
public class Gato extends Animal{

    public Gato(String nome,int idade){

        super(nome,idade);

    }

    @Override
    public void emitirSom(){

        System.out.println("Miau");

    }

}
```

---

## Principal.java

```java
public class Principal {

    public static void main(String[] args){

        Cachorro cachorro = new Cachorro("Rex",5);

        cachorro.emitirSom();

        Gato gato = new Gato("Mingau",2);

        gato.emitirSom();

    }

}
```

---

# Saída

```
Au Au

Miau
```

---

# Exercício Resolvido

## Enunciado

Crie uma classe abstrata chamada Veiculo.

Ela possui

* marca
* modelo

Crie um método abstrato chamado acelerar().

Depois crie

* Carro
* Moto

Cada um implementa acelerar().

---

## Veiculo.java

```java
public abstract class Veiculo{

    protected String marca;

    protected String modelo;

    public Veiculo(String marca,String modelo){

        this.marca = marca;

        this.modelo = modelo;

    }

    public abstract void acelerar();

}
```

---

## Carro.java

```java
public class Carro extends Veiculo{

    public Carro(String marca,String modelo){

        super(marca,modelo);

    }

    @Override
    public void acelerar(){

        System.out.println("Carro acelerando.");

    }

}
```

---

## Moto.java

```java
public class Moto extends Veiculo{

    public Moto(String marca,String modelo){

        super(marca,modelo);

    }

    @Override
    public void acelerar(){

        System.out.println("Moto acelerando.");

    }

}
```

---

# Erros mais comuns

❌ Instanciar uma classe abstrata

```java
Animal a = new Animal();
```

Errado.

---

❌ Esquecer o Override

```java
public void emitirSom(){

}
```

O código pode funcionar, mas o recomendado é sempre utilizar

```java
@Override
```

---

❌ Esquecer de implementar um método abstrato.

Toda classe filha deve implementar todos os métodos abstratos da classe pai.

---

❌ Esquecer o extends.

Sem

```java
extends
```

não existe herança.

---

# O que normalmente cai na prova?

Normalmente o professor pede algo como:

> Crie uma classe abstrata chamada Pessoa.

Ela possui:

* nome

* cidade

Crie um método abstrato

```java
comprar();
```

Depois crie

* PessoaFisica

* PessoaJuridica

Implemente comprar().

---

Outro exemplo

```
Conta

↓

ContaPoupanca

↓

ContaInvestimento
```

A Conta é abstrata.

As outras implementam os métodos.

---

# Resumo

| Palavra   | Significado                      |
| --------- | -------------------------------- |
| abstract  | Cria uma classe abstrata         |
| extends   | Herda outra classe               |
| @Override | Sobrescreve um método            |
| super()   | Chama o construtor da classe pai |
| protected | Permite acesso às classes filhas |

---

# Checklist

Antes de entregar uma prova veja se você fez:

* [ ] Coloquei `abstract` na classe?
* [ ] Criei os atributos?
* [ ] Fiz o construtor?
* [ ] Criei os métodos abstratos?
* [ ] Usei `extends`?
* [ ] Usei `@Override`?
* [ ] Usei `super()` no construtor?
* [ ] Instanciei apenas as classes filhas?

---

# Próximo capítulo

➡️ **02 - Herança.md**

Nele veremos:

* Herança detalhada
* Encapsulamento
* Getters e Setters
* Construtores
* `this`
* `super`
* Exercícios completos
* Questões de prova
