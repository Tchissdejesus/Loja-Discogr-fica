/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lojadiscografica;

import entidades.Login;
import entidades.Tema;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jajeb
 */
public class LojaDiscografica {

    static ArrayList<Tema> listThemes = new ArrayList<>();

    public static void acessSistem() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("    Bem vindo a melhor  Loja  Discográfica                            ");
        System.out.println("                     1~~Login~~                                      ");
        System.out.println("                     0~~Logout~~                                      ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" DIGITE A OPÇÃO QUE DESEJA:");
    }

    public static void menuLogin() {
        System.out.println("~~~~~~~~~~~~~~Login Feito Com Sucesso~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println(" 1 - Inserir Novos Temas ");
        System.out.println(" 2 - Inserir,Alterar e Apagar Artigos ");
        System.out.println(" 3 - Inserir,Alterar e Apagar Intérpretes ");
        System.out.println(" 4 - Actualizar o Stock e as Vendas dos Artigos  ");
        System.out.println(" 5 - Actualizar o Preço dos Artigos ");
        System.out.println(" 6 - Efectuar vários tipos de consultas ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("DIGITE A OPÇÃO QUE DESEJA:");
    }
    static void InserirTemas(int id, String nameTheme, ArrayList<Tema> listauser) {
        // Intânciar a classe Serviços  
        Tema aux= new Tema();
         aux.id = id;
         aux.nome= nameTheme;
        listauser.add(aux);
        System.out.print("Inserido com Sucesso \n");

    }

    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner leitura = new Scanner(System.in);
        int op;
        int sop;
        do {
            acessSistem();
            op = leitura.nextInt();
            switch (op) {
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~Login~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("Digite o seu nome ");
                    String name = leitura.next();
                    System.out.print("Digite a sua senha ");
                    String key = leitura.next();
                    Login acess = new Login(name, key);
                    boolean loginVerific = acess.login(name, key);
                    if (loginVerific == true) {
                        do {
                            menuLogin();
                            sop = leitura.nextInt();
                            switch (sop) {
                                case 1:
                                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~Inserir Novos Temas~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
                                    int control = 1;
                                    String nameTheme;
                                    int id;
                                    Tema novotheme = new Tema();
                                    do {
                                        System.out.print("Digite o nome do Tema");
                                        leitura.nextLine();
                                        nameTheme = leitura.nextLine();
                                        id = gerador.nextInt(1000) + 1;
                                            InserirTemas(id,  nameTheme,listThemes);
                                            System.out.println("");
                                        System.out.print("Inserir mais ? sim(1)/não(0)");
                                        control = leitura.nextInt();
                                    } while (control != 0);
                                    break;
                                case 2:
                                    System.out.println(" Lista de Temas ");
                                    for (Tema aux : listThemes) {
                                        System.out.println("--------------------------------------------------");
                                        System.out.println(" Nome: " + aux.nome);
                                        System.out.println("id: " + aux.id);
                                        System.out.println("--------------------------------------------------");

                                    }
                                    break;
                                default:
                                    break;
                            }
                        } while (sop != 0);

                    } else {
                        System.out.println("Nome ou Senha Errada. Tente novamente");
                    }
                    break;
                case 0:
                    System.out.println("Terminando a Secção...");
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        } while (op != 0);
    }

}
