package exceptions;

@SuppressWarnings("serial")
public class InvalidDayException extends Exception {

    public InvalidDayException(String p,String r) {
        super("La persona no puede ingresar, Su penultimo numero de documento es "+p+" y hoy es un dia "+r);
    }

}
