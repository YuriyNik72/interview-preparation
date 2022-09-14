package builder;

public class Person {

    private String firstname;

    private String lastname;

    private String middleName;

    private String country;

    private String address;

    private String phone;

    private int age;

    private String gender;



    private Person() {
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGender() {
        return gender;
    }

    public String getProfession() {
        return profession;
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final Person person;

        public Builder() {
            this.person = new Person();
        }

        public Builder withFirstname(String firstname) {
            this.person.firstname = firstname;
            return this;
        }

        public Builder withLastname(String lastname) {
            this.person.lastname = lastname;
            return this;
        }

        public Builder withBirthdate(String middleName) {
            this.person.middleName = middleName;
            return this;
        }

        public Builder withGender(String gender) {
            this.person.gender = gender;
            return this;
        }

        public Builder withProfession(String profession) {
            this.person.profession = profession;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    public static void main(String[] args) {
        Person person = Person.createBuilder()
                .withFirstname("Ivan")
                .withLastname("Petrov")
                .withGender("M")
                .build();
    }
}
