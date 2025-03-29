package Persona;
import java.time.LocalDate;
import java.time.Period;

class Persona {
    String name;
    String lastName;
    LocalDate dateBorn; // Cambiado de int a LocalDate
    int height;
    int weight;
    int dni;
    int age;
    char sex;

    public Persona(int dni) {
        this.name = "n";
        this.lastName = "n";
        this.dateBorn = LocalDate.of(2000, 1, 1);
        this.height = 1;
        this.weight = 1;
        this.age = getAge();
        this.sex = 'f';
    }

    public Persona(String name, String lastName, int dni) {
        this.name = name;
        this.lastName = lastName;
        this.dateBorn = LocalDate.of(2000, 1, 1);
        this.height = 1;
        this.weight = 1;
        this.age = getAge();
        this.sex = 'f';
    }

    public Persona(String name, String lastName, int dni, LocalDate dateBorn) {
        this.name = name;
        this.lastName = lastName;
        this.dateBorn = dateBorn;
        this.height = 1;
        this.weight = 1;
        this.age = getAge();
        this.sex = 'f';
    }

    public int getAge() {
        return Period.between(dateBorn, LocalDate.now()).getYears();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int calcImc() {
        return weight / (height * height);

    }

    public void inForm() {
        if (calcImc() > 18.5 && calcImc() < 25) {
            System.out.println("Esta en forma");
        } else {
            System.out.println("No esta en forma");
        }
    }

    public void isBirthday() {
        LocalDate today = LocalDate.now();
        if (today.getMonthValue() == dateBorn.getMonthValue() && today.getDayOfMonth() == dateBorn.getDayOfMonth()) {
            System.out.println("Hoy es tu cumpleaños");
        } else {
            System.out.println("No es tu cumpleaños");
        }
    }

    public void isMajor() {
        if (age >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public void esCoherente() {
        LocalDate today = LocalDate.now();
        int ageCalc = Period.between(dateBorn, today).getYears();
        if (ageCalc == age) {
            System.out.println("La fecha de nacimiento coincide con la edad");
        } else {
            System.out.println("La fecha de nacimient no coincide con la edad");
        }
    }

    public void canVote() {
        if (age >= 16) {
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }
    }

    public void showInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
        System.out.println("Fecha de nacimiento: " + dateBorn);
        System.out.println("Altura: " + height);
        System.out.println("Peso: " + weight);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + age);
        System.out.println("Sexo: " + sex);
    }
}