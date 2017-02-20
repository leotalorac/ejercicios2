/**
 * Created by lotalorafox on 2/20/2017.
 */
public class DVDPlayerTestDrive {
    public static void main(String[] args){
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        //el metodo playDVD no existia
        d.playDVD();

        if(d.canRecord == true){
            d.recordDVD();
        }
    }
}
