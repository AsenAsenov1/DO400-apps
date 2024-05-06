package com.redhat.training.operation;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public final class Identity implements Operation {

<<<<<<< HEAD
    public Identity() {
        super();
    }

=======
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
    @Override
    public Float apply(final String equation) {
        try {
            return Float.valueOf(equation);
        } catch (final NumberFormatException e) {
            return null;
        }
    }

}
