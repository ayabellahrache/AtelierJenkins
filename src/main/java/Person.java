

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Person {

    private final String givenName;
    private final String surname;
    private final LocalDate dateOfBirth;

    // Constructeur
    public Person(String givenName, String surname, LocalDate dateOfBirth) {
        this.givenName = givenName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter pour le nom complet affiché "Surname, GivenName"
    public String getDisplayName() {
        return surname + ", " + givenName;
    }

    // Getter pour la date de naissance formatée
    public String getDateOfBirthFormatted() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dateOfBirth.format(formatter);
    }

    // Méthode display complète
    public void display() {
        System.out.println("Name: " + getDisplayName());
        System.out.println("Date of Birth: " + getDateOfBirthFormatted());
    }

    // Getters si besoin
    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    long getAge() {
        return ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
    }

    public static void main(String[] args) {
        Person person = new Person("Joey", "Doe", LocalDate.parse("2013-01-12"));
    }
}
