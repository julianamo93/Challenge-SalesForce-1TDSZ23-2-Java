import br.com.salesforce.www.classes.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ArrayList<Cadastro> cadastros = new ArrayList<>();
        Random rand = new Random();

        int opcao;

        do {
            System.out.println("==> Sistema de Cadastro de Clientes <==");
            System.out.println("Escolha uma opção:\n");
            System.out.println("""
                    [1] - Cadastro Usuário\s
                    [2] - Cadastro Empresa\s
                    [3] - Login\s
                    [4] - Atualizar Cadastro\s
                    [5] - Remover Cadastro\s
                    [6] - Listar Cadastros\s
                    [7] - Sair
                    """);

            System.out.print("Digite a opção desejada: ");
            opcao = read.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("=====> CADASTRO USUÁRIO <=====");
                    Usuario user = new Usuario();

                    System.out.print("Nome: ");
                    user.setNome(read.next());

                    System.out.print("Sobrenome: ");
                    user.setSobrenome(read.next());

                    System.out.print("Digite seu CPF (sem hífens ou pontos): ");
                    user.setCpf(read.next());

                    System.out.print("E-mail: ");
                    user.setEmail(read.next());

                    System.out.print("Empresa: ");
                    user.setEmpresa(read.next());

                    System.out.print("Cargo: ");
                    user.setFuncao(read.next());

                    System.out.print("Digite um telefone de contato: ");
                    user.setTelefoneContato(read.next());

                    System.out.print("Agora digite um nome de usuário: ");
                    user.setNomeUsuario(read.next());

                    System.out.print("Digite uma senha: ");
                    user.setSenha(read.next());

                    System.out.print("Você necessita de alguma ferramenta de acessibilidade? S/N: ");
                    String incluiAcessibilidade = read.next().toUpperCase();

                    if (incluiAcessibilidade.equals("S")) {
                        Acessibilidade acessibilidade = new Acessibilidade();

                        System.out.println("Digite a ferramenta que necessita: ");
                        acessibilidade.setMenuAcessibilidade(read.next());

                        acessibilidade.setNavegador();

                        user.setAcessibilidade(acessibilidade);
                    }

                    user.setId(gerarId(rand)); //Para definir um ID aleatório
                    cadastros.add(user);

                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                }
                case 2: {
                    System.out.println("=====> CADASTRO EMPRESA <=====");
                    ContaEmpresa empresa = new ContaEmpresa();

                    System.out.println("Digite o nome da Empresa: ");
                    empresa.setNomeFantasia(read.next());

                    System.out.println("Digite o CNPJ: ");
                    empresa.setCnpj(read.next());

                    System.out.println("Digite a razão social: ");
                    empresa.setRazaoSocial(read.next());

                    System.out.println("Digite um telefone para contato: ");
                    empresa.setTelefoneContato(read.next());

                    System.out.println("Digite um e-mail para contato: ");
                    empresa.setEmail(read.next());

                    System.out.println("Agora digite um nome de usuário: ");
                    empresa.setUserEmpresa(read.next());

                    System.out.println("Digite uma senha: ");
                    empresa.setSenha(read.next());

                    empresa.setId(gerarId(rand));
                    cadastros.add(empresa);

                    System.out.println("\nEmpresa cadastrada com sucesso!\n");
                    break;
                }
                case 3: {
                    read.nextLine(); //limpeza do buffer do scanner

                    System.out.println("=====> LOGIN <=====");

                    System.out.print("Digite seu usuário: ");
                    String nomeUsuarioInput = read.nextLine();

                    System.out.print("Digite sua senha: ");
                    String senhaInput = read.nextLine();

                    Autenticacao autenticador = new Autenticacao(cadastros);
                    boolean loginSucesso = autenticador.login(nomeUsuarioInput, senhaInput);

                    if (loginSucesso) {
                        Usuario usuarioLogado = autenticador.getUsuarioLogado();
                        System.out.println("Login feito com sucesso! \nBoas vindas, " + usuarioLogado.getNomeUsuario());
                    } else {
                        System.out.println("Login ou senha incorretos.");
                    }
                    break;
                }
                case 4: {
                       System.out.println("=====> ATUALIZAR CADASTRO <=====");

                        for (int i = 0; i < cadastros.size(); i++) {
                            Cadastro c = cadastros.get(i);
                            System.out.println("[" + i + "]" + c.getId());
                        }

                        System.out.print("Digite o número de referência: ");
                        int ref = read.nextInt();
                        read.nextLine();

                        if (cadastros.get(ref) instanceof Usuario user) {

                            System.out.print("Digite o novo e-mail: ");
                            String novoEmail = read.nextLine();

                            System.out.print("Digite o novo cargo: ");
                            String novoCargo = read.nextLine();

                            System.out.print("Digite o novo telefone de contato: ");
                            String novoTelefone = read.nextLine();

                            System.out.println("Digite a nova senha: ");
                            String novaSenha = read.nextLine();

                            user.setEmail(novoEmail);
                            user.setFuncao(novoCargo);
                            user.setTelefoneContato(novoTelefone);
                            user.setSenha(novaSenha);

                            cadastros.add(user);
                            System.out.println("\nUsuário atualizado com sucesso!\n");

                        } else if (cadastros.get(ref) instanceof ContaEmpresa empresa) {

                        System.out.print("Digite o novo e-mail: ");
                        String novoEmail = read.nextLine();

                        System.out.print("Digite o novo telefone de contato: ");
                        String novoTelefone = read.nextLine();

                        System.out.println("Digite a nova senha: ");
                        String novaSenha = read.nextLine();

                        empresa.setEmail(novoEmail);
                        empresa.setTelefoneContato(novoTelefone);
                        empresa.setSenha(novaSenha);

                        cadastros.add(empresa);
                        System.out.println("\nEmpresa atualizada com sucesso!\n");
                        } else {
                            System.out.println("Referência não é um usuário.");
                        }
                         break;
                }
                case 5: {
                        System.out.println("=====> REMOVER USUÁRIO <=====");
                        for (int i = 0; i < cadastros.size(); i++) {
                            Cadastro c = cadastros.get(i);
                            if (c instanceof Usuario user) {
                                System.out.println("[" + i + "] User: " + user.getNomeUsuario());
                            }
                            else if (c instanceof ContaEmpresa empresa) {
                                System.out.println("[" + i + "] Empresa: " + empresa.getNomeFantasia());
                            }
                        }
                        System.out.print("Digite o número de referência: ");
                        int ref = read.nextInt();
                        read.nextLine();

                        if (cadastros.get(ref) instanceof Usuario) {
                            Usuario user = (Usuario) cadastros.get(ref);
                            cadastros.remove(user); // Remover o usuário, não o índice
                        System.out.println("Usuário removido com sucesso.");

                        } else if (cadastros.get(ref) instanceof ContaEmpresa empresa) {
                            cadastros.remove(empresa);
                            System.out.println("Empresa removida com sucesso!");
                    }else {
                        System.out.println("Referência não é um usuário.");
                    }
                    break;
                }
                case 6: {
                    System.out.println("=====> LISTAR CADASTROS <=====");
                    for (Cadastro cadastro : cadastros) {
                        if (cadastro instanceof Usuario user) {
                            System.out.println("ID: " + user.getId());
                            System.out.println("Usuário: " + user.getNome() + " " + user.getSobrenome());
                            System.out.println("\tCPF: " + user.getCpf());
                            System.out.println("\tE-mail: " + user.getEmail());
                            System.out.println("\tEmpresa: " + user.getEmpresa());
                            System.out.println("\tCargo: " + user.getFuncao());
                            System.out.println("\tUser: " + user.getLogin());
                            System.out.println();

                        } else if (cadastro instanceof ContaEmpresa empresa) {
                            System.out.println("Empresa: " + empresa.getNomeFantasia());
                            System.out.println("\tCNPJ: " + empresa.getCnpj());
                            System.out.println("\tRazão Social: " + empresa.getRazaoSocial());
                            System.out.println("\tUsuário Empresa: " + empresa.getUserEmpresa());
                            System.out.println();
                        }
                        else {
                            System.out.println("Não há cadastros a serem listados.");
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Encerrando...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                }
            }
        }while (opcao != 7);
    }
    // Método para gerar um ID aleatório
    private static int gerarId(Random rand) {
        return rand.nextInt(9000) + 1000; //Gera um número aleatório entre 1000 e 9999
    }
}

