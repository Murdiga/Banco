import java.util.Scanner;

public class BancoScreen {
    public static void main(String[] args) throws Exception {
        
        String nome = "Tessália Bonilha", tipoConta = "Corrente";
        
        double saldo = 2500, deposito = 0, transferencia = 0;

        int escolha = 0;

        System.out.println("""
                ************************************************
                                Dados do Cliente
                
                    Nome : %s
                    Tipo de Conta : %s
                    Saldo : R$ %.2f

                ************************************************
                """.formatted(nome, tipoConta, saldo));

        while (escolha != 4) {
        
            @SuppressWarnings("resource")

            Scanner scan = new Scanner(System.in);

        System.out.println("""
                *************************************************
                          Seleciona a operação desejada
                
                    1 - Visualizar valor da conta
                    2 - Depositar
                    3 - Sacar
                    4 - Sair

                *************************************************""");

            escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                
                System.out.println("""
                        \n****************************************************
                                   Visualização de valor da Conta
                    
                            Valor presente : R$ %.2f
                        
                        ****************************************************
                        """.formatted(saldo));

                break;

            case 2:

                System.out.println("\nInforme o valor que deseja depositar :");

                deposito = scan.nextDouble();

                    saldo += deposito;

                    System.out.println(""" 
                            \n******************************************************
                                    Visualização de valor depositado
                        
                                Valor depositado : R$ %.2f
                                Saldo atualizado : R$ %.2f
                            
                            ******************************************************
                            """.formatted(deposito, saldo));

                break;

            case 3:
                System.out.println("\nInforme o valor que será transferido :");

                transferencia = scan.nextDouble();

                    if (transferencia <= saldo) {
                        
                        saldo -= transferencia;

                        System.out.println("""
                                \n******************************************************
                                        Visualização de valor depositado
                            
                                    Valor Transferido : R$ %.2f
                                    Saldo atualizado : R$ %.2f
                                
                                ******************************************************
                                """.formatted(transferencia, saldo));
                        
                    }else{

                        System.out.println("""
                                \n*******************************************************
                                            ERRO AO TENTAR REALIZAR O SAQUE

                                    Valor informado : R$ %.2f
                                    Saldo disponivel : R$ %.2f
                                
                                *******************************************************
                                """.formatted(transferencia, saldo));
                                
                    }
                
                break;
            
            case 4:
            
                System.out.println("""
                        \n****************************************************

                                    SISTEMA ESTÁ SENDO ENCERRADO
                        
                        ****************************************************
                        """);
                
                break;

            default:

                System.out.println("""
                        \n*****************************************************

                           OPERAÇÃO INEXISTENTE, POR FAVOR TENTE NOVAMENTE
                        
                        *****************************************************
                        """);

                break;
        }
            
        }
        
    }
}
