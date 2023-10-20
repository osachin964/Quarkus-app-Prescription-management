package org.stackroute.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.stackroute.model.Prescription;

@ApplicationScoped
public class PrescriptionRepository implements PanacheRepository<Prescription> {

        // add findbyid method
        public Prescription findById(String id) {
            return find("id", id).firstResult();
        }
}
