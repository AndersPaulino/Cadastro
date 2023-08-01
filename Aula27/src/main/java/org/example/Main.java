package org.example;

import org.example.entity.Endereco;
import org.example.entity.Pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Pessoas> pessoas = new ArrayList<>();
    static List<Endereco> enderecos = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int opcao = 1;

        while (opcao != 0) {
            menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastro();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    listarTodos();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
       scanner.close();
    }

    public static void menu() {
        System.out.println("*---------------Menu----------------*");
        System.out.println("|-----------------------------------|");
        System.out.println("| 1 -         Cadastrar             |");
        System.out.println("| 2 -      Buscar por Nome!         |");
        System.out.println("| 3 -       Listar Todos!           |");
        System.out.println("| 0 -           Sair                |");
        System.out.println("*-----------------------------------*");
        System.out.println("Digite o número da opção desejada: ");
    }
    public static void cadastro() {
        scanner.nextLine();

        System.out.println("Cadastrar");
        System.out.println("Digite o Nome!");
        String nome = scanner.nextLine();
        System.out.println("Digite a Idade!");
        int idade = scanner.nextInt();
        System.out.println("Digite o numero de endereços!");
        int scn = scanner.nextInt();
        for (int j=0; j<scn; j++){
            scanner.nextLine();
            System.out.println("Digite nome da rua!");
            String rua = scanner.nextLine();
            System.out.println("Digite o Numero!");
            int numero = scanner.nextInt();
            enderecos.add(new Endereco(rua, numero));
        }
        pessoas.add(new Pessoas(nome,idade,enderecos));
    }
    public static void buscar() {
        scanner.nextLine();

        int i=0;

        System.out.println("Digite o nome da pessoa para buscar:");
        String nomeBusca = scanner.nextLine();
        boolean pessoaEncontrada = false;
        for (Pessoas pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Pessoa encontrada:");
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());
                List<Endereco> enderecosPessoa = pessoa.getEndereco();
                for (Endereco endereco : enderecosPessoa) {
                    System.out.println(" Endereço " + (i+1));
                    System.out.println("  Rua: " + endereco.getRua());
                    System.out.println("  Numero: " + endereco.getNumero());
                    System.out.println("---------------------------------");
                    i++;
                }
                pessoaEncontrada = true;
                break;
            }
        }
        if (!pessoaEncontrada) {
            System.out.println("Pessoa não encontrada.");
        }
    }
    public static void listarTodos(){

    }
}