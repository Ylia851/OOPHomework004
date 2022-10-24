import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Homework {
    public static abstract class Fruit {

        public abstract int weight();

        public static class Apple extends Fruit {

            @Override
            public int weight() {
                return 1;
            }
        }

        public static class Orange extends Fruit {
            @Override
            public double weight() {
                return 1.5;
            }
        }

        public static void main(String[] args) {
            List<Apple> apples = new ArrayList<>();
            apples.add(new Apple());
            apples.add(new Apple());
            overallWeight1(apples);
            List<Orange> oranges = new ArrayList<>();
            oranges.add(new Orange());
            oranges.add(new Orange());
            overallWeight(oranges);
        }

        public static void moveOranges(List<? extends Fruit> source, List<? super Fruit> dest, int maxWeight, double weight) {
            int w = 0;
            for (Fruit fr : source) {
                if(weight == 1.5){
                    w += fr.weight();
                    if (w <= maxWeight) {
                        dest.add(fr);
                    }
                }
            
        }

        public static void moveApples(List<? extends Fruit> source, List<? super Fruit> box, int maxWeight,
                int weight) {
            int w = 0;
            for (Fruit fr : source) {
                if (weight == 1) {
                    w += fr.weight();
                    if (w <= maxWeight) {
                        box.add(fr);
                    }
                }
            }
        }

        public static int overallWeight(List<? extends Orange> oranges) {
            int sum = 0;
            for (Orange or : oranges) {
                sum += or.weight();
            }
            return sum;
        }

        public static int overallWeight1(List<? extends Apple> apples) {
            int sum = 0;
            for (Apple ap : apples) {
                sum += ap.weight();
            }
            return sum;
        }

        public interface Comparable<source> {
            public int compareTo(source o){
                if(dest.weight.compareTo(o.weight) == 0){
                    return 0;
                else return 1;
            }
        }
        }
}
