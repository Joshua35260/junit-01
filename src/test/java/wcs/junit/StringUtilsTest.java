package wcs.junit;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
  @Test
    public void testVowels() {
        // Cas non passant : la méthode ne remplit pas son contrat

        // Cas de test 1 : chaîne de caractères vide
        String result1 = StringUtils.vowels("");
        Assert.assertEquals("", result1);

        // Cas de test 2 : chaîne de caractères sans voyelles
        String result2 = StringUtils.vowels("Hll WRLD");
        Assert.assertEquals("", result2);

        // Cas de test 3 : chaîne de caractères avec des voyelles
        String result3 = StringUtils.vowels("Hello World");
        Assert.assertEquals("eoo", result3);
    }
    @Test(expected = IllegalArgumentException.class)
      public void testVowelsException() {
        // Cas d'exception : paramètre en entrée non défini (null)
        StringUtils.vowels(null);
    }

    @Test
      public void testUniqueVowel() {
        // Cas non passant : la méthode ne remplit pas son contrat

        // Cas de test 1 : chaîne de caractères vide
        String result1 = StringUtils.Uniquevowel("");
        Assert.assertEquals("", result1);

        // Cas de test 2 : chaîne de caractères sans voyelles
        String result2 = StringUtils.Uniquevowel("Hll WRLD");
        Assert.assertEquals("", result2);

        String result3 = StringUtils.Uniquevowel("Hello Worldu");
        Assert.assertEquals("eou", result3);
    }

}
