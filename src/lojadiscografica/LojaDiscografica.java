/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lojadiscografica;

import entidades.Login;
import java.util.Scanner;

/**
 *
 * @author jajeb
 */
public class LojaDiscografica {

    public static void acessSistem() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("    Bem vindo a melhor  Loja  Discográfica                            ");
        System.out.println("                     1~~Login~~                                      ");
        System.out.println("                     0~~Logout~~                                      ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" DIGITE A OPÇÃO QUE DESEJA:");
    }

    public static void login() {
        System.out.println("~~~~~~~~~~~~~~Login Feito Com Sucesso~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println(" 1 - Inserir Novos Temas ");
        System.out.println(" 2 - Inserir,Alterar e Apagar Artigos ");
        System.out.println(" 3 - Inserir,Alterar e Apagar Intérpretes ");
        System.out.println(" 4 - Actualizar o Stock e as Vendas dos Artigos  ");
        System.out.println(" 5 - Actualizar o Preço dos Artigos ");
        System.out.println(" 6 - Efectuar vários tipos de consultas ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("DIGITE A OPÇÃO QUE DESEJA:");
    }

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int op;
        int sop;
        do {
            acessSistem();
            op = leitura.nextInt();

            switch (op) {
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~Login~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Digite o seu nome ");
                    String name = leitura.next();
                    System.out.println("Digite a sua senha ");
                    String key = leitura.next();
                    Login acess = new Login(name, key);
                    boolean login = acess.login(name, key);
                    if (login == true) {
                        do {
                            login();
                            sop = leitura.nextInt();
                            switch (sop) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                default:
                                    break;
                            }
                        } while (sop != 3);

                    } else {
                        System.out.println("Nome ou Senha Errada. Tente novamente");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }

}
