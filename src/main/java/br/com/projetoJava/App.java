package br.com.projetoJava;

import br.com.projetoJava.pacote1.Calculadora;
import br.com.projetoJava.pacote2.Multiplicador;
import br.com.projetoJava.pacote3.ExecutorOperacoes;

public class App 
{
    public static void main( String[] args )
    {
        Calculadora calculadora = new Calculadora();
        Multiplicador multiplicador = new Multiplicador();
        ExecutorOperacoes executor = new ExecutorOperacoes(calculadora, multiplicador);

        int resultado = executor.executarOperacoes(2, 3);

        System.out.println(resultado);
    }
}
