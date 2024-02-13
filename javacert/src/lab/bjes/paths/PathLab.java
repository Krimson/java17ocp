package lab.bjes.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathLab {

    public PathLab() {
        pathResolve();
    }

    private void pathResolve() {
        System.out.println("--- Paths - Path resolve");
        Path p1 = Paths.get("/home/bjes/kod/javacert/javacert/src/run.sh");
        Path p2 = Paths.get("run.sh");
        System.out.println("Path p1: " + p1);
        System.out.println("Path p2: " + p2);

        System.out.println("Path p1 resolving p2: " + p1.resolve(p2));

        Path wP1 = Paths.get("c:\\temp\\test.txt");
        Path wP2 = Paths.get("test.txt");
        Path wP3 = Paths.get("/test.txt");

        System.out.println("Path wP1: " + wP1);
        System.out.println("Path wP2: " + wP2);
        System.out.println("Path wP3: " + wP3);

        System.out.println("Path wP1 resolving wP2: " + wP1.resolve(wP2));
        System.out.println("Path wP1 resolving wP3: " + wP1.resolve(wP3));
    }
}
