package customList;

public class ElementList {
	private int size;
	private Element first;
	private Element last;

	public ElementList() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	public Element getFirst() {
		return first;
	}

	public Element getLast() {
		return last;
	}

	public int size() {
		if ( first == null ) { //TODO --> SOBRA?
			return 0;
		}
		return size;
	}

	public Element getElement(int index) {

		Element e = first;

		for (int i = 0; i < index; i++) {
			e = e.getNext();
		}

		return e;
	}

	//TODO PARA PODER USAR LAS LISTAS, AÑADES OBJECTS!
	public void add(Object object) {
		Element element = new Element(object, null); //TODO puedes dejar que siempre sea null
		if (size == 0) {
			first = element;
		} else {
			getElement(size - 1).setNextElement(element);
		}
		last = element;
		size++;
	}

	public boolean contains(Object object) {
		for (int i = 0; i < size; i++) {
			if (object.equals(getElement(i).getObject())) {
				return true;
			}
		}
		return false;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public String toString() {
		String string = "";
		for (int i = 0; i < size; i++) {
			string += (i + 1) + ") " + getElement(i).getObject().toString() + "\n";
		}
		return string;
	}



	/**
	 * given an index, deletes an {@link Element} of the {@link ElementList}
	 * @param index
	 * @return true if the {@link ElementList} is not empty after delete, false otherwise (sim to isEmpty()!)
	 */
	public boolean deleteElement(int index) {

		if (isEmpty() || size() == 1) {
			size = 0;       //si hay uno o ninguno tras borrar uno, no hay ninguno ;)
			first = null;
			last = null;
			return false; } //si está vacío no hay nada que quitar, si hay uno no es lista, no hay next y también quedará vacía


		if (index == 0) {   //si quito el primero, como no hay anterior, no hay que actualizar ningún next. //TODO: Borrar de la lista simplmente se hace quitándolo de la cadena?
			//getElement(0).setNextElement(null); --> creo que no hace falta que haga null esto TODO: COMENTAR CON FERRAN
			first = getElement(1);
			size--;         //puedo hacer esto porque sabemos que hay, al menos, uno
			return true;
		}

		getElement(index - 1).setNextElement(getElement(index +1));

		if (index == size - 1) {                //si quito el último tengo que actualizar last. //TODO: CUESTA MENOS ESTO O HACER setLast() = getElement(size -1) al final?
			last = getElement(size - 2);
			last.setNextElement(null);
		}

		size--;

		return true;

	}



}