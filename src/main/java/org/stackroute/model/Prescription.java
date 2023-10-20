package org.stackroute.model;

// add required annotations

import jakarta.persistence.*;

@Entity
@Table(name = "prescription")
public class Prescription {
   // add data members for Prescription class id, pateintId, doctorId, medication, dosage, frequency, startDate, endDate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private int patientId;
   private int doctorId;
   private String medication;
   private String dosage;
   private String frequency;
   private String startDate;
   private String endDate;

  // add constructor
    public Prescription(Long id, int patientId, int doctorId, String medication, String dosage, String frequency, String startDate, String endDate) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.medication = medication;
        this.dosage = dosage;
        this.frequency = frequency;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //add default constructor
    public Prescription() {
        super();
    }

    // add getters and setters
    public Long getId() {
        return id;
    }

    public int getPateintId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getMedication() {
        return medication;
    }

    public String getDosage() {
        return dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPateintId(int pateintId) {
        this.patientId = pateintId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;

    }

    // add toString() method
    @Override
    public String toString() {
        return "Prescription{" +
                "id='" + id + '\'' +
                ", pateintId=" + patientId +
                ", doctorId=" + doctorId +
                ", medication='" + medication + '\'' +
                ", dosage='" + dosage + '\'' +
                ", frequency='" + frequency + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }


  



}




