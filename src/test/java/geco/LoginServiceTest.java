package geco;


import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;


/**
 * Created by christopher on 22/11/2016.
 */
public class LoginServiceTest  {
    LoginService l;
    @Before
    public void setUp() throws Exception {
        String s1="test";
        String[] testListe = new String[5];
        testListe[0]=s1;
        l = new LoginService(testListe);

    }

    @Test
    public void testLoginExists() throws Exception {
        assertEquals(true,l.loginExists("test"));
    }
    @Test
    public void testAddLogin() throws Exception {
        l.addLogin("toto");
        assertEquals(true,l.loginExists("toto"));


    }
    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        l.addLogin("toto");
        l.addLogin("tonton");
        l.addLogin("titi");
        ArrayList<String> listeAttendu=new ArrayList<String>();
        listeAttendu.add("toto");
        listeAttendu.add("tata");
        assertEquals(true,listeAttendu==l.findAllLoginsStartingWith("to"));
    }


    @Test
    public void testFindAllLogins() throws Exception {
        ArrayList<String> listeAttendu=new ArrayList<String>();
        listeAttendu.add("test");
        assertEquals(true,listeAttendu==l.findAllLogins());

    }

}