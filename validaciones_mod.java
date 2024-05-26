public class validaciones_mod {
    public boolean digitosmod(String dgt) {
        for (char c : dgt.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean flotantemod(String dgt) {
        for (char c : dgt.toCharArray()) {
            if (!Character.isDigit(c) && c != '.') {
                return false;
            }
        }
        return true;
    }

    public boolean letrasmod(String dgt) {
        for (char c : dgt.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean lydmod(String dgt) {
        for (char c : dgt.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
