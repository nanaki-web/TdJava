import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;

public class Main {


    public static void main(String[] args)
    {
        manabox();
    }

    private static void manabox() {
        String message = "«Si tu as la chance d'être différent, ne change jamais.» - Taylor Swift";

        String originalString = "Tout problème simple a une solution complexe... qui ne fonctionne pas. Olivier Lockert\n" +
                "Voir sur https://citations.ouest-france.fr/citation-olivier-lockert/probleme-simple-solution-complexe-fonctionne-13756.html";


        String encryptedString = ManaBox.encrypt(originalString);
        String decryptedString = ManaBox.decrypt(encryptedString);
        String lissage = StringUtils.stripAccents(decryptedString);

        System.out.println("Message d'origine: ");
        System.out.println(originalString);
        System.out.println("_______________________________________________________");
        System.out.println("Message crypté: ");

        System.out.println(encryptedString);
        System.out.println("_______________________________________________________");
        System.out.println("Message décrypté: ");

        System.out.println(lissage);
    }


}