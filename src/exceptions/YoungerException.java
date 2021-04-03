package exceptions;

@SuppressWarnings("serial")
public class YoungerException extends Exception {

    public YoungerException(String id) {
        super("La persona no puede ingresar porque es menor de edad, SU DOCUMENTO ES "+id);
    }

}
