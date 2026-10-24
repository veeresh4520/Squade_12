public class Issue55_BusPassengerStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A12", "B12", "C12"};
        String target = new String("B12");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
