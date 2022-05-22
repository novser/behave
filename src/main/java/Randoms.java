import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected Random random;

    private class Random {
        private int min;
        private int max;

        private Random(int min, int max) {
            this.min = min;
            this.max = max;
        }

        private int getRandomNumber() {
            return min + (int) (Math.random() * ((max - min) + 1));
        }
    }

    public Randoms(int min, int max) {
        this.random = new Random(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.getRandomNumber();
            }
        };
    }
}