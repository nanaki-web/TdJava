import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tools.TransCoder;

public class TranscoTest {
    @Test
    public void transcoTest(){
        String cleCrypter = "6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==";
        TransCoder trans = new TransCoder(cleCrypter);


        Assertions.assertNotNull(trans);
        Assertions.assertNotNull(trans.getEncode());
        System.out.println(trans.getEncode().toString());
        Assertions.assertNotNull(trans.getDecode());
        System.out.println(trans.getDecode().toString());
    }
}

