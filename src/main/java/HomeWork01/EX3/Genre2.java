package HomeWork01.EX3;

import java.util.concurrent.CopyOnWriteArrayList;

public class Genre2 implements Runnable {

    @Override
    public void run() {
        CopyOnWriteArrayList<String> list = PlaylistFormation.copyOnWriteArrayList;
        list.add("Track_20 - Track_Name_20 (Genre2)");
        list.add("Track_21 - Track_Name_21 (Genre2)");
        list.add("Track_22 - Track_Name_22 (Genre2)");
    }
}