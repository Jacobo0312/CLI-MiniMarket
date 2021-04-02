package exceptions;

@SuppressWarnings("serial")
public class YoungerException extends Exception {

    public YoungerException() {
        super("La persona no puede ingresar porque es menor de edad");
    }

}
