package Prolog.unification;

import java.util.ArrayList;
import java.util.List;

public class Substitution implements ISubstitution{

	List<ITerm> terms;
	
	public Substitution() {
		terms = new ArrayList<ITerm>();
	}
	
	
	
	@Override
	public void add(ITerm firstTerm, ITerm secondTerm) {
		terms.add(firstTerm);
		terms.add(secondTerm);
	}


	@Override
	public ITerm otherTerm(ITerm term) {
		if(terms.contains(term) == false) {
			return term;
		}
		
		int position = terms.indexOf(term);
		return terms.get(1 - position);
	}



	@Override
	public void print() {
		for(ITerm term: terms) {
			term.print();
		}
	}
	
}
