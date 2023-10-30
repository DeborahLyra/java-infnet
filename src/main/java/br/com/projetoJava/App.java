package br.com.projetoJava;

import br.com.projetoJava.pacote1.ClasseA1;
import br.com.projetoJava.pacote2.ClasseB1;
import br.com.projetoJava.pacote3.ClasseC1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClasseA1 a1 =new ClasseA1();
        ClasseB1 b1 =new ClasseB1();
        ClasseC1 c1 =new ClasseC1();

        a1.usarMetodoDeB1();
        c1.usarMetodoDeA1();

        System.out.println( "Hello World!" );
    }
}
