package arithmetic;

public interface Multiplicable<T> extends Summable<T> {

    T times(T multiplicand);

    T times(int multiplicand);

}
