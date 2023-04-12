package edu.eduschi.exercicios;



public class TiposVariaveis {
    public static void main(String[] args) {


        /* exemplo de casting
         * O java possui alta Tipagem, não é coerente fazer com frequência,
         * porém se necessário pode se usar através do casting */
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        /* constante: valores que não podem ser modificados
         * devem ser escritos todos em caixa alta*/
        final double VALOR_DE_PI = 3.14;

        int numero = 5;
        System.out.println(--numero);

        System.out.println(++numero);
        // x negação

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        //operadores ternarios
        int a,b;
        a=5;
        b=6;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        String nomeUm = "Edu";
        String nomeDois = new String("Edu");

        System.out.println("nomeUm  == nomeDois ? " );
        System.out.println(nomeUm == nomeDois);
        System.out.println("resultado da função equals nomeUm e nomeDois ");
        System.out.println(nomeUm.equals(nomeDois));

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){

            System.out.println("as duas condições são verdadeiras");
        }
        if (condicao1 || condicao2){

            System.out.println("uma das condições é verdadeira");
        }





    }
}