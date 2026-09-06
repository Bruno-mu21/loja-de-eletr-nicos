# 🛍️ Sistema de Loja (Java 17 & Maven)

> Aplicação em **Java 17** gerenciada com **Apache Maven** para controle, vendas e gestão comercial de loja.

---

## 📌 Visão Geral

Este projeto consiste em uma aplicação Java voltada para a gestão e operações de uma **Loja**, estruturada e padronizada utilizando o ciclo de vida do **Apache Maven**. O projeto está configurado para utilizar as novidades e recursos do **Java 17 (LTS)**.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** [Java 17 (LTS)](https://www.oracle.com/java/)
- **Gerenciador de Dependências e Build:** [Apache Maven](https://maven.apache.org/)
- **Classe Principal (Main Class):** `com.mycompany.loja.Loja`
- **Empacotamento:** JAR (`Loja-1.0-SNAPSHOT.jar`)

---

## 📁 Estrutura Padrão do Projeto

Seguindo as convenções do Maven:

```text
Loja/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/mycompany/loja/
│   │   │       └── Loja.java            # Ponto de entrada da aplicação
│   │   └── resources/                   # Recursos e arquivos de configuração
│   └── test/
│       └── java/                        # Testes unitários
├── target/                              # Artefatos gerados pelo build (.jar e .class)
├── pom.xml                              # Descritor do projeto e diretivas de compilação
└── README.md                            # Documentação do repositório
