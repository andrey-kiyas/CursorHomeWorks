package HomeWork01.EX3;

import java.util.concurrent.CopyOnWriteArrayList;

public class Genre3 implements Runnable {

    @Override
    public void run() {
        CopyOnWriteArrayList<String> list = PlaylistFormation.copyOnWriteArrayList;
        list.add("Track_30 - Track_Name_30 (Genre3)");
        list.add("Track_31 - Track_Name_31 (Genre3)");
    }
}