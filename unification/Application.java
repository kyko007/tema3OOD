package Prolog.unification;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args)
    {
        PredicateFactory factoryPredicate = new PredicateFactory();

        List<ITerm> terms1 = new ArrayList<>();
        terms1.add(new Variable("X"));
        terms1.add(new Variable("Y"));

        ITerm p1 = factoryPredicate.create("p", terms1);

        List<ITerm> terms2 = new ArrayList<>();
        terms2.add(new Variable("Y"));
        terms2.add(new Constant("a"));

        ITerm p2 = factoryPredicate.create("p", terms2);

        IUnificationResult unificationResult = p1.unify(p2);
        unificationResult.print();
        System.out.println();
        System.out.println();

        p1.print();
        System.out.println();

        p2.print();
        System.out.println();

        System.out.println();
        p1 = unificationResult.applySubstitutionsTo(p1);

        p1.print();
        System.out.println();

        p2.print();
        System.out.println();
    }
}
