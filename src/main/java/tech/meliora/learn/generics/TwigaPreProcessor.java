package tech.meliora.learn.generics;

public class TwigaPreProcessor implements TwigaProcessor<Integer> {
    @Override
    public boolean process(Integer integer) {
        System.out.println("Twiga processor processing");
        return false;
    }
}
