public class Patient {
    private String name;
    private String middleName;
    private String surname;
    private boolean gender;
    private int age;
    private int passportNumber;
    private String address;

    private Patient(PatientBuilder builder) {
        name = builder.name;
        middleName = builder.middleName;
        surname = builder.surname;
        gender = builder.gender;
        age = builder.age;
        passportNumber = builder.passportNumber;
        address = builder.address;
    }
    public void Display() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(middleName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(passportNumber);
        System.out.println(address);
    }
    public static class PatientBuilder { //Сам билдер с обязательными и необязательными параметрами
        private String name;
        private String middleName;
        private String surname;
        private boolean gender;
        private int age;
        private int passportNumber;
        private String address;
        public PatientBuilder(String name, String surname) { //Сразу получаем обязательные параметры
            this.name = name;
            this.surname = surname;
        }

        public PatientBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PatientBuilder setPassportNumber(int pN) {
            this.passportNumber = pN;
            return this;

        }

        public PatientBuilder setAge(int age) {
            this.age = age;
            return this;

        }
        public PatientBuilder setGender(boolean gender) {
            this.gender = gender;
            return this;
        }

        public PatientBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        public Patient build() {
            return new Patient(this);
        }
    }
}
