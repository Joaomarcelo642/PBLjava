# Sistema de Venda de Ingressos

Este projeto é um sistema de venda de ingressos, desenvolvido na linguagem Java 21.0.4. O sistema permite o gerenciamento de usuários, eventos e ingressos, com funcionalidades de cadastro, compra e cancelamento de ingressos. O sistema foi desenvolvido como parte do componente curricular EXA 863 - MI Programação.

## Sumário

- [Funcionalidades](#funcionalidades)
- [Estrutura de Projeto](estrutura-de-projeto)
    - [Classes Principais](classes-pricipais)
        - [Usuario](usuario)
        - [Ingresso](ingresso)
        - [Evento](evento)
        - [Controller](controller)
- [Requisitos](requisitos)
- [Como Executar](#como-executar)
- [Autor}(autor)

## Funcionalidades

- **Gerenciamento de Usuários:** Cadastro de usuários que podem ser clientes ou administradores.
- **Gerenciamento de Eventos:** Criar e gerenciar eventos, adicionar assentos disponíveis.
- **Venda de Ingressos:** Compra e cancelamento de ingressos vinculados a eventos.
  
## Estrutura do Projeto

### Classes Principais

#### `Usuario`
A classe `Usuario` representa os usuários do sistema. Um usuário pode ser um administrador ou cliente, e possui informações como login, senha, nome, CPF e email.

**Principais Métodos:**
- `login(String login, String senha)`: Realiza o login do usuário.
- `isAdmin()`: Verifica se o usuário é administrador.
- `getIngressos()`: Retorna a lista de ingressos comprados pelo usuário.

#### `Ingresso`
A classe `Ingresso` representa um ingresso comprado para um determinado evento. Contém informações sobre o evento, preço, assento e se o ingresso está ativo ou inativo.

**Principais Métodos:**
- `cancelar()`: Cancela o ingresso, desativando-o.
- `reativar()`: Reativa o ingresso, tornando-o válido novamente.
- `isAtivo()`: Verifica se o ingresso está ativo.

#### `Evento`
A classe `Evento` define os eventos disponíveis para compra de ingressos. Cada evento possui um nome, descrição, data e uma lista de assentos disponíveis.

**Principais Métodos:**
- `adicionarAssento(String assento)`: Adiciona um assento à lista de disponíveis.
- `removerAssento(String assento)`: Remove um assento da lista de disponíveis.
- `isAtivo()`: Verifica se o evento está ativo (não ocorreu ainda).

#### `Controller`
A classe `Controller` gerencia as operações do sistema. Permite o cadastro de usuários, eventos, e o controle sobre a compra e cancelamento de ingressos.

**Principais Métodos:**
- `cadastrarUsuario(String login, String senha, String nome, String cpf, String email, Boolean admin)`: Cadastra um novo usuário.
- `cadastrarEvento(Usuario usuario, String nome, String descricao, Date data)`: Permite que um administrador cadastre um novo evento.
- `comprarIngresso(Usuario usuario, String nomeEvento, String assento)`: Permite que um usuário compre um ingresso para um evento específico.
- `cancelarCompra(Usuario usuario, Ingresso ingresso)`: Cancela a compra de um ingresso e o torna disponível novamente.

## Requisitos

- **Sistema Operacional:** Windows 10 - 64 bits
- **Linguagem:** Java 21.0.4
- **Bibliotecas Externas:** Nenhuma

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-venda-ingressos.git

2. Compile o projeto:
  ```bash
  javac -d bin src/vendaingressos/*.java
```
3. Execute o sistema:
   ```bash
   java -cp bin vendaingressos.Main
   ```

## Autor
Desenvolvido por João Marcelo Nascimento Fernandes para o componente curricular **EXA 863 - MI Programação**.

