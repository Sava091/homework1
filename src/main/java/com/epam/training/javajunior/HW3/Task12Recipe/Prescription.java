package com.epam.training.javajunior.HW3.Task12Recipe;

public class Prescription {

    private String patient;
    private String doctor;
    private String medicine;
    private String date;
    private int validityDays;

    public static final class Builder {

        private String patient;
        private String doctor;
        private String medicine;
        private String date;
        private int validityDays;

        public Builder setPatient(String patient) {
            this.patient = patient;
            return this;
        }

        public Builder setDoctor(String doctor) {
            this.doctor = doctor;
            return this;
        }

        public Builder setMedicine(String medicine) {
            this.medicine = medicine;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setValidityDays(int validityDays) {
            this.validityDays = validityDays;
            return this;
        }

        public Prescription build() {
            return new Prescription(this);
        }
    }

    private Prescription(Builder builder) {
        this.patient = builder.patient != null ? builder.patient : this.patient;
        this.doctor = builder.doctor!= null ? builder.doctor : this.doctor;
        this.medicine = builder.medicine!= null ? builder.medicine : this.medicine;
        this.date = builder.date!= null ? builder.date : this.date;
        this.validityDays = builder.validityDays > 0 ? builder.validityDays : this.validityDays;
    }

    public String getPatient() {
        return patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getMedicine() {
        return medicine;
    }

    public String getDate() {
        return date;
    }

    public int getValidityDays() {
        return validityDays;
    }

    @Override
    public String toString() {
        return "Prescription[" +
                " doctor= " + doctor +
                ", patient= " + patient +
                ", medicine= " + medicine +
                ", date= " + date +
                ", validityDays= " + validityDays + "]";
    }
}

