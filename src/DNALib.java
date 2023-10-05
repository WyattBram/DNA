public class DNALib {
    public static Boolean validator(String s) {
        if ((s.length() % 3 != 0 || s.isEmpty())) {
            System.out.println("Basics were false");
            return false;
        } else if (s.contains("A") || s.contains("C") || s.contains("G") || s.contains("T")) {
            for (int i = 0; i < 3; i++) {
                if (s.charAt(i) != 'A' && s.charAt(i) != 'C' && s.charAt(i) != 'G' && s.charAt(i) != 'T') {
                    System.out.println("Wrong letter");
                    return false;
                }
            }
            if (s.length() > 3) {
                return validator(s.substring(3));
            }
        }
            return true;

    }
}



    
