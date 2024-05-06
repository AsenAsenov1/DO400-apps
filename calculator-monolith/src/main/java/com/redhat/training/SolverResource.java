package com.redhat.training;

<<<<<<< HEAD
import java.util.List;

import javax.annotation.PostConstruct;
=======
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

<<<<<<< HEAD
import com.redhat.training.operation.Add;
import com.redhat.training.operation.Identity;
import com.redhat.training.operation.Operation;
import com.redhat.training.operation.Substract;
=======
import com.redhat.training.operation.Operation;
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
import com.redhat.training.service.SolverService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SolverResource implements SolverService {
    private static final Logger LOG = LoggerFactory.getLogger(SolverResource.class);

    @Inject
<<<<<<< HEAD
    Add add;

    @Inject
    Substract substract;

    @Inject
    Identity identity;

    private List<Operation> operations;

    @PostConstruct
    public void buildOperationList() {
        operations = List.of(substract, add, identity);
    }
=======
    OperationRegistry operations;
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1

    @Override
    public Float solve(@PathParam("equation") final String equation) {
        LOG.info("Solving '{}'", equation);
<<<<<<< HEAD
        for (Operation operation : operations) {
=======
        for (Operation operation : operations.getOperations()) {
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
            Float result = operation.apply(equation);
            if (result != null) {
                LOG.info("Solved '{} = {}'", equation, result);
                return result;
            }
        }

        throw new WebApplicationException(
                Response.status(Response.Status.BAD_REQUEST).entity("Unable to parse: " + equation).build());
    }

}
