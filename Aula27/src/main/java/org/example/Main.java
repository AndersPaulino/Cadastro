package org.example;

import org.example.entity.Endereco;
import org.example.entity.Pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Pessoas> pessoas = new ArrayList<>();
        List<Endereco> enderecos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i =0; i<3; i++) {

            System.out.println("Digite nome e idade!");
            String nome = scanner.next();
            int idade = scanner.nextInt();
            // for (int j=0; j<2; j++){
            System.out.println("Digite nome da rua e numero");
            String rua = scanner.next();
            int numero = scanner.nextInt();
            enderecos.add(new Endereco(rua, numero));
            //}
            pessoas.add(new Pessoas(nome,idade,enderecos));
            //scanner.close();
        }
       for (int i = 0; i < pessoas.size(); i++){
           System.out.println("Nome: " + pessoas.get(i).getNome());
           System.out.println("Idade: " + pessoas.get(i).getIdade());
           System.out.println("Rua: " + enderecos.get(i).getRua());
           System.out.println("Numero: " + enderecos.get(i).getNumero());
       }
    }
}