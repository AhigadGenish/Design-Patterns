public interface Predicate<T> {

    boolean test(T anyParam);

    default Predicate<T> and(Predicate<T> other){
        Predicate<T> current = this;
        return new Predicate<T>() {
            @Override
            public boolean test(T anyParam) {
                return other.test(anyParam) && current.test(anyParam);
            }
        };
        //  return anyParam -> other.test(anyParam) && current.test(anyParam);
        //  reutrn anyParam ->  other.test(anyParam) && test(anyParam);
    }

    default Predicate<T> or(Predicate<T> other){
        Predicate<T> current = this;
        return new Predicate<T>() {
            @Override
            public boolean test(T anyParam) {
                return other.test(anyParam) || current.test(anyParam);
            }
        };
        // return anyParam -> other.test(anyParam) || current.test(anyParam);
        // reutrn anyParam -> other.test(anyParam) || test(anyParam);
    }

    default Predicate<T> negate(){

        Predicate<T> current = this;

        return new Predicate<T>() {
            @Override
            public boolean test(T anyParam) {
                return !current.test(anyParam);
            }
        };

        // return (anyParam) -> !current.test(anyParam);
        // return t -> !test(t);
    }
}
