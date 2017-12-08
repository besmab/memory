/**
 * Created by besma on 08/12/2017.
 */
public class rax {
    private static rax ourInstance = new rax();

    public static rax getInstance() {
        return ourInstance;
    }

    private rax() {
    }
}
