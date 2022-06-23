package arithmetic;

public interface Arithmeticable<T extends Arithmeticable<T>>
        extends Multiplicable<T> {

    default T negate() {
        return this.times(-1);
    }

    default T minus(T subtrahend) {
        return this.plus(subtrahend.negate());
    }

    T divides(T divisor);

}
