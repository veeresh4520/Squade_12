public class Issue53_BusPassengerSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {5, 7, 2, 112};
        int target = 112;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
