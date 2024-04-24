package AtividadePratica4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class Calculadora {
    static Scanner scan = new Scanner(System.in);
    Queue<String> filaInfixa = new Queue<String>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<String> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] ts) {
            return null;
        }

        @Override
        public boolean add(String s) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends String> collection) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public boolean offer(String s) {
            return false;
        }

        @Override
        public String remove() {
            return null;
        }

        @Override
        public String poll() {
            return null;
        }

        @Override
        public String element() {
            return null;
        }

        @Override
        public String peek() {
            return null;
        }
    };
    public static void main(String[] args) {
        String exp = scan.nextLine();
        String[] simbolos = exp.split(" ");
        for (String simb : simbolos) {
            System.out.println(simb);
            Queue<String> filaInfixa = new Queue<String>() {
                @Override
                public boolean add(String s) {
                    return false;
                }

                @Override
                public boolean offer(String s) {
                    return false;
                }

                @Override
                public String remove() {
                    return null;
                }

                @Override
                public String poll() {
                    return null;
                }

                @Override
                public String element() {
                    return null;
                }

                @Override
                public String peek() {
                    return null;
                }

                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<String> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] ts) {
                    return null;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> collection) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends String> collection) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> collection) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> collection) {
                    return false;
                }

                @Override
                public void clear() {

                }
            };
            filaInfixa.add(simb);
            filaInfixa.toString();
        }
    }
    }
