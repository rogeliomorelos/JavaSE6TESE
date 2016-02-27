package modulo4.ejemplos;

/**
 *
 * @author Roberto Olveras
 */
public class ScopeExample {

    public int i = 0;
    public int j = 0;

    public void metodo1() {
        int i = 4, j = 5;
        this.i = i + j;
        metodo2(7);
    }

    public void metodo2(int i) {
        int j = 5;
        this.i = i + j;
    }
}
