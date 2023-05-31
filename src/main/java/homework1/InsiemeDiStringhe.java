package homework1;

import java.util.ArrayList;

public class InsiemeDiStringhe {

    public static String stringaLunga(String[] stringsArray) {

        if (stringsArray == null || stringsArray.length == 0) {
            throw new IllegalArgumentException();
        }

        String[] stringhe = new String[stringsArray.length];
        for(int i = 0; i < stringsArray.length; i++) {
            if(stringsArray[i] == null) {
                throw new IllegalArgumentException();
            }
            stringhe[i] = stringsArray[i];
        }

        String lunga = "";
        int lgmax = 0;

        for(int i=0; i < stringhe.length; i++) {
            if (stringhe[i].length() > lgmax) {
                lunga = stringhe[i];
                lgmax = stringhe[i].length();
            }
        }
        return lunga;
    }

    public static String spaziStringa(String[] stringsArray) {

        if (stringsArray == null) {
            throw new IllegalArgumentException();
        }

        String[] stringhe = new String[stringsArray.length];
        for(int i = 0; i < stringsArray.length; i++) {
            if(stringsArray[i] == null) {
                throw new IllegalArgumentException();
            }
            stringhe[i] = stringsArray[i];
        }

        String lex = "nessuna stringa con spazi";
        int spazi;
        int spazimax = 0;

        for(int i = 0; i < stringhe.length; i++) {
            spazi = 0;
            for(int j = 0; j < stringhe[i].length(); j++) {
                if (stringhe[i].charAt(j) == ' ') {
                    spazi++;
                }
            }
            if(spazi > spazimax) {
                spazimax = spazi;
                lex = stringhe[i];
            }
        }
        return lex;
    }

    public static String[] preStringa(String pre, String[] stringsArray) {

        if (stringsArray == null || pre == null) {
            throw new IllegalArgumentException();
        }
        if(pre.equals("")) {
            return new String[]{};
        }

        ArrayList<String> risultato = new ArrayList<>();

        String[] stringhe = new String[stringsArray.length];
        for(int i = 0; i < stringsArray.length; i++) {
            if(stringsArray[i] == null) {
                throw new IllegalArgumentException();
            }
            stringhe[i] = stringsArray[i];
        }

        int lg = 0;
        String s = "";
        lg = pre.length();
        for(int i = 0; i < stringhe.length; i++) {
            if (stringhe[i].length() >= lg) {
                s = stringhe[i].substring(0, lg);
                if (s.compareTo(pre) == 0) {
                    risultato.add(stringhe[i]);
                }
            }
        }
        String[] ritorno = new String[risultato.size()];
        for(int i = 0; i < risultato.size(); i++) {
            ritorno[i] = risultato.get(i);
        }
        return ritorno;
    }
}