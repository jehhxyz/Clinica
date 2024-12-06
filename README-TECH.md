# Sistema de Gestão de Clínica Heal

## Visão Geral (Técnico):

Aplicação web desenvolvida utilizando:
Back-End: Java com Spring Boot para o back-end e MySQL para o banco de dados.
Front-End: HTML, CSS e JavaScript.
A aplicação foi projetada para otimizar e organizar o gerenciamento de médicos, pacientes e agendamentos de consultas, permitindo um fluxo eficiente e integrado dentro das clínicas.

## Tecnologias Utilizadas:

- **Linguagem de Programação**: Java 21
- **Framework Backend**: Spring Boot
- **Front-end**: HTML, CSS, JavaScript, Thymeleaf, Materialize CSS e JS
- **Ferramentas de Design**: Figma
- **Banco de Dados**: MySQL
- **IDE**: Visual Studio Code
- **Gerenciamento de Dependências**: Maven
- **Ferramentas**: PowerShell, MySQL CLI

## Estrutura do Projeto:

A arquitetura segue o modelo **MVC (Model-View-Controller)**, organizando os componentes da aplicação da seguinte forma:

### **Model**:
- **Paciente**: Identificado pelo RG, com atributos como nome, data de nascimento, local, telefone e sexo.
- **Médico**: Identificado por um ID, com informações como nome, sobrenome e especialidade.
- **Consulta**: Relaciona pacientes e médicos, com atributos como data, horário e médico responsável.

### **Repository**:
- **PacienteRepository**
- **MedicoRepository**
- **ConsultaRepository**

### **Controller**:
- **/pacientes**: Listagem, cadastro e edição de pacientes.
- **/medicos**: Listagem, cadastro e edição de médicos.
- **/consultas**: Agendamento e visualização das consultas.
- **/login**: Sistema de login para médicos.

### **View**:
- **Página Inicial**: Exibe os detalhes da clínica, permitindo navegação para agendamentos, cadastro de pacientes, cadastro de médicos, contatos, integrantes e sobre o software.
- **Formulários**: Cadastro de pacientes.
- **Dashboard**: Interface de administração para gerenciamento de médicos, pacientes e consultas.

### **Static Files**:
Arquivos CSS e JavaScript estão organizados em:
- **src/main/resources/static/css**
- **src/main/resources/static/js**

## Funcionalidades:

### **Gestão de Pacientes**:
- Cadastro de pacientes com informações pessoais.
- Edição e visualização de detalhes de pacientes cadastrados juntamente com informações médicas.

### **Gestão de Médicos**:
- Cadastro de médicos com especialidade, nome e informações de contato.
- Edição de médicos existentes e visualização de suas especialidades e pacientes.

### **Agendamento de Consultas**:
- Agendamento de consultas entre médicos e pacientes.

### **Sistema de Login**:
- Autenticação de médicos para acesso ao sistema.
- Visualização do dashboard após o login.

### **Validação e Feedback**:
- Validação de formulários com mensagens de erro.
- Feedback do sistema para ações realizadas (como cadastro de pacientes, agendamento de consultas, etc.).

## Configurações:

### Banco de Dados: Configure o MySQL no arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/heal
spring.datasource.username=root spring.datasource.password=***sua senha***
spring.jpa.hibernate.ddl-auto=update spring.jpa.show-sql=true

### Dependências Maven: 
org.springframework.boot spring-boot-starter-data-jpa org.springframework.boot spring-boot-starter-web org.springframework.boot spring-boot-starter-thymeleaf mysql mysql-connector-java

### Endpoints: 
Método 	Endpoint 			Descrição 
GET		/pacientes			Listar todos os pacientes
POST	/cadastrarPaciente	Criar um novo paciente
GET		/medicos			Listar todos os médicos
POST	/registro			Criar um novo médico
GET		/detalhesPaciente	Listar todas as consultas
POST	/detalhesPaciente			Agendar uma nova consulta
GET		/login				Exibir a tela de login
POST	/login				Realizar login do médico

# Executação:
1. Configurar o banco de dados:
Comece criando o banco de dados nomeado como "heal" no MySQL/powerShell utilizando o seguinte comando: “create database heal;”

2. Altere o login do seu banco de dados:
Localize o arquivo DataConfiguration (presente na pasta Model) e application.properties (em resources) e altere a senha para a respectiva de seu MySQL.

3. SpringBoot Dashboard:
Certifique-se de que a extensão “SpringBoot Dashboard” da Microsoft é VMware está instalada (caso esteja utilizando a IDE Vscode) e logo inicie o servidor.

4. Acessar a aplicação:
Abra o navegador e acesse: http://localhost:8080/.

# Melhorias Futuras: 
• Implementação de autenticação e autorização com diferentes níveis de acesso (médico, administrador, etc.)
• Validações avançadas para dados de pacientes e médicos.
• Integração com APIs externas para envio de notificações de agendamentos e atualizações de status de consultas.