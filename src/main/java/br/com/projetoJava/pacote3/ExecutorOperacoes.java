package br.com.projetoJava.pacote3;

import br.com.projetoJava.pacote1.Calculadora;
import br.com.projetoJava.pacote2.Multiplicador;
import lombok.Data;

@Data
public class ExecutorOperacoes {

    private Calculadora calculadora;

    private  Multiplicador multiplicador;

    public ExecutorOperacoes(Calculadora calculadora, Multiplicador multiplicador) {

        this.calculadora = calculadora;
        this.multiplicador = multiplicador;
    }

    public int executarOperacoes(int a, int b) {
        int soma = calculadora.somar(a, b);
        int subtracao = calculadora.subtrair(a, b);
        int multiplicacao = multiplicador.multiplicar(a, b);

        return soma + subtracao + multiplicacao;
    }
}
