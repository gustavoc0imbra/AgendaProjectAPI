# Agenda project 📝
Projeto desenvolvido na disciplina de Desenvolvimento Web I, onde é uma aplicação de agendamentos de serviços.

## Arquitetura do projeto:
![image](https://github.com/user-attachments/assets/cb023c6f-f62e-4e95-b4be-0ff55b0cbd01)

## Stack utilizada neste repositório:
- Java ☕ (Springboot) no backend
- h2 como banco de dados

## Repositório do serviço de API da aplicação principal:
- Segue praticamente a mesma estrutura da do sistema principal
- Porém disponibilizando uma api para consultas e geração de relatórios
- Consome o mesmo banco de dados que a aplicação principal

### Links para respectivos repositórios:
### Agenda project: [Agenda Project Principal](https://github.com/gustavoc0imbra/AgendaProject) 📠</br>
### Frontend relatorios: [Agenda Project Frontend relatórios](https://github.com/gustavoc0imbra/AgendaProjectFront) 📝

## Como instalar:
### Requisitos para rodar aplicação:
- Java(JDK) versão 17 instalado

### Passo a passo:
1. Passo: Clonar este repositório no diretório de sua preferência:
   ```git clone https://github.com/gustavoc0imbra/AgendaProjectAPI.git```
2. Passo: Abrir em sua IDE preferida e rodar o projeto (Exemplo IntelliJ)

> [!WARNING]
> Após inicializar a API vai estar disponível no endereço ```locahost:8082```

> [!CAUTION]
> Para funcionar a api, por se tratar de um banco de dados em memória, **necessita da aplicação principal rodando** para fazer a busca de dados!
