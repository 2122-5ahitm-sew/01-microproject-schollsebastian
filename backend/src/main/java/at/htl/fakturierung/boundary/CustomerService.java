package at.htl.fakturierung.boundary;

import at.htl.fakturierung.controller.CustomerRepository;
import at.htl.fakturierung.entity.Customer;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/customer")
public class CustomerService {
    @Inject
    CustomerRepository repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAll() {
        return repository.listAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer get(@PathParam("id") long id) {
        return repository.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Customer post(Customer customer) {
        repository.persist(customer);
        return customer;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Customer put(@PathParam("id") long id, Customer customer) {
        Customer originalCustomer = repository.findById(id);

        if (originalCustomer != null) {
            originalCustomer.firstName = customer.firstName;
            originalCustomer.lastName = customer.lastName;
            originalCustomer.street = customer.street;
            originalCustomer.houseNumber = customer.houseNumber;
            originalCustomer.zip = customer.zip;
            originalCustomer.city = customer.city;
        }

        return originalCustomer;
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Customer delete(@PathParam("id") long id) {
        Customer customer = repository.findById(id);
        repository.delete("id = " + id);
        return customer;
    }
}
