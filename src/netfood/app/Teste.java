/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package netfood.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import netfood.model.*;

/**
 *
 * @author Elisiandro
 */
public class Teste {

    public static void main(String[] args) {

        List<Garcon> listGarcon = new ArrayList<>();
        List<Mesa> listMesas = new ArrayList<>();
        List<Produto> listProdutos= new ArrayList<>();
        Scanner valor = new Scanner(System.in);

        boolean continuar = true;
        int opcao;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\t\tMenu de opções do NetFood:");
            System.out.println("\t1. Cadastrar Garçon");
            System.out.println("\t2. Cadastrar Mesas");
            System.out.println("\t3. Cadastrar Produtos");
            System.out.println("\t4. Realizar Pedido");
            System.out.println("\t5. Finalizar Pedido");
            System.out.println("\t6. Relatorio -> Mesas mais utilizadas");
            System.out.println("\t0. Sair");

            System.out.print("\nInsira sua opção: ");
            opcao = entrada.nextInt();

            if (opcao == 0) {
                continuar = false;
                System.out.println("Programa finalizado.");
            } else {
                switch (opcao) {
                    case 1:

                        System.out.print("\nNome: ");
                        String nome = valor.next();
                        System.out.print("\nSalario: ");
                        double salario = valor.nextDouble();
                        System.out.print("\nCPF: ");
                        String cpf = valor.next();

                        listGarcon.add(new Garcon(nome, salario, cpf));

                        break;
                    case 2:

                        System.out.print("\nCapacidade: ");
                        int quantidade = valor.nextInt();

                        
                        listMesas.add(new Mesa(quantidade));

                        break;
                    case 3:
                        System.out.print("\nNome: ");
                        nome = valor.next();
                        System.out.print("\nSalario: ");
                        double preco = valor.nextDouble();
                        System.out.print("\nTipo: (1-Comida, 2-Bebida, 3-Sobremesa, 4-Outros)");
                        int tipo = valor.nextInt();
                        TipoProduto _tipo;

                        if (tipo == 1) {
                            _tipo = TipoProduto.COMIDA;
                        } else if (tipo == 2) {
                            _tipo = TipoProduto.BEBIDA;
                        } else if (tipo == 3) {
                            _tipo = TipoProduto.SOBREMESA;
                        } else {
                            _tipo = TipoProduto.OUTRO;
                        }

                        
                        listProdutos.add(new Produto(nome, preco, _tipo));

                        break;
                    case 4:
                        System.out.println("Realizar Pedido");
                        break;
                    case 5:
                        System.out.println("Finalizar Pedido");
                        break;
                    case 6:
                        System.out.println("Sexta-feira");
                        break;
                    case 7:
                        System.out.println("Relatorio -> Mesas mais utilizadas");
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                }
            }

        } while (continuar);

    }
}
