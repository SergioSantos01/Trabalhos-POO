# Trabalhos-POO

# **Sistema de Locação de Equipamentos - ConstrutecManager**

## **Visão Geral**
O **ConstrutecManager** é um sistema para gerenciamento de locação de equipamentos da empresa **Construtec**. Ele permite cadastrar equipamentos, registrar locações e processar devoluções com cálculo automático de multas. Além disso, o sistema gera relatórios para análise dos equipamentos mais alugados e clientes com pendências.

### **Principais Funcionalidades:**
- **Cadastro e gerenciamento de equipamentos.**
- **Registro e controle de locações.**
- **Processamento de devoluções e cálculo de multas.**
- **Geração de relatórios gerenciais.**

---

## **Tecnologias Utilizadas**
- **Linguagem:** *Java*
- **Interface Gráfica:** *Swing*
- **Paradigma:** *Programação Orientada a Objetos (POO)*
- **IDE:** *NetBeans 12+*
- **Gerenciamento de Dependências:** *Apache Maven*
- **Testes:** *JUnit 5*

---

## **Requisitos para Execução**

### **Software Necessário:**
- **Java JDK** *11 ou superior*
- **NetBeans** *12+*
- **Apache Maven**

---

## **Estrutura do Projeto**
*/Source Packages*
    */Controler*
        *Controlador.java         # Controle geral*
        *Gestor.java              # Gerencia locações*
        *GestorTeste.java         # Testes do gestor*
    */model*
        *Cliente.java             # Modelo de clientes*
        *Equipamentos.java         # Modelo de equipamentos*
        *Locacao.java             # Modelo de locações*
        *LocacaoTeste.java       # Testes para locações*
    */service*
        *Relatorio.java    # Geração de relatórios*
        *RelatorioTeste.java  # Testes para relatórios*
    */gui*
        *Construtec.java           # Interface gráfica principal*

*README.md                        # Documentação do projeto*
*pom.xml*

---

## **Execução no NetBeans**

1. **Abra o NetBeans e importe o projeto.**
2. **Certifique-se de que as dependências foram baixadas corretamente pelo Maven.**
3. **No painel de projetos, localize `Construtec.java`.**
4. **Clique com o botão direito sobre o arquivo e selecione `Run File` para executar.**

---

## **Uso do Sistema**

### **Cadastro de Equipamentos**
1. **Acesse a aba `Cadastro de Equipamentos`.**
2. **Insira os detalhes do equipamento.**
3. **Clique em `Salvar`.**

### **Registro de Locações**
1. **Escolha um equipamento disponível.**
2. **Informe os dados do cliente.**
3. **Defina as datas de locação e clique em `Registrar Locação`.**

### **Devolução de Equipamentos**
1. **Informe o CPF do cliente ou código da locação.**
2. **O sistema calculará automaticamente possíveis multas.**
3. **Clique em `Confirmar Devolução`.**

### **Geração de Relatórios**
- **Equipamentos mais alugados.**
1. **Clique em `Gerar Relatório Ranking de Equipamentos` para visualizar os equipamentos mais alugados.**
- **Clientes com pendências.**
1. **Clique em `Gerar Relatório Ranking de Multas de Clientes` para visualizar os clientes com mais multas acumuladas.**

---

## **Testes Automatizados**
**Os testes cobrem:**
- **Cadastro e gerenciamento de equipamentos.**
- **Fluxo de locação e devolução.**
- **Cálculo de multas.**
- **Geração de relatórios.**

---

## **Contribuições e Suporte**
Este projeto foi desenvolvido por **Sergio Vinicius Santos**. Para qualquer dúvidas ou sugestões de melhorias, entre em contato via e-mail: sergio.santos1@estudante.ufla.br ou GitHub: SergioSantos01.


