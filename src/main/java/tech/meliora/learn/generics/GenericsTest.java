package tech.meliora.learn.generics;

import tech.meliora.learn.generics.dto.CDR;

public class GenericsTest {
    public static void main(String[] args) {
        TwigaProcessor<CDR> processor = new TwigaCDRProcessor();

        processor.process(new CDR());
    }
}
