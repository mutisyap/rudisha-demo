package tech.meliora.learn.generics.dto;

public class BackEndDeveloper extends Developer {
    private boolean knowsDataModelling;

    public BackEndDeveloper(boolean knowsDataModelling, String name, int yearsOfExperience) {
        this.knowsDataModelling = knowsDataModelling;
        this.setName(name);
        this.setYearsOfExperience(yearsOfExperience);
    }

    public boolean isKnowsDataModelling() {
        return knowsDataModelling;
    }

    public void setKnowsDataModelling(boolean knowsDataModelling) {
        this.knowsDataModelling = knowsDataModelling;
    }
}
