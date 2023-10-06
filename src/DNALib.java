public class DNALib {
    public Boolean validator(String s) {
        if ((s.length() % 3 != 0 || s.isEmpty())) {
            return false;
        } else if (s.contains("A") || s.contains("C") || s.contains("G") || s.contains("T")) {
            for (int i = 0; i < 3; i++) {
                if (s.charAt(i) != 'A' && s.charAt(i) != 'C' && s.charAt(i) != 'G' && s.charAt(i) != 'T') {
                    return false;
                }
            }
            if (s.length() > 3) {
                return validator(s.substring(3));
            }
        }
        return true;
    }

    public String reverse(String s) {
        if (s.length() == 1) {
            return s;
        }
        else {
            return reverse(s.substring(1)) + s.charAt(0);

        }
    }

    public String inverser(String s){
        if(s.length() == 1){
            if(s.charAt(0)=='A'){
                return "T";
            }
            if(s.charAt(0)=='T'){
                return "A";
            }
            if(s.charAt(0)=='G'){
                return "C";
            }
            if(s.charAt(0)=='C'){
                return "G";
            }
        }

        if(s.charAt(0)=='A'){
            return "T" + inverser(s.substring(1));
        }
        if(s.charAt(0)=='T'){
            return "A" + inverser(s.substring(1));
        }
        if(s.charAt(0)=='G'){
            return "C" + inverser(s.substring(1));
        }
        else{
            return "G" + inverser(s.substring(1));
        }

    }

    public String translator(String s) {
        String aminoacid = "";
        if (s.length() < 3){
            return "";
        }
        else {
            switch (s.substring(0, 3)) {
                case "GCA", "GCC", "GCG", "GCT" -> aminoacid = "A";
                case "TGC", "TGT" -> aminoacid = "C";
                case "GAC", "GAT" -> aminoacid = "D";
                case "GAA", "GAG" -> aminoacid = "E";
                case "TTC", "TTT" -> aminoacid = "F";
                case "GGA", "GGC", "GGG", "GGT" -> aminoacid = "G";
                case "CAC", "CAT" -> aminoacid = "H";
                case "ATA", "ATC", "ATT" -> aminoacid = "I";
                case "AAA", "AAG" -> aminoacid = "K";
                case "CTA", "CTC", "CTG", "CTT", "TTA", "TTG" -> aminoacid = "L";
                case "ATG" -> aminoacid = "M";
                case "AAT", "AAC" -> aminoacid = "N";
                case "CCA", "CCC", "CCG", "CCT" -> aminoacid = "P";
                case "CAA", "CAG" -> aminoacid = "Q";
                case "AGA", "AGG", "CGA", "CGC", "CGG", "CGT" -> aminoacid = "R";
                case "AGC", "AGT", "TCA", "TCC", "TCG", "TCT" -> aminoacid = "S";
                case "ACA", "ACC", "ACG", "ACT" -> aminoacid = "T";
                case "GTA", "GTC", "GTG", "GTT" -> aminoacid = "V";
                case "TGG" -> aminoacid = "W";
                case "TAC", "TAT" -> aminoacid = "Y";
                case "TAA", "TAG", "TGA" -> aminoacid = "-";
            }
            return aminoacid + translator(s.substring(3));
        }
    }
}



    
