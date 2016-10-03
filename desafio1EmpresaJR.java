package fumec.br;

import java.util.*;

public class desafio1EmpresaJR {

	public static void main(String[] args) {

		// Dados fixos para fins de relatório
		String nomeEmpresa = "MC Soluções LTDA";
		String tipoAtividade = "Serviços de TI em geral";
		int cnpjEmpresa = 123456789;
		String enderecoEmpresa = "Rua coisa e tal, 123, Savassi, Belo Horizonte / MG";
		String nomeSocio1 = "Cristiano Soares da Costa";
		String nomeSocio2 = "Marcelo Assis Woitowicz";

		// inicio do Scanner
		Scanner leia = new Scanner(System.in);

		// Variáveis do Sistema
		// int usuariosCadastrados = 0;
		// int produtosCadastrados = 0;
		String[][] usuario = new String[3][2];
		String[][] produto = new String[3][2];
		String[][] venda = new String[300][4];
		int contadorVenda = 0;

		int opcao = 0;



		do {
			
			do {
				System.out.println("Escolha uma opção a seguir:");
				System.out.println("1 - Cadastros");
				System.out.println("2 - Listagem");
				System.out.println("3 - Vendas");
				System.out.println("4 - Relatórios");
				System.out.println("Ou digite '0' para encerrar o programa");
				System.out.print("Opção: ");
				
				try {
					String opcaoStr = leia.nextLine();
					opcao = Integer.parseInt(opcaoStr);

					if (opcao < 0) {
						System.out.println("O número deve ser positivo!");
						continue;
					}
		
					break;
					
				} catch (NumberFormatException E) {
					System.out.println("ERRO: Esse campo aceita apenas números!");
					continue;
				}
			} while (true);

			switch (opcao) {

			case 1:

				do {
					
					do {
						System.out.println("Menu [CADASTRO]:");
						System.out.println("Escolha uma das opções a seguir:");
						System.out.println("5 - Cadastro de Usuários");
						System.out.println("6 - Cadastro de Produtos");
						System.out.println("Ou digite '99' para retornar ao menu anterior");
						System.out.print("Opção: ");
						
						String opcaoStr = leia.nextLine();
						try {
							opcao = Integer.parseInt(opcaoStr);

							if (opcao < 0) {
								System.out.println("O número deve ser positivo!");
								continue;
							}
							
							break;
						} catch (NumberFormatException E) {
							System.out.println("ERRO: Esse campo aceita apenas números!");
							continue;
						}
					} while (true);


					switch (opcao) {

					case 5:

						for (int i = 0; i < usuario.length; i++) {
							do {
								System.out.println("Menu [CADASTRO > Usuários]:");
								System.out.print("Digite o Código do Usuário:");
								
								String opcaoStr = leia.nextLine();
								usuario[i][0] = opcaoStr;
								try {
									opcao = Integer.parseInt(opcaoStr);
									
									if (opcao < 0) {
										System.out.println("O código deve ser positivo!");
										continue;
									}
									
									if (opcao == 0 || opcao == 99 || opcao == 999 || opcao == 9999){
										System.out.println("------------------------------------------");
										System.out.println("              A T E N Ç Ã O              ");
										System.out.println("\nCódigos Proibidos '0', '99', '999', '9999'.");
										System.out.println("------------------------------------------");
										continue;
									}


									break;
								} catch (NumberFormatException E) {
									System.out.println("ERRO: Esse campo aceita apenas números!");
									continue;
								}
								
							} while (true);
							
			
								System.out.print("Digite o Nome do Usuário:");
								usuario[i][1] = leia.nextLine();

							
						}

						break;

					case 6:

						for (int i = 0; i < produto.length; i++) {
							do {
								System.out.println("Menu [CADASTRO > Produtos]:");
								System.out.print("Digite o Código do Produto:");
								
								String opcaoStr = leia.nextLine();
								produto[i][0] = opcaoStr;
								try {
									opcao = Integer.parseInt(opcaoStr);
									
									if (opcao < 0) {
										System.out.println("O código deve ser positivo!");
										continue;
									}
									
									if (opcao == 0 || opcao == 99 || opcao == 999 || opcao == 9999){
										System.out.println("------------------------------------------");
										System.out.println("              A T E N Ç Ã O              ");
										System.out.println("\nCódigos Proibidos '0', '99', '999', '9999'.");
										System.out.println("------------------------------------------");
										continue;
									}


									break;
								} catch (NumberFormatException E) {
									System.out.println("ERRO: Esse campo aceita apenas números!");
									continue;
								}
								
							} while (true);
							
			
								System.out.print("Digite a descrição do Produto:");
								produto[i][1] = leia.nextLine();

							
						}

						break;

					case 99:
						break;
						
					default:
						System.out.println("Opção Inválida.");
						break;

					}
					
				} while (opcao != 99);
			continue;					
			
			case 2:
			
				do {
					
					do {
						System.out.println("Menu [LISTAGENS]:");
						System.out.println("Escolha uma das opções a seguir:");
						System.out.println("7 - Listagem de Usuários Cadastrados");
						System.out.println("8 - Listagem de Produtos Cadastrados");
						System.out.println("Ou digite '99' para retornar ao menu anterior");
						System.out.print("Opção: ");
						
						String opcaoStr = leia.nextLine();
						try {
							opcao = Integer.parseInt(opcaoStr);

							if (opcao < 0) {
								System.out.println("O número deve ser positivo!");
								continue;
							}

							break;
						} catch (NumberFormatException E) {
							System.out.println("ERRO: Esse campo aceita apenas números!");
							continue;
						}
					} while (true);


					switch (opcao) {

					case 7:
						System.out.println("------------------------------------");
						System.out.println("Usuários Cadastrados:");
						for (int i = 0; i < usuario.length; i++)
							System.out.println("Código do Usuário: " + usuario[i][0] + " - Nome do Usuário: " + usuario[i][1]);
							System.out.println("------------------------------------");
						break;

					case 8:
						System.out.println("------------------------------------");
						System.out.println("Produtos Cadastrados:");
						for (int i = 0; i < produto.length; i++)
							System.out.println("Código do Produto: " + produto[i][0] + " - Descrição do Produto: " + produto[i][1]);
							System.out.println("------------------------------------");
						break;

					case 99:
						break;
						
						
					default:
						System.out.println("Opção Inválida.");
						break;

					}

				} while (opcao != 99);
				
			case 3:
				
				int opcaoCodigo;
				do {
					do {
							System.out.println("Menu [VENDAS]:");
							System.out.println("Digite abaixo os dados para efetivara venda:");
							System.out.println("Para sair digite '999'.");
							System.out.println("Qual o código do Produto? (Digite 555 para listar os produtos)");
							System.out.print("Opção: ");
							
							
								try {
									String opcaoStr = leia.nextLine();
									opcaoCodigo = Integer.parseInt(opcaoStr);
									
									
									if (opcaoCodigo < 0) {
										System.out.println("O número deve ser positivo!");
										continue;
									} 
									break;
									
								} catch (NumberFormatException E) {
									System.out.println("ERRO: Esse campo aceita apenas números!");
									continue;
								}
							} while (true);
					   
						if (opcaoCodigo == 555){
							System.out.println("------------------------------------");
							System.out.println("Produtos Cadastrados:");
							for (int i = 0; i < produto.length; i++)
								System.out.println("Código do Produto: " + produto[i][0] + " - Descrição do Produto: " + produto[i][1]);
								System.out.println("------------------------------------");
							continue;
						}
						


					} while (opcaoCodigo != 999);
				
				break;
			}


		} while (opcao != 0);

		System.out.println("Programa Finalizado!");

		leia.close();

	}
	
}
