import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal catFelix = Animal.builder()
                .name("Felix")
                .species("cat")
                .breed("british")
                .age(4)
                .gender("male")
                .isVaccinated(true)
                .lastCheckup(LocalDate.of(2024, 3, 4))
                .build();


        Animal dogBuddy = Animal.builder()
                .name("Buddy")
                .species("dog")
                .breed("labrador")
                .age(2)
                .gender("male")
                .isVaccinated(false)
                .build();

        System.out.println(catFelix);
        catFelix.setAge(5);
        catFelix.setLastCheckup(LocalDate.now());
        System.out.println(catFelix);

        dogBuddy.setVaccinated(true);
        System.out.println(dogBuddy);
    }
}
