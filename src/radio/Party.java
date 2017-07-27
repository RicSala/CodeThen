package radio;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Party {

	/**
	 * Main method just to use the created class
	 * Prompts the user the first time that opens the radio, once the user decided he/she wants to use it, shows the
	 * action menu and keep doing the selected action 'til the radio in turned off
	 *
	 * @param args
	 * @throws IOException not handled.
	 */
	public static void main(String[] args) throws IOException {

		Radio radio = new Radio("CodeRadio");
		PartyLogic partyLogic = new PartyLogic(radio);
		PartyPrompt partyPrompt = new PartyPrompt(radio);

		if (partyPrompt.openRadio()) {
			radio.toggleOn();
			}

		while (radio.isOn()) {

			int action = partyPrompt.promptForAction();
			partyLogic.performAction(action);

		}

		System.out.println("APAGANDO RADIO - PARTY IS OVER!");



	}

}
