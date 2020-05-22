package tech.meliora.learn.abstraction;

import java.util.ArrayList;
import java.util.List;

public class AbstractionTest {
    public static void main(String[] args) {
        Bird bird = new Kuku();

        List<List<String>> listList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        System.out.println(bird.breathe());
    }
}
