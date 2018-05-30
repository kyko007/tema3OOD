package Prolog.unification;

public class UnificationResultFactory {

	public IUnificationResult createSuccesfulResult() {
		return new UnificationResult();
	}
	
	public IUnificationResult createUnsuccesfulResult() {
		return new UnificationResult();
	}

}
