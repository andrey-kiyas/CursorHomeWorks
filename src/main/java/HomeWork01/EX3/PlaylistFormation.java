package HomeWork01.EX3;

import java.util.concurrent.CopyOnWriteArrayList;

public class PlaylistFormation {

    public static volatile CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

    public static void print() {
        for (String MyTrack : copyOnWriteArrayList) {
            System.out.println(MyTrack);
        }
    }
}