package HomeWork01.EX3;

import java.util.concurrent.CopyOnWriteArrayList;

public class GenreJazz implements Runnable {

    @Override
    public void run() {
        CopyOnWriteArrayList<String> list = PlaylistFormation.copyOnWriteArrayList;
        list.add("Track_30 - Track_Name_30 (Genre-Jazz)");
        list.add("Track_31 - Track_Name_31 (Genre-Jazz)");
    }
}