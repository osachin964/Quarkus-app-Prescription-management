package org.stackroute.controller;

import java.util.List;

// add required imports

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.stackroute.model.Prescription;
import org.stackroute.service.PrescriptionService;



// Add annotations for Path, Produces,Consumes
@Path("/prescription")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PrescriptionController {
// inject Prescription service
    
    @Inject
    PrescriptionService prescriptionService;

// add crud operations using Response

     
    @GET
    public Response getAllPrescriptions() {
        return Response.ok(prescriptionService.getAllPrescriptions()).build();
    }

    @GET
    @Path("/{id}")
    public Response getPrescriptionById(@PathParam("id") String id) {
        return Response.ok(prescriptionService.getPrescriptionById(id)).build();
    }

    @POST
    public Response addPrescription(Prescription prescription) {
        return Response.ok(prescriptionService.addPrescription(prescription)).build();
    }

    @PUT
    @Path("/{id}")
    public Response updatePrescription(@PathParam("id") String id, Prescription prescription) {
        return Response.ok(prescriptionService.updatePrescription(id, prescription)).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletePrescription(@PathParam("id") String id) {
        return Response.ok(prescriptionService.deletePrescription(id)).build();
    }

   
   


}
