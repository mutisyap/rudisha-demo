package tech.meliora.learn.generics;

import tech.meliora.learn.generics.dto.CDR;

public class TwigaCDRProcessor implements TwigaProcessor<CDR> {
    @Override
    public boolean process(CDR cdr) {
        System.out.println("Processing CDRs");
        return false;
    }
}
