/**
 *The class {@code Exception} and its subclasses are a
 *form of {@code Throwable} that indicates conditions that a reasonable
 *application might want to catch.
 *
 *
 *<p>The class {@code Exception} and any subclasses that are not also
 *subclasses of {@link RuntimeException} are <em>checked
 *exceptions</em>. Checked exceptions need to be declared in a
 *method or constructor's {@conde throws} clause if they can be thrown
 *by the execution of the method or cosntructor and propagate outside
 *the method or constructor boundary.

 *@author David Edson da cruz
 *@see java.lang.error
 */


package br.com.alura.comex.modelo;

public class ExceptionFalhaMotor extends RuntimeException{
    public ExceptionFalhaMotor(String msg){
        super(msg);
    }
}
