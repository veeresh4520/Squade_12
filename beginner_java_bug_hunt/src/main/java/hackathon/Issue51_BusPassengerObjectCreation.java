public class Issue51_BusPassengerObjectCreation {
    public static void main(String[] args) {
        Summary summary = new Summary("Bus Ticket Booking System 12", 5, 7);
        System.out.println(summary.label + " total=" + summary.total());
    }
    static class Summary {
        String label; int unit, count;
        Summary(String label, int unit, int count) { this.label = label; this.unit = count; this.count = unit; }
        int total() { return unit + count; }
        int total(int adjustment) { return total() + adjustment * 100; }
    }
}
