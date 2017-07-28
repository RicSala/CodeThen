package customList;

public class UnitTest {

	/**
	 * Unit test for the main methods of Classes {@link ElementList} and {@link Element}
	 * @param args
	 */
	public static void main(String[] args) {

		testSize();
		testEmptyList();
		testAdd();
		testGetElement();
		testContains();
		testDelete();
		testToString();

		System.out.println("\n\n\nYOUR CLASS IS FINE! YEAH!!!");

	}


	private static void testSize() {
		ElementList elementList = new ElementList();
		assertEquals(elementList.size(), 0);
		elementList.add("Primero");
		elementList.add("Segundo");
		assertEquals(elementList.size(), 2);
		elementList.add("Segundo");
		assertEquals(elementList.size(), 3);

	}

	private static void testEmptyList() {
		ElementList elementList = new ElementList();
		assertEquals(elementList.isEmpty(), true);
		elementList.add("Ya no está vacía");
		assertEquals(elementList.isEmpty(), false);
	}

	private static void testAdd() {
	/* Creo unos cuantos elementos para poder probar las diferentes funciones y de paso chequear el método add()*/
		String alumno1 = "Ferran";
		String alumno2 = "Javi";
		String alumno3 = "Ricardo";
		String alumno4 = "Laia";

		ElementList elementList = new ElementList();

		elementList.add(alumno1);
		elementList.add(alumno2);
		elementList.add(alumno3);
		elementList.add(alumno4);

		assertEquals(elementList.size(), 4);
		assertEquals(elementList.getLast().getObject().toString(), "Laia");
		assertEquals(elementList.getFirst().getObject().toString(), "Ferran");
		assertEquals(elementList.getElement(0).getNext().toString(), "Javi");
		assertEquals(elementList.getElement(1).getNext().toString(), "Ricardo");
		assertEquals(elementList.getElement(2).getNext().toString(), "Laia");
		assertEquals(elementList.getElement(3).getNext(), null);  //TODO ver si esto era lo que le pasaba al otro método

	}

	private static void testGetElement() {
		String alumno1 = "Ferran";
		String alumno2 = "Javi";
		String alumno3 = "Ricardo";
		String alumno4 = "Laia";

		ElementList elementList = new ElementList();

		elementList.add(alumno1);
		elementList.add(alumno2);
		elementList.add(alumno3);
		elementList.add(alumno4);

		assertEquals(elementList.getElement(0).getObject().toString(), "Ferran");
		assertEquals(elementList.getElement(1).getObject().toString(), "Javi");
		assertEquals(elementList.getElement(2).getObject().toString(), "Ricardo");
		assertEquals(elementList.getElement(3).getObject().toString(), "Laia");
	}

	private static void testContains() {
		ElementList elementList = new ElementList();
		assertEquals(elementList.contains("No tengo esto"), false);
		elementList.add("Ahora sí que lo tengo");
		assertEquals(elementList.contains("Ahora sí que lo tengo"), true);
	}

	private static void testDelete() {
		String alumno1 = "Ferran";
		String alumno2 = "Javi";
		String alumno3 = "Ricardo";
		String alumno4 = "Laia";
		String alumno5 = "Kris";

		ElementList elementList = new ElementList();

		elementList.add(alumno1);
		elementList.add(alumno2);
		elementList.add(alumno3);
		elementList.add(alumno4);
		elementList.add(alumno5);
		// {Ferran, Javi, Ricardo, Laia, Kris}


		elementList.deleteElement(0);
		// {Javi, Ricardo, Laia, Kris}
		assertEquals(elementList.getElement(0).getNext().toString(), "Ricardo");
		assertEquals(elementList.getElement(1).getNext().toString(), "Laia");
		assertEquals(elementList.getElement(2).getNext().toString(), "Kris");
		assertEquals(elementList.getElement(3).getNext(), null);


		elementList.deleteElement(1);
		// {Javi, Laia, Kris}
		assertEquals(elementList.getElement(0).getNext().toString(), "Laia");
		assertEquals(elementList.getElement(1).getNext().toString(), "Kris");
		assertEquals(elementList.getElement(2).getNext(), null);
		assertEquals(elementList.getFirst().getObject().toString(), "Javi");
		assertEquals(elementList.getLast().getObject().toString(), "Kris");


		elementList.deleteElement(2);
		// {Javi, Laia}
		assertEquals(elementList.getFirst().getObject().toString(), "Javi");
		assertEquals(elementList.getLast().getObject().toString(), "Laia");
		assertEquals(elementList.getFirst().getNext().toString(), "Laia");
		assertEquals(elementList.getLast().getNext(), null);
		assertEquals(elementList.size(), 2);
		assertEquals(elementList.isEmpty(), false);


		elementList.deleteElement(0);
		elementList.deleteElement(0);
		//TODO: System.out.println(elementList.getElement(0)); //ESTO ME ESTÁ DICIENDO QUE EXISTE PERO VALE "NULL", debería mandar excepción?
		assertEquals(elementList.isEmpty(), true);
		assertEquals(elementList.getFirst(), null);
		assertEquals(elementList.getLast(), null);



	}

	private static void testToString() {

		String alumno1 = "Ferran";
		String alumno2 = "Javi";
		String alumno3 = "Ricardo";
		String alumno4 = "Laia";

		ElementList elementList = new ElementList();

		elementList.add(alumno1);
		elementList.add(alumno2);
		elementList.add(alumno3);
		elementList.add(alumno4);

		assertEquals(elementList.toString(), "1) Ferran\n2) Javi\n3) Ricardo\n4) Laia\n");
	}

	/** Checks that 2 values are equal; throws an exception if not. */
	private static void assertEquals(Object actual, Object expected) {
		if (!(actual == null && expected == null) && !actual.equals(expected)) {  //TODO: Comentar Ferran, he modificado este método para que si ambos son null no entre en la exepción (lanzaba Runtimeexcp)
			throw new RuntimeException("not equals!! shoud be " + expected + " and its " + actual);
		}
	}



}
