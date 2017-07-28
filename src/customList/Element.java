package customList;

/**
 * 4- Intentad modificar el ejercicio anterior de manera que no uséis List/ArrayList de Java, sino creando vuestra propia
 * lista. Por ejemplo haciendo que cada Chapter tenga un enlace al siguiente (Chapter next;). O creando una clase más
 * genérica como Element, que contenga un Chapter y también el siguiente Element.
 *
 * https://dzone.com/articles/intellij-idea-small-tips-big
 */

public class Element {
	private Object object;
	private Element next;

	public Element(Object object, Element nextElement) {
		this.object = object;
		this.next = nextElement;
	}

	public Element getNext() {
		return next;
	}

	public void setNextElement(Element next) {
		this.next = next;
	}

	public String toString() {
		return object.toString();
	}

	public boolean equals(Object otherObject) { //Implementar el equals para la clase de la que sea la lista...
		return equals(otherObject);
	}

	public Object getObject() {
		return object;
	}
}

