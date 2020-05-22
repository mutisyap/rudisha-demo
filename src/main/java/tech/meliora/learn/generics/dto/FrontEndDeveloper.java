package tech.meliora.learn.generics.dto;

public class FrontEndDeveloper extends Developer {
    private boolean designer;

    public FrontEndDeveloper(boolean designer, String name, int yearsOfExperience) {
        this.designer = designer;
        this.setName(name);
        this.setYearsOfExperience(yearsOfExperience);
    }

    public boolean isDesigner() {
        return designer;
    }

    public void setDesigner(boolean designer) {
        this.designer = designer;
    }
}
