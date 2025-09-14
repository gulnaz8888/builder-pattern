import java.time.LocalDate;

public class Animal {
    private final String name;
    private final String species;
    private final String breed;
    private int age;
    private final String gender;
    private boolean isVaccinated;
    private LocalDate lastCheckup;

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastCheckup(LocalDate lastCheckup) {
        this.lastCheckup = lastCheckup;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    private Animal(PetsBuilder builder) {
        this.name = builder.name;
        this.species = builder.species;
        this.breed = builder.breed;
        this.age = builder.age;
        this.gender = builder.gender;
        this.isVaccinated = builder.isVaccinated;
        this.lastCheckup = builder.lastCheckup;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", isVaccinated=" + isVaccinated +
                ", lastCheckup=" + lastCheckup +
                '}';
    }

    public static PetsBuilder builder() {
        return new PetsBuilder();
    }

    public static class PetsBuilder {
        private String name;
        private String species;
        private String breed;
        private int age;
        private String gender;
        private boolean isVaccinated;
        private LocalDate lastCheckup;

        public PetsBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PetsBuilder species(String species) {
            this.species = species;
            return this;
        }

        public PetsBuilder breed(String breed) {
            this.breed = breed;
            return this;
        }

        public PetsBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PetsBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public PetsBuilder isVaccinated(boolean isVaccinated) {
            this.isVaccinated = isVaccinated;
            return this;
        }

        public PetsBuilder lastCheckup(LocalDate lastCheckup) {
            this.lastCheckup = lastCheckup;
            return this;
        }

        public Animal build() {
            if (lastCheckup == null) {
                this.lastCheckup = LocalDate.now();
            }
                return new Animal(this);
            }
        }
    }

