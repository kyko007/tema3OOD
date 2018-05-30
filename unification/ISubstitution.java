package Prolog.unification;

public interface ISubstitution {
	
	public void add(ITerm firstTerm, ITerm secondTerm);
	ITerm otherTerm(ITerm term);
	
	void print();
}
