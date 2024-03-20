package lab.bjes.enums;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


enum EnumOrder {
    FIRST, SECOND, SMTH, THIRD, FOURTH
}
class AlphabeticalComparator implements Comparator<EnumOrder> {
    @Override
    public int compare(EnumOrder a, EnumOrder b) {
        return a.toString().compareTo(b.toString());
    }
}
public class EnumOrderLab {
    public EnumOrderLab() {
        enumOrder();
    }

    private void enumOrder() {
        System.out.println("--- Enums - Order");
        System.out.println("Every enum implements comparable and the natural order of enums is the order they are defined");
        List<EnumOrder> eList = List.of(EnumOrder.FIRST, EnumOrder.THIRD, EnumOrder.FOURTH, EnumOrder.SECOND);

        System.out.println("With the enum class: enum EnumOrder { FIRST, SECOND, SMTH, THIRD, FOURTH }");
        System.out.println("Printing unsorted list");
        eList.forEach(x -> System.out.print(x + ", "));

        System.out.println();
        System.out.println("Printing sorted list: ");
        eList.stream().sorted().map(x -> x + ", ").forEach(System.out::print);
        System.out.println();


        System.out.println("--- Enums - TreeSet");
        System.out.println("Creating a TreeSet using same list as above and printing content");

        TreeSet<EnumOrder> eTree = new TreeSet<>(eList);
        eTree.forEach(x -> System.out.print(x + ", "));
        System.out.println();

        System.out.println("Now Creating a TreeSet with a custom comparator (comparing string value)");
        TreeSet<EnumOrder> eTreeAlph = new TreeSet<>(new AlphabeticalComparator());
        eTreeAlph.addAll(eList);
        eTreeAlph.forEach(x -> System.out.print(x + ", "));
        System.out.println();
    }

}
