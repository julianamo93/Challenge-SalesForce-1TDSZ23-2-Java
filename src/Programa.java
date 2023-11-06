import br.com.salesforce.www.classes.*;

public class Programa {
    public static void main(String[] args) {

        System.out.println("\nSistema de Cadastro SalesForce\n");

        Cadastro cadastro = new Cadastro();
        cadastro.setNome("Maria");
        cadastro.setSobrenome("Buarque");
        cadastro.setEmail("mariabuarque@gmail.com");
        cadastro.setEmpresa("STPX");
        cadastro.setTelefoneContato("(11) " + 998227301);
        cadastro.setNovoUsuario("mariabuarque\n");

        cadastro.printCadastro();

        Usuario usuario = new Usuario();
        usuario.setId(12);
        usuario.setSenha("123456");
        usuario.setFuncao("Estagiária\n");

        usuario.printInfoUsuario();

        ContaCliente conta = new ContaCliente();
        conta.setIdUsuario(12);
        conta.setUser("mariabuarque\n");

        conta.printConta();

        Atividade atividade = new Atividade();
        atividade.setTipoAtividade("Customer 360");
        atividade.setDescricao("Acesso ao Slack, Einstein AI e Sucesso");
        atividade.setData("20-09-23");
        atividade.setHora("14h54");
        atividade.setIdUsuarioResponsavel(12);
        atividade.setIdUser(51);

        atividade.printAtividade();

        Acessibilidade acessibilidade = new Acessibilidade();
        acessibilidade.setFerramentaAcessibilidade("Áudio descrição");
        acessibilidade.setTipoDeDispositivo("Android");
        acessibilidade.setNavegador("Google Chrome");
        acessibilidade.setLocalizacaoGeografica("São Paulo, SP\n");

        acessibilidade.printAcessibilidade();

        AcessoSistema acesso = new AcessoSistema();
        acesso.setDataHora("23h56");

        acesso.printAcessoSistema();


    }
}
