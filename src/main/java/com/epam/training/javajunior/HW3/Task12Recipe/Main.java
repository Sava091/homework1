package com.epam.training.javajunior.HW3.Task12Recipe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD.MM.YYYY");

        Prescription.Builder prescriptionBuilder = new Prescription.Builder()
                .setPatient("Alex Mostipan")
                .setDoctor("Alexander Nalivayko")
                .setMedicine("Java injection")
                .setDate(simpleDateFormat.format(new Date()))
                .setValidityDays(30);

        Prescription prescription = prescriptionBuilder.build();
        System.out.println(prescription);

        prescription = prescriptionBuilder.setDate("30.05.2019").build();
        System.out.println(prescription);
    }

}
