package Prolog.unification;

import java.util.List;

public interface IUnificationResult {

	void add(IUnificationResult partialUnificationResult);
	void add(ISubstitution iSubstitution);

	ITerm applySubstitutionsTo(ITerm firstTerm);

	void addTo(List<ISubstitution> otherSubstitutions);

	boolean wasNotSuccesful();
	
	void print();
	

}
