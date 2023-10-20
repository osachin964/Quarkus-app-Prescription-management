package org.stackroute.service;

import java.util.List;

// add required imports

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.stackroute.model.Prescription;
import org.stackroute.repository.PrescriptionRepository;


@ApplicationScoped
public class PrescriptionService {

    // inject PrescriptionRepository
    @Inject
    PrescriptionRepository prescriptionRepository;

    // add crud operations
    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepository.listAll();
    }

    public Prescription getPrescriptionById(String id) {
        return prescriptionRepository.findById(id);
    }
    @Transactional
    public Prescription addPrescription(Prescription prescription) {
        prescriptionRepository.persist(prescription);
        return prescription;
    }
    @Transactional
    public Prescription updatePrescription(String id, Prescription prescription) {
        Prescription prescriptionToUpdate = prescriptionRepository.findById(id);
        prescriptionToUpdate.setPateintId(prescription.getPateintId());
        prescriptionToUpdate.setDoctorId(prescription.getDoctorId());
        prescriptionToUpdate.setMedication(prescription.getMedication());
        prescriptionToUpdate.setDosage(prescription.getDosage());
        prescriptionToUpdate.setFrequency(prescription.getFrequency());
        prescriptionToUpdate.setStartDate(prescription.getStartDate());
        prescriptionToUpdate.setEndDate(prescription.getEndDate());
        prescriptionRepository.persist(prescriptionToUpdate);
        return prescriptionToUpdate;
    }

    @Transactional
    public Prescription deletePrescription(String id) {
        Prescription prescriptionToDelete = prescriptionRepository.findById(id);
        prescriptionRepository.delete(prescriptionToDelete);
        return prescriptionToDelete;
    }


}
