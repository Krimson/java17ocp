package lab.bjes.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathLab {

    public PathLab() {
        pathResolve();
        subPath();
        pathNormalize();
        pathName();
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

    private void subPath() {
        System.out.println("--- Paths - Subpath");

        System.out.println("Creating Path p1 with Path.of(\"/home/bjes/\", \"docs\", \"reports\", \"monthly\", \"text.doc\")");
        Path p1 = Path.of("/home/bjes/", "docs", "reports", "monthly", "text.doc");
        System.out.println("Path p1: " + p1);

        System.out.println("Extracting subpaths using Path.subpath(int beginIndex, int endIndex), indexing starts at 0, not including root, ie c:\\");
        System.out.println("p1.subpath(0, 4) = " + p1.subpath(0, 4));
        System.out.println("p1.subpath(0, 2) = " + p1.subpath(0, 2));
        System.out.println("p1.subpath(3, 5) = " + p1.subpath(3, 5));
        System.out.println("p1.subpath(0, 4).subpath(1,3) = " + p1.subpath(0, 4).subpath(1,3));


        System.out.println("IllegalArgumentException if subpath has out of bounds parameters.");
    }

    private void pathNormalize() {
        System.out.println("--- Paths - Normalize");
        System.out.println("Path.normalize(): returns path without redundant names");
        Path p1 = Path.of("/home/bjes/", "d1", "subdir", "text.doc");
        System.out.println("p1: " + p1);
        System.out.println("p1.normalize(): " + p1.normalize());
        Path p2 = Path.of("home/bjes/../luab/pictures");
        System.out.println("p2: " + p2);
        System.out.println("p2.normalize(): " + p2.normalize());
    }

    private void pathName() {
        System.out.println("--- Paths - Names");
        Path p1 = Path.of("var/log/application1/archive/application1-2023-12-24.log");
        System.out.println("Path p1: " + p1);
        System.out.println("p1.getName(3): " + p1.getName(3)); // Illegal argument if index doesn't exist
        System.out.println("p1.getNameCount(): " + p1.getNameCount());

        System.out.println("Looping through p1, printing each name separately: ");
        for(var v = 0; v < p1.getNameCount(); v++) {
            System.out.print(v + ": " + p1.getName(v) + ", ");
        }
        System.out.println();
    }
}
