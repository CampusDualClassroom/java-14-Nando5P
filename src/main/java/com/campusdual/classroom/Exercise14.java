package com.campusdual.classroom;

public class Exercise14 {

    public static void main(String[] args) {
        Person p = new Person("John", "Smith");
        Teacher t = new Teacher("Maria", "Montessori", "Educación");
        PoliceOfficer po = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor d = new Doctor("Gregory", "House", "Nefrología e Infectología");

        // Detalle de persona
        p.getDetails();

        // Detalles del policía
        po.getDetails();

        // Detalles del profesor
        t.getDetails();

        // Detalles del doctor
        d.getDetails();

    }

}