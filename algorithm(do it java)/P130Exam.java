public class P130Exam {
    public static class GenericClass<T>{
        private T xyz;

        public GenericClass(T t) {
            this.xyz = t;
        }

        public T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<>("ABC");
        GenericClass<Integer> i = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(i.getXyz());
    }
}
