/**
 * This is not a real Java class. It won't be compiled ever. It is used
 * only as a text resource in integration.ChecksIT.
 */
public final class Invalid {
/*
    @todo #123! Realize method and constructor declaration checking.
    public Invalid(String name,
     String value
     ) {
    }
    public Invalid(
        String name,
        String value) {
    }
    public void print(String format,
       String text
    ) {
    }
    public void print(
        String format,
        String text) {
    }
*/
    public void main() {
      String.format("File %s not found",
        file);
      String.format(
        "File %s not found",
        file);
      String.format(
        "File %s not found", file);
    }
}
