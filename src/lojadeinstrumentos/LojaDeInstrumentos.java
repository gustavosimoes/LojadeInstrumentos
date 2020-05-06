package lojadeinstrumentos;

import java.util.Scanner;

public class LojaDeInstrumentos {

    public static void main(String[] args) {

        Loja loja = new Loja();
        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        while (flag) {

            

            System.out.println("::::: MENU :::::");
            System.out.println("1 - Adicionar Berimbau");
            System.out.println("2 - Adicionar Viola Caipira");
            System.out.println("3 - Adicionar Violao");
            System.out.println("4 - Adicionar Violino");
            System.out.println("5 - Mostrar Instrumentos");
            System.out.println("99 - Sair");
            
            int op;
            op = scan.nextInt();

            switch (op) {
                case 1:
                    Berimbau berimbau = new Berimbau();
                    scan.nextLine();
                    System.out.println("Modelo ");
                    berimbau.setModelo(scan.nextLine());
                    System.out.println("Tem Caxixi ");
                    berimbau.setTemCaxixi(scan.nextBoolean());
                    loja.berimbaus.add(berimbau);
                    break;
                case 2:
                    ViolaCaipira viola = new ViolaCaipira();
                    scan.nextLine();
                    System.out.println("Cor ");
                    viola.setCor(scan.nextLine());
                    System.out.println("Preço ");
                    viola.setPreco(scan.nextFloat());
                    loja.violas.add(viola);
                    break;
                case 3:
                    Violao violao = new Violao();
                    scan.nextLine();
                    System.out.println("Cor ");
                    violao.setCor(scan.nextLine());
                    System.out.println("Elétrico ");
                    violao.setEletrico(scan.nextBoolean());
                    loja.violoes.add(violao);
                    break;
              
                case 5:
                    loja.mostraInstrumentos();
                    break;
                case 99:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }
    }

}
