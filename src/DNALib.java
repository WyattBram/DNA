public class DNALib {
    public static Boolean validator(String s) {
        if (s.isEmpty() || s.length() % 3 != 0 || !s.contains("A") ||
                !s.contains("C") ||
                !s.contains("G") ||
                !s.contains("T")) {
            return false;
        }
        else{
            return validator(s);

        }
    }




    
}
