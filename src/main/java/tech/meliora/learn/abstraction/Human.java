package tech.meliora.learn.abstraction;

public class Human implements Animal {
    @Override
    public String move() {
        return "Move by lifting legs";
    }
}
