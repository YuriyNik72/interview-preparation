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

    public String getCountry() { return country;}

    public String getAddress() { return address;}

    public String getPhone() { return phone;}

    public int getAge() { return age;}

    public String getGender() {
        return gender;
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

        public Builder withMiddleName(String middleName) {
            this.person.middleName = middleName;
            return this;
        }
        public Builder withCountry(String country) {
            this.person.country = country;
            return this;
        }
        public Builder withAddress(String address) {
            this.person.address = address;
            return this;
        }
        public Builder withPhone(String phone) {
            this.person.phone = phone;
            return this;
        }
        public Builder withAge(int age) {
            this.person.age = age;
            return this;
        }

        public Builder withGender(String gender) {
            this.person.gender = gender;
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
                .withMiddleName("Ivanovich")
                .withCountry("Russia")
                .withAddress("Moscow")
                .withPhone("+79999999999")
                .withAge(30)
                .withGender("M")
                .build();
        System.out.println(person);
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
