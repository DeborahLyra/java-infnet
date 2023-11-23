package br.com.projetoJava.pacote1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Calculadora {
    private static final Logger logger = LoggerFactory.getLogger(Calculadora.class);
    public int somar(int a, int b) {
        logger.info("Executando soma de {} e {}", a, b);
        return a + b;
    }

    public int subtrair(int a, int b) {
        logger.debug("Executando subtração de {} e {}", a, b);
        if (a < b) {
            logger.error("Tentativa de subtrair um número menor de um número maior.");
            throw new IllegalArgumentException("Subtração resultaria em número negativo");
        }
        return a - b;
    }
}


