package _22_Sets_And_Maps;

import java.util.HashSet;

public class _01_SetsCollectionsFramework {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(34); set.add(67); set.add(89); set.add(18);
        set.add(14); set.add(37); set.add(891); set.add(181);
        System.out.print(set);
        System.out.println();
        System.out.println(set.size());
        System.out.println(set.contains(891));
        set.remove(89);
        System.out.println(set.size());
        System.out.println(set.contains(89));
    }
}
