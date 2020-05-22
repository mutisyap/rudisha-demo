package tech.meliora.learn.generics.dev;

import tech.meliora.learn.generics.dto.Developer;

import java.util.ArrayList;
import java.util.List;

public class DevelopmentTeam<T extends Developer> {
    private final List<T> members = new ArrayList<>();

    public boolean addDeveloper(Developer developer) {
        if (members.contains(developer)) {
            System.out.println("Developer " + developer.getName() + " already in team");
            return false;
        } else {
            System.out.println("Adding developer : "+developer.getName()+" experience : "+ developer.getYearsOfExperience()+" class : "+developer.getClass());
            return true;
        }
    }
}
