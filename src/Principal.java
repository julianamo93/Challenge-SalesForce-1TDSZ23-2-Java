import br.com.salesforce.www.classes.Acessibilidade;
import br.com.salesforce.www.classes.Cadastro;
import br.com.salesforce.www.classes.Usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        ArrayList<Cadastro> listaCadastro = new ArrayList<>();

        int opcao;
        int id;
        int id_usuario = 0;
        String usuario;
        String nome;
        String acessoSistema;
        String incluiAcessibilidade;


        do {
            System.out.println("==> Sistema de Cadastro de Clientes <==");
            System.out.println("Escolha uma opção:\n");
            System.out.println("1 - Cadastrar \n" +
                    "2 - Atualizar Cadastro \n" +
                    "3 - Remover Cadastro \n" +
                    "4 - Listar Cadastros \n" +
                    "5 - Sair\n\n");

            System.out.printf("Digite a opção desejada: ");
            opcao = read.nextInt();

            if (opcao == 1) {
                Cadastro cadastro = new Cadastro();

                id_usuario++;
                cadastro.setId(id_usuario);

                System.out.println("Digite seu nome: ");
                cadastro.setNome(read.next());

                System.out.println("Digite seu sobrenome: ");
                cadastro.setSobrenome(read.next());

                System.out.println("Digite seu email: ");
                cadastro.setEmail(read.next());

                System.out.println("Digite o nome da sua empresa: ");
                cadastro.setEmpresa(read.next());

                System.out.println("Digite sua função: ");
                cadastro.setFuncao(read.next());

                System.out.println("Digite seu telefone de contato: ");
                cadastro.setTelefoneContato(read.next());

                System.out.println("Agora digite um nome de usuário: ");
                cadastro.setNovoUsuario(read.next());

                System.out.println("Você necessita de alguma ferramenta de acessibilidade? S/N: ");
                incluiAcessibilidade = read.next().toUpperCase();

                if (incluiAcessibilidade.equals("S")) {
                    Acessibilidade acessibilidade = new Acessibilidade();

                    System.out.println("Digite a ferramenta que necessita: ");
                    acessibilidade.setFerramentaAcessibilidade(read.next());

                    acessibilidade.setNavegador();

                    cadastro.setAcessibilidade(acessibilidade);
                }

                listaCadastro.add(cadastro);

            } else if (opcao == 2) {
                for (Cadastro a : listaCadastro) {
                    System.out.printf("ID: %d - Nome: %s - Função: %s - Usuário: %s \n",
                            a.getId(), a.getNome(), a.getFuncao(), a.getUsuario());
                }

                System.out.println("Digite o ID do usuário que deseja atualizar: ");
                id = read.nextInt();

                System.out.println("Digite o novo nome: ");
                nome = read.next();

                System.out.println("Digite a nova função: ");
                String funcao = read.next();

                System.out.println("Digite o novo usuário: ");
                usuario = read.next();

                Cadastro cadastro = listaCadastro.get(id-1);

                cadastro.setNome(nome);
                cadastro.setUsuario(usuario);

                System.out.printf("Cadastro atualizado com sucesso!");
                System.in.read();
            }
            else if (opcao == 3) {
                for(Cadastro a: listaCadastro) {
                    System.out.printf("ID: %d - Nome: %s - Função: %s - Usuário: %s \n",
                            a.getId(), a.getNome(), a.getFuncao(), a.getUsuario());
                }

                System.out.printf("\nDigite o ID do usuário para exclusão: ");
                id = read.nextInt();

                listaCadastro.remove(id-1);

                System.out.printf("Usuário excluído com sucesso!");
                System.in.read();
            }
            else if (opcao == 4) {
                for(Cadastro a: listaCadastro) {
                    System.out.printf("ID: %d - Nome: %s - Função: %s - Usuário: %s \n",
                            a.getId(), a.getNome(), a.getFuncao(), a.getUsuario());
                }

                System.in.read();
            }
        }while (opcao != 5);
    }
}