
public abstract class ReceptorNeuron extends Nueron{
public abstract Double addInputs();
public void setTheValue() {
	value = addInputs();
}
}
