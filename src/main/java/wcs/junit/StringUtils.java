package wcs.junit;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaîne formée par les voyelles d'une chaîne de caractères
     * @return Chaîne avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        if (candidate == null) {
            throw new IllegalArgumentException("La chaîne de caractères ne peut pas être nulle");
        }
        
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }
    public static String Uniquevowel(String candidate) {
      if (candidate == null) {
          throw new IllegalArgumentException("La chaîne de caractères ne peut pas être nulle");
      }
      
      String vowels = "";
      char[] letters = candidate.toCharArray();
      for (int i = 0; i < candidate.length(); i++) {
          if (ALL_VOWELS.indexOf(letters[i]) >= 0 && vowels.indexOf(letters[i]) == -1) {
              vowels += letters[i];
          }
      }
      return vowels;
  }
}
