package Prolog.unification;

import java.util.List;

public interface IPredicate {

	IUnificationResult unify(List<ITerm> arguments);

	boolean hasDifferentName(String otherName);
	
}
