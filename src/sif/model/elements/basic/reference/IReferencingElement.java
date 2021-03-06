package sif.model.elements.basic.reference;

import java.util.ArrayList;

import sif.model.elements.IElement;
import sif.model.elements.basic.address.AbstractAddress;

public interface IReferencingElement extends IElement {

	public void addOutgoingReference(AbstractReference reference);

	public AbstractAddress getAbstractAddress();

	public ArrayList<AbstractReference> getOutgoingReferences();

	public Boolean isReferenced(IReferencedElement referencedElement);

}
