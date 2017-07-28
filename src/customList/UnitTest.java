package customList;

public class UnitTest {

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
		assertEquals(elementList.contains("Sí que lo contiene"), false);
		elementList.add("Sí que lo contiene");
		assertEquals(elementList.contains("Sí que lo contiene"), true);
	}

	private static void testDelete() {
		String alumno1 = "Ferran";
		String alumno2 = "Javi";
		String alumno3 = "Ricardo";
		String alumno4 = "Laia";

		ElementList elementList = new ElementList();

		elementList.add(alumno1);
		elementList.add(alumno2);
		elementList.add(alumno3);
		elementList.add(alumno4);
		// {Ferran, Javi, Ricardo, Laia}


		elementList.deleteElement(3);
		// {Ferran, Javi, Ricardo}
		assertEquals(elementList.getLast().getObject(), "Ricardo");

		elementList.deleteElement(0);
		// {Javi, Ricardo}
		assertEquals(elementList.getFirst().getObject(), "Javi");

		elementList.deleteElement(1);
		// {Javi}
		assertEquals(elementList.size(), 1);
		assertEquals(elementList.getFirst().getObject(), "Javi");
		assertEquals(elementList.getLast().getObject(), "Javi");
		assertEquals(elementList.isEmpty(), false);

		// {null} TODO: en realidad no es null, pero size es igual a zero...¿Debería hacerlo null?
		elementList.deleteElement(0);
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
		// {Ferran, Javi, Ricardo, Laia}


		/*Syst/em.out.println(elementList.getElement(0).getNext());
		System.out.println(elementList.getElement(1).getNext());
		System.out.println(elementList.getElement(2).getNext());
*/
		//assertEquals(elementList.toString(), "1) Ferran\n2) Javi\n3) Laia\n");

	}

	/** Checks that 2 values are equal; throws an exception if not. */
	private static void assertEquals(Object actual, Object expected) {
		if (!(actual == null && expected == null) && !actual.equals(expected)) {  //TODO: Comentar Ferran, he modificado este método para que si ambos son null no entre en la exepción (lanzaba Runtimeexcp)
			throw new RuntimeException("not equals!! shoud be " + expected + " and its " + actual);
		}
	}



}
