package ma.emsi.jouida.tp0jouida_soufiane;

public class RequeteException extends Exception {
    public RequeteException(String message, String prettyPrinting) {
        super(message + prettyPrinting);
    }

}