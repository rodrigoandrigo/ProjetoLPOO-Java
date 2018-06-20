package imo;

import javax.swing.JOptionPane;

//Todas as classes sobre sorteio nao serao utilizadas nesse projeto
class Cadastro {  //Classe criada pelo rodrigo de souza

    private String Nome, Email, Senha, Endereco, Add;
    private int Idade, CPF, Telefone;
    Sorteio s = new Sorteio();
    private String[] Emaillist, CPFlist;

    public void setNome(String Nome) { //nesse metodo sao atribuidos os valores ao atributo
        this.Nome = Nome;
    }

    public String getNome() {  //retorna o atributo com valor
        return Nome;
    }

    public void setIdade(int Idade) { //nesse metodo sao atribuidos os valores ao atributo
        this.Idade = Idade;
    }

    public int getIdade() {  //retorna o atributo com valor
        return Idade;
    }

    public void setEmail(String Email) { //nesse metodo sao atribuidos os valores ao atributo
        this.Email = Email;
    }

    public String getEmail() {  //retorna o atributo com valor
        return Email;
    }

    public void setSenha(String Senha) { //nesse metodo sao atribuidos os valores ao atributo
        this.Senha = Senha;
    }

    public String getSenha() {  //retorna o atributo com valor
        return Senha;
    }

    public void setCPF(int CPF) { //nesse metodo sao atribuidos os valores ao atributo
        this.CPF = CPF;
    }

    public int getCPF() {  //retorna o atributo com valor
        return CPF;
    }

    public void setTelefone(int Telefone) { //nesse metodo sao atribuidos os valores ao atributo
        this.Telefone = Telefone;
    }

    public int getTelefone() {  //retorna o atributo com valor
        return Telefone;
    }

    public void setEndereco(String Endereco) { //nesse metodo sao atribuidos os valores ao atributo
        this.Endereco = Endereco;
    }

    public String getEndereco() {  //retorna o atributo com valor
        return Endereco;
    }

    public void add() {  //Adicione uma alteracao
        Add = JOptionPane.showInputDialog("Adicione uma alteracao");
    }

    public void Alterar_Dados() { //Altere alguns dados da sua conta
        Nome = JOptionPane.showInputDialog("Alterar o nome");
        Idade = Integer.parseInt(JOptionPane.showInputDialog("Alterara a idade"));
        Senha = JOptionPane.showInputDialog("Alterar a Senha");
        Telefone = Integer.parseInt(JOptionPane.showInputDialog("Alterara o telefone"));
        Endereco = JOptionPane.showInputDialog("Alterar o endereco");
    }

    public void Excluir_Cliente() { //Essa classe apaga os dados da sua conta se voce quiser
        this.Nome = "";
        this.Idade = 0;
        this.Email = "";
        this.Senha = "";
        this.CPF = 0;
        this.Telefone = 0;
        this.Endereco = "";
    }

    public void Consultar() { //Esse metodo retorna os dados do seu perfil
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Idade);
        System.out.println("Email: " + Email);
        System.out.println("CPF: " + CPF);
        System.out.println("Telefone:" + Telefone);
        System.out.println("Endereco: " + Endereco);

    }

    public void Historico_de_atividades() { //Essa classe mostra o historico de sorteios,tanto criados como participados
        s.getTipo_Produto();
        s.getDescricao_produto();
        s.getData_Vencimento();
        s.getData_Registro();
    }

}

class Registrar_Sorteio {    //Classe criada pelo rodrigo de souza

    Sorteio s = new Sorteio();
    private String Prorrogar_vencimento, Descricao_do_produto, Tipo_de_produto, Receber_os_tickets_do_Sorteio;
    private float Valor_do_produto;
    private int Data_do_Registro, Hora;
    private boolean Prorrogar;

    public void setData_do_Registro(int Data_do_Registro) {//nesse metodo sao atribuidos os valores ao atributo
        this.Data_do_Registro = Data_do_Registro;
    }

    public int getData_do_Registro() {//retorna o atributo com valor
        return Data_do_Registro;
    }

    public void setHora(int Hora) {//nesse metodo sao atribuidos os valores ao atributo
        this.Hora = Hora;
    }

    public int getHora() {//retorna o atributo com valor
        return Hora;
    }

    public void Registrar_sorteio() { //Aqui o sistema registra as informacoes do sorteio

        s.getNome();
        s.getTipo_Produto();
        s.getDescricao_produto();
        s.getData_Vencimento();
        s.getData_Registro();
        s.getValor_Produto();
        s.getValor_Ticket();
        s.getAvaliacao();
        Hora = this.Hora;

    }

    public void Prorrogar_vencimento() { //Aqui o apostador decide se prorroga ou nao o sorteio
        Prorrogar_vencimento = JOptionPane.showInputDialog("prorrogar vencimento?(sim ou nao)");
        if (Prorrogar_vencimento == "sim") {
            Prorrogar = true;
        }
        if (Prorrogar_vencimento == "nao") {
            Prorrogar = false;
        }
    }

    public void Cancelar() {//Aqui o apostador cancela o sorteio

    }

    public void Editar_Sorteio() { //Aqui o apostador edita alguns dados do sorteio
        Tipo_de_produto = JOptionPane.showInputDialog("reescreva o tipo de produto");
        s.setTipo_Produto(Tipo_de_produto);
        Descricao_do_produto = JOptionPane.showInputDialog("reescreva a descricao do produto");
        s.setDescricao_produto(Descricao_do_produto);
        Valor_do_produto = Float.parseFloat(JOptionPane.showInputDialog("reescreva o valor do produto"));
        s.setValor_Produto(Valor_do_produto);
    }

    public void Receber_os_tickets_do_Sorteio() { //Aqui sao recebidos os tickets do sorteio pelo ganhador
        Receber_os_tickets_do_Sorteio = JOptionPane.showInputDialog("Receber tickets");
    }

}

class Sorteio {  //Classe criada pelo rodrigo de souza

    private int Data_Vencimento, Data_Registro, Codigo_Sorteio, Avaliacao, Tickets, Apostas;
    private float Valor_Ticket, Valor_Produto;
    private String Descricao_produto, Tipo_Produto, Nome;
    private boolean estado;
    Cadastro c = new Cadastro();
    Registrar_Sorteio rs = new Registrar_Sorteio();

    public void setEstado(boolean estado) {//nesse metodo sao atribuidos os valores ao atributo
        this.estado = estado;
    }

    public boolean getEstado() {//retorna o atributo com valor
        return estado;
    }

    public void setData_Vencimento(int Data_Vencimento) {//nesse metodo sao atribuidos os valores ao atributo
        this.Data_Vencimento = Data_Vencimento;
    }

    public int getData_Vencimento() {//retorna o atributo com valor
        return Data_Vencimento;
    }

    public void setData_Registro(int Data_Registro) {//nesse metodo sao atribuidos os valores ao atributo
        this.Data_Registro = Data_Registro;
    }

    public int getData_Registro() {//retorna o atributo com valor
        return Data_Registro;
    }

    public void setCodigo_Sorteio(int Codigo_Sorteio) {//nesse metodo sao atribuidos os valores ao atributo
        this.Codigo_Sorteio = Codigo_Sorteio;
    }

    public int getCodigo_Sorteio() {//retorna o atributo com valor
        return Codigo_Sorteio;
    }

    public void setAvaliaçao(int Avaliacao) {//nesse metodo sao atribuidos os valores ao atributo
        this.Avaliacao = Avaliacao;
    }

    public int getAvaliacao() {//retorna o atributo com valor
        return Avaliacao;
    }

    public void setValor_Ticket(float Valor_Ticket) {//nesse metodo sao atribuidos os valores ao atributo
        this.Valor_Ticket = Valor_Ticket;
    }

    public float getValor_Ticket() {//retorna o atributo com valor
        return Valor_Ticket;
    }

    public void setValor_Produto(float Valor_Produto) {//nesse metodo sao atribuidos os valores ao atributo
        this.Valor_Produto = Valor_Produto;
    }

    public float getValor_Produto() {//retorna o atributo com valor
        return Valor_Produto;
    }

    public void setDescricao_produto(String Descricao_produto) {//nesse metodo sao atribuidos os valores ao atributo
        this.Descricao_produto = Descricao_produto;
    }

    public String getDescricao_produto() {//retorna o atributo com valor
        return Descricao_produto;
    }

    public void setTipo_Produto(String Tipo_Produto) {//nesse metodo sao atribuidos os valores ao atributo
        this.Tipo_Produto = Tipo_Produto;
    }

    public String getTipo_Produto() {//retorna o atributo com valor
        return Tipo_Produto;
    }

    public void setNome() {//nesse metodo sao atribuidos os valores ao atributo
        this.Nome = c.getNome();
    }

    public String getNome() {//retorna o atributo com valor
        return Nome;
    }

    public void Prorrogar_Vencimento() { //esse metodo se utiliza de outro metodo de outra classe
        rs.Prorrogar_vencimento();
    }

    public void Escolher_Ganhador() {
        //Nao achei uma forma boaa de fazer isso     
    }

    public void Registrar_Apostas() {
        Apostas += Tickets;  //soma todos os tickets já comprados
    }

    public void Avisar_Ganhador() {
        //Nao tenho ideia como fazer
    }

    public void Vencer_Sorteio() {
        //Nao tenho ideia como fazer
    }

}

class Apostador { //Classe criada pelo rodrigo de souza

    private int Ticket;
    Sorteio s = new Sorteio();

    public void setTicket(int Ticket) {//nesse metodo sao atribuidos os valores ao atributo
        this.Ticket = Ticket;
    }

    public int getTicket() {//retorna o atributo com valor
        return this.Ticket;
    }

    public void Registrar_Aposta() { //esse metodo se utiliza de outro metodo de outra classe
        s.Registrar_Apostas();
    }

    public void Resgatar_Premio() {
        // fiz tudo sozinho entao
    }

    public void Comprar_Ticket() {
        //nao vai ter nesse projeto
    }

    public void Vender_Quantia_de_Ticket() {
        //nao vai ter nesse projeto
    }

    public void Denunciar_Sorteio() {
        //nao vai ter nesse projeto
    }

    public void Avaliar_Soteio() {
        //nao vai ter nesse projeto
    }

}

class Login { // essa classe tambem foi criada por rodrigo
    //essa é uma ideia de como seria

    Cadastro c = new Cadastro();
    private String Insereir_Nome, Insereir_Senha, Entrar;
    boolean Verificar_Nome, Verificar_Senha;

    public void setInsereir_Nome(String Insereir_Nome) {//nesse metodo sao atribuidos os valores ao atributo
        this.Insereir_Nome = Insereir_Nome;
    }

    public String getInsereir_Nome() {//retorna o atributo com valor
        return Insereir_Nome;
    }

    public void setInsereir_Senha(String Insereir_Senha) {//nesse metodo sao atribuidos os valores ao atributo
        this.Insereir_Senha = Insereir_Senha;
    }

    public String getInsereir_Senha() {//retorna o atributo com valor
        return Insereir_Senha;
    }

    public void setVerificar_Nome(Boolean Verificar_Nome) {//nesse metodo sao atribuidos os valores ao atributo
        this.Verificar_Nome = Verificar_Nome;
    }

    public Boolean getVerificar_Nome() {//retorna o atributo com valor
        return Verificar_Nome;
    }

    public void setVerificar_Senha(Boolean Verificar_Senha) {//nesse metodo sao atribuidos os valores ao atributo
        this.Verificar_Senha = Verificar_Senha;
    }

    public Boolean getVerificar_Senha() {//retorna o atributo com valor
        return Verificar_Senha;
    }

    public void setEntrar(String Entrar) {//nesse metodo sao atribuidos os valores ao atributo
        this.Entrar = Entrar;
    }

    public String getEntrar() {//retorna o atributo com valor
        return Entrar;
    }

    public void verificarEmail() { //verifica se o nome escrito é o mesmo do cadastro
        if (Insereir_Nome == c.getEmail()) {
            Verificar_Nome = true;
        } else {
            Verificar_Nome = false;
        }
    }

    public void verificarSenha() { //verifica se a senha escrita é a mesmo do cadastro
        if (Insereir_Senha == c.getSenha()) {
            Verificar_Senha = true;
        } else {
            Verificar_Senha = false;
        }
    }

    public void Entrar() { //verifica se tudo esta verdadeiro

        if (Verificar_Nome == true && Verificar_Senha == true) {
            System.out.println("login realizado com sucesso");
        }
        System.out.println("Insira as informacoes novamente");
    }

    public void Mensagem1() {
        System.out.println("Login");
    }

    public void Mensagem2() {
        System.out.println("");
    }
}

public class IMO {

    public static void main(String[] args) { // Main cridada pelo rodrigo de souza
        Cadastro c = new Cadastro(); //obeto criado para puxaros metodos da classe cadastro e atribuir valores aos atributos de classe 
        Login l = new Login();
        String Nome, Email, Senha, Endereco, Nome_login, Senha_login;    //Variaveis String
        int Idade, CPF, Telefone, opcao;        //Variaveis Inteiras

        Nome = JOptionPane.showInputDialog("Escreva seu nome");
        c.setNome(Nome);                                      //Coloca o nome no atributo de classe
        Idade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a sua idade"));
        c.setIdade(Idade);                                    //Coloca a idade no atributo de classe
        Email = JOptionPane.showInputDialog("Escreva o Email");
        c.setEmail(Email);                                    //Coloca o email no atributo de classe
        Senha = JOptionPane.showInputDialog("Escreva uma senha");
        c.setSenha(Senha);                                    //Coloca o senha no atributo de classe
        CPF = Integer.parseInt(JOptionPane.showInputDialog("Escreva o CPF"));
        c.setCPF(CPF);                                        //Coloca o CPF no atributo de classe
        Telefone = Integer.parseInt(JOptionPane.showInputDialog("Escreva o Telefone"));
        c.setTelefone(Telefone);                              //Coloca o telefone no atributo de classe
        Endereco = JOptionPane.showInputDialog("Escreva o endereço");
        c.setEndereco(Endereco);                              //Coloca o endereco no atributo de classe
        l.Mensagem1();
        Nome_login = JOptionPane.showInputDialog("Escreva o nome");  //Escreva o nome
        Senha_login = JOptionPane.showInputDialog("Escreva a senha");//Escreva a senha
        l.setInsereir_Nome(Nome_login);
        l.setInsereir_Senha(Senha_login);
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para consultar perfil"
                + "Digite 2 para alterar dados do perfil"
                + "Digite 3 para excluir perfil"));
        if (opcao == 1) {
            c.Consultar();
        }
        if (opcao == 2) {
            c.Alterar_Dados();
        }
        if (opcao == 3) {
            c.Excluir_Cliente();
            c.Consultar();
        }
        System.out.println("Fim da execusao do projeto(estado inacabado)");
    }

}
