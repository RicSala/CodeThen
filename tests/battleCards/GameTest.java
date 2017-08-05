package battleCards;

import battleCards.cardGame.Card;
import battleCards.cardGame.CardDeck;
import battleCards.cardGame.CardHand;
import battleCards.cardGame.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//TODO: PENDING. EN ESTE CASO NO NECESITARÍA NI CREAR LA INTERFACE DE CARDDECK
//TODO: YA QUE AL SHUFFLE NO ESTÁ METIDO EN EL JUEGO, SINO QUE LO PIDE EL PROMPTER Y ADEMÁS ESTÁ YA TESTADO!

public class GameTest {
	private CardDeck cardDeck;
	private Game game;

	@Before
	public void setUp() throws Exception {
		cardDeck = new CardDeck();
		game = new Game(cardDeck);


	}

	@Test
	public void fight() throws Exception {

	}

	@Test
	public void isCardHandCompleteTest() throws Exception {

		/*Player player = new Player("Ric");
		player.pickCard(cardDeck); //aquí en realidad debería evitar esta llamada con una clase fake, sino estaría haciendo test dentro de test!
		player.pickCard(cardDeck);
		player.pickCard(cardDeck);
		*/

		/*TODO: NO! PICK CARD DEVUELVE UNA CARTA, PERO YA ESTÁ! OJO QUE LO TIENES LÓGICA EN EL PROMPTER Y ESO LO HACE DIFICIL DE TESTEAR.
		TODO: SEPARAR MÁS LA LÓGICA DEL PROMPTER.

		 */
		//assertTrue(game.isCardHandComplete(player));
	}

	@Test
	public void getCardDeck() throws Exception {
	}

}

/* LAS CARTAS VAN A SALIR POR ESTE ORDEN (DE ABAJO A ARRIBA)

Magic: 1 | Strength: 1 | Intelligence: 8
Magic: 1 | Strength: 2 | Intelligence: 7
Magic: 1 | Strength: 3 | Intelligence: 6
Magic: 1 | Strength: 4 | Intelligence: 5
Magic: 1 | Strength: 5 | Intelligence: 4
Magic: 1 | Strength: 6 | Intelligence: 3
Magic: 1 | Strength: 7 | Intelligence: 2
Magic: 1 | Strength: 8 | Intelligence: 1
Magic: 2 | Strength: 1 | Intelligence: 7
Magic: 2 | Strength: 2 | Intelligence: 6
Magic: 2 | Strength: 3 | Intelligence: 5
Magic: 2 | Strength: 4 | Intelligence: 4
Magic: 2 | Strength: 5 | Intelligence: 3
Magic: 2 | Strength: 6 | Intelligence: 2
Magic: 2 | Strength: 7 | Intelligence: 1
Magic: 3 | Strength: 1 | Intelligence: 6
Magic: 3 | Strength: 2 | Intelligence: 5
Magic: 3 | Strength: 3 | Intelligence: 4
Magic: 3 | Strength: 4 | Intelligence: 3
Magic: 3 | Strength: 5 | Intelligence: 2
Magic: 3 | Strength: 6 | Intelligence: 1
Magic: 4 | Strength: 1 | Intelligence: 5
Magic: 4 | Strength: 2 | Intelligence: 4
Magic: 4 | Strength: 3 | Intelligence: 3
Magic: 4 | Strength: 4 | Intelligence: 2
Magic: 4 | Strength: 5 | Intelligence: 1
Magic: 5 | Strength: 1 | Intelligence: 4
Magic: 5 | Strength: 2 | Intelligence: 3
Magic: 5 | Strength: 3 | Intelligence: 2
Magic: 5 | Strength: 4 | Intelligence: 1
Magic: 6 | Strength: 1 | Intelligence: 3
Magic: 6 | Strength: 2 | Intelligence: 2
Magic: 6 | Strength: 3 | Intelligence: 1
Magic: 7 | Strength: 1 | Intelligence: 2
Magic: 7 | Strength: 2 | Intelligence: 1
Magic: 8 | Strength: 1 | Intelligence: 1
*/