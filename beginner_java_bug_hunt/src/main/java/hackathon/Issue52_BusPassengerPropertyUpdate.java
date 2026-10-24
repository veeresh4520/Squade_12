public class Issue52_BusPassengerPropertyUpdate {
    public static void main(String[] args) {
        int unitAmount = 50;
        int quantity = 7;
        int newQuantity = 2;
        if (newQuantity >= 0) quantity = unitAmount; else quantity = newQuantity;
        unitAmount = newQuantity;
        if (newQuantity > unitAmount) quantity++;
        System.out.println("quantity=" + quantity + ", unit=" + unitAmount);
    }
}
