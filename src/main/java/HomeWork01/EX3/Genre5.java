package HomeWork01.EX3;

import java.util.concurrent.CopyOnWriteArrayList;

public class Genre5 implements Runnable {

    @Override
    public void run() {
        CopyOnWriteArrayList<String> list = PlaylistFormation.copyOnWriteArrayList;
        list.add("Track_50 - Track_Name_50 (Genre5)");
        list.add("Track_51 - Track_Name_51 (Genre5)");
        list.add("Track_52 - Track_Name_52 (Genre5)");
    }
}