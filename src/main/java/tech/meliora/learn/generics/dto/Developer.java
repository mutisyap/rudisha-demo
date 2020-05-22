package tech.meliora.learn.generics.dto;

public class Developer {
    private String name;

    private int yearsOfExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public boolean equals(Object obj) {
        return super.hashCode() == (obj.hashCode());
    }
}
