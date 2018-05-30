package Prolog.unification;

import java.util.List;

public class PredicateFactory {
	
	
	public Predicate create(String name, List substitutedTerm) {
		return new Predicate(name, substitutedTerm);
	}
}
