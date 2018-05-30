package Prolog.unification;

public interface ITerm {

	IUnificationResult unify(ITerm secondTerm);

	ITerm apply(ISubstitution substitution);

	IUnificationResult unify(IPredicate iPredicate);
	
	IUnificationResult unify(IConstant iConstant);
	
	IUnificationResult unify(IVariable iVariable);
	
	void print();
}
