package Prolog.unification;

public class Constant implements ITerm, IConstant{

	private String name;
	private UnificationResultFactory factory;
	
	
	Constant(String name) {
		this.name = name;
		factory = new UnificationResultFactory();
	}
	
	@Override
	public IUnificationResult unify(ITerm secondTerm) {
		return secondTerm.unify((IConstant)this);
	}

	@Override
	public ITerm apply(ISubstitution substitution) {
		return substitution.otherTerm(this);
	}

	@Override
	public IUnificationResult unify(IPredicate iPredicate) {
		return factory.createUnsuccesfulResult();
	}

	@Override
	public IUnificationResult unify(IConstant iConstant) {
		if(iConstant.hasDifferentName(name)) {
			return factory.createUnsuccesfulResult();
		}
		
		IUnificationResult unif = factory.createSuccesfulResult();
        Substitution subst = new Substitution();
        subst.add(this, (ITerm)iConstant);
        unif.add(subst);
        return unif;
	}

	@Override
	public IUnificationResult unify(IVariable iVariable) {
		return ((ITerm)iVariable).unify((IConstant)this);
	}

	@Override
	public boolean hasDifferentName(String otherName) {
		return name != otherName;
	}


	@Override
	public void print() {
		System.out.print(name + " ");
		
	}

}
