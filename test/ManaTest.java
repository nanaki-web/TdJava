import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManaTest {

    @Test
    public void readKeyTest() {
        // La clé cryptée donnée plus haut
        String keyCrypted = "6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==";
        // La clé décryptée que nous devrions obtenir
        String keyDecrypted = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
        // le test d'égalité entre la clé attendue et la sortie de la méthode de la librairie. Si le décryptage ne fonctionne pas nous aurons le message définit ici
        Assertions.assertEquals(keyDecrypted, ManaBox.decrypt(keyCrypted));
        StringUtils.stripAccents("école ééééèèèèèè");
        StringUtils.stripAccents(keyCrypted);

    }
}


