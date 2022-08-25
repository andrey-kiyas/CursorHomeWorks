package HomeWork01.EX3;

import java.util.concurrent.CopyOnWriteArrayList;

public class GenreOpera implements Runnable {

    @Override
    public void run() {
        CopyOnWriteArrayList<String> list = PlaylistFormation.copyOnWriteArrayList;
        list.add("Track_50 - Track_Name_50 (Genre-Opera)");
        list.add("Track_51 - Track_Name_51 (Genre-Opera)");
        list.add("Track_52 - Track_Name_52 (Genre-Opera)");
    }
}