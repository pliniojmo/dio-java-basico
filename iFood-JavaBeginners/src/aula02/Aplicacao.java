package aula02;

public class Aplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        //Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast não é uma boa prática.
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
