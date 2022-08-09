package HomeWork01.EX3;

import java.util.concurrent.CopyOnWriteArrayList;

public class Genre1 implements Runnable {

    @Override
    public void run() {
        CopyOnWriteArrayList<String> list = PlaylistFormation.copyOnWriteArrayList;
        list.add("Track_10 - Track_Name_10 (Genre1)");
    }
}