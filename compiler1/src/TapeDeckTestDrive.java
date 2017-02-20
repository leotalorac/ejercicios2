/**
 * Created by lotalorafox on 2/20/2017.
 */
public class TapeDeckTestDrive {
    public static void main(String [] args){
        // el error existia debido a que el objeto 't' no habia sido inicializado
        TapeDeck t = new TapeDeck();

        t.canRecord = true;
        t.playTape();

        if(t.canRecord == true){
            t.recordTape();
        }

    }
}
