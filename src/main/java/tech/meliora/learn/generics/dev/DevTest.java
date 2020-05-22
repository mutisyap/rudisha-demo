package tech.meliora.learn.generics.dev;

import tech.meliora.learn.generics.dto.BackEndDeveloper;
import tech.meliora.learn.generics.dto.Developer;
import tech.meliora.learn.generics.dto.FrontEndDeveloper;

public class DevTest {
    public static void main(String[] args) {
        BackEndDeveloper kamochu = new BackEndDeveloper(true, "Kamochu", 10);
        BackEndDeveloper sheila = new BackEndDeveloper(true, "Sheila", 15);

        DevelopmentTeam<BackEndDeveloper> backEndDeveloperDevelopmentTeam = new DevelopmentTeam<>();
        backEndDeveloperDevelopmentTeam.addDeveloper(kamochu);
        backEndDeveloperDevelopmentTeam.addDeveloper(sheila);

        FrontEndDeveloper jere = new FrontEndDeveloper(false, "Jeremy", 5);
        FrontEndDeveloper torocy = new FrontEndDeveloper(true, "Torocy", 3);

        DevelopmentTeam<FrontEndDeveloper> frontEndDeveloperDevelopmentTeam = new DevelopmentTeam<>();
        frontEndDeveloperDevelopmentTeam.addDeveloper(jere);
        frontEndDeveloperDevelopmentTeam.addDeveloper(torocy);

       /* DevelopmentTeam<Integer> integerDevelopmentTeam = new DevelopmentTeam<>();
        integerDevelopmentTeam.addDeveloper(1);
        integerDevelopmentTeam.addDeveloper(2);*/
        DevelopmentTeam<Developer> agileTeam = new DevelopmentTeam<>();
        agileTeam.addDeveloper(sheila);
        agileTeam.addDeveloper(torocy);


        Thread thread = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Testing from runnable");
            }
        });
        thread.start();

        new Thread(() -> {
            System.out.println("Testing from runnable with Lambda");
        }).start();


    }
}
