package homework2;

public class TrovaNumero {

    public int trovaNumeroFrequente(int[] array) {
        int tempEl = 0;
        int occorrenze = 0;
        int finEl = 0;
        int occorrenzeMax = 0;

        if(array.length == 0) {
            return 0;
        }

        for(int i = 0; i < array.length; i++) {
            tempEl = array[i];
            occorrenze = 0;

            for(int j = i; j < array.length; j++) {
                if(array[j] == tempEl) {
                    occorrenze++;
                }
            }

            if(occorrenze > occorrenzeMax) {
                occorrenzeMax = occorrenze;
                finEl = tempEl;
            }
        }
        return finEl;
    }

}
