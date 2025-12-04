# Projeto A3 – Programação de Soluções Computacionais

Este repositório contém o projeto acadêmico “A3” desenvolvido em Java para a disciplina de Programação de Soluções Computacionais. O objetivo é criar uma aplicação completa que manipule uma entidade escolhida pelo grupo (Aluno, Produto, Pedido etc.), incluindo lógica de cadastro, atualização, remoção e visualização via interface gráfica.

## 📋 Requisitos Funcionais

- Representar uma entidade com **mínimo de 6 atributos**, sendo um deles `id` inteiro gerado sequencialmente.
- Implementar **getters/setters**, dois construtores (padrão e completo sem `id`) e lógica de persistência em **array nativo** (sem usar `ArrayList`, `LinkedList`, etc.).
- Incluir métodos para:
  - Inserção com redimensionamento do array quando necessário;
  - Remoção por `id`;
  - Atualização de atributos por `id`;
  - Busca por `id` (retornando o objeto completo e, em método privado, apenas o índice).
- Prover **interface gráfica** que exponha todas as operações ao usuário.

## 🧱 Estrutura Esperada


> Observação: o projeto deve ser entregue com a estrutura completa de pacotes e arquivos, preferencialmente desenvolvida no NetBeans, seguindo a nomenclatura solicitada (pasta com os primeiros nomes dos integrantes).

## 🚀 Como Executar

1. **Clonar o repositório**
  
   git clone https://github.com/DAVIISILVAA/Projeto_A3-ProgramacaoDeSolucoesComputacionais.git
   2. **Abrir no NetBeans ou IDE equivalente**
   - Importar como projeto Maven/Java padrão.
   - Garantir que o JDK configurado atende aos requisitos do curso.

3. **Executar a classe principal**
   - Localize a classe responsável pela interface gráfica (por exemplo, `Main`).
   - Rode a aplicação para acessar o menu de operações sobre o array.

## 🧪 Sugestões de Teste

- Testar inserções até o array inicial encher para validar o redimensionamento.
- Repetir operações de exclusão e atualização para verificar a busca por índice.
- Garantir que a interface gráfica reflete todas as ações (confirmações, mensagens de erro, etc.).

## 👥 Sobre o Grupo

Gabriel - https://github.com/GabrielRomao-git
Davi - https://github.com/DAVIISILVAA
Mauricio - https://github.com/Antiael
Matheus - https://github.com/MathAssis31

## 📄 Licença

Repositório acadêmico sem licença explícita. Utilize somente para fins educacionais seguindo as diretrizes da instituição.
