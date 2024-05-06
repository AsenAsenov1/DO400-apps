package com.redhat.training.operation;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.redhat.training.service.SolverService;
@ApplicationScoped
public final class Substract implements Operation {
=======
import java.util.function.BinaryOperator;

import javax.enterprise.context.ApplicationScoped;
@ApplicationScoped
public final class Substract extends BinaryOperation {
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1

    private static final String REGEX = "(.+)\\-(.+)";
    private static final BinaryOperator<Float> OPERATOR = (lhs, rhs) -> lhs - rhs;

    public Substract() {
<<<<<<< HEAD
        super();
    }

    @Override
    public Float apply(final String equation) {
        return solveGroups(equation).stream().reduce(OPERATOR).orElse(null);
    }

    private List<Float> solveGroups(final String equation) {
        Matcher matcher = Pattern.compile(REGEX).matcher(equation);
        if (matcher.matches()) {
            List<Float> result = new ArrayList<>(matcher.groupCount());
            for (int groupNum = 1; groupNum <= matcher.groupCount(); groupNum++) {
                result.add(solve(matcher.group(groupNum)));
            }
            return result;
        } else {
            return Collections.emptyList();
        }
    }

    @Inject
    SolverService solverService;

    private Float solve(final String equation) {
        return solverService.solve(equation);
=======
        super(OPERATOR, REGEX);
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
    }

}
