package br.com.projetoJava.pacote1;
import br.com.projetoJava.pacote2.Multiplicador;
import br.com.projetoJava.pacote3.ExecutorOperacoes;
import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteExecutorOperacoes {

    @Test
    public void testeExecutarOperacoes() {

        Calculadora calculadora = new Calculadora();
        Multiplicador multiplicador = new Multiplicador();
        ExecutorOperacoes executor = new ExecutorOperacoes(calculadora, multiplicador);

        int resultado = executor.executarOperacoes(4, 3);

        assertEquals(20, resultado);
    }

    @Test
    public void testeSubtrairComNumeroMenor() {

        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora calculadora = new Calculadora();
            calculadora.subtrair(3, 5);
        });
    }
}

