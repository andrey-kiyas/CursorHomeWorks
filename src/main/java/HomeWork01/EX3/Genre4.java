package HomeWork01.EX3;

import java.util.concurrent.CopyOnWriteArrayList;

public class Genre4 implements Runnable {

    @Override
    public void run() {
        CopyOnWriteArrayList<String> list = PlaylistFormation.copyOnWriteArrayList;
        list.add("Track_40 - Track_Name_40 (Genre4)");
    }
}