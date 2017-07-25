package htmlTemplate;

import java.nio.charset.*;
import java.io.IOException;
import java.util.Scanner;


public class Prompter {


  /**
   *
   * @return String with the content of the file
   */
  public static String  readFile() {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Please, type file path (relative): %n");
    String path = scanner.nextLine();

    try {
      String html = Logic.readFile(path, Charset.defaultCharset());
      // System.out.println(html);
      System.out.printf("Reading file...%n");
      return html;
    } catch (IOException ioe ) {
      ioe.printStackTrace();
      throw new RuntimeException(ioe);
    }
  }

  /**
   * Allow the user to select the separator of the template placeholders
   * @return 2 position array with separators
   */
  public static String[] selectSeparators() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, type the opener separator: ");
    String opener = scanner.nextLine();
    System.out.println("Please, type the closer separator: ");
    String closer = scanner.nextLine();
    String[] separators = {opener, closer};
    return separators;

  }

  /**
   * Given a placeholder name, ask the user the value to use in the custom text
   * @param placeholderName;
   * @return String with the value entered by the user
   */
  public static String getValue(String placeholderName) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Please provide your value for the variable " + placeholderName + ":  %n");
    return scanner.nextLine();

  }


}
