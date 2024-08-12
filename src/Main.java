
public class Main {
    public static void deliveryDay (int deliveryDistance) {
        byte deliveryDay = (byte) (1 + (deliveryDistance + 19) / 40f);
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставка не осуществляется!");
        }
    }
    public static void main(String[] args) {
        int deliveryDistance = 95;
        deliveryDay(deliveryDistance);
    }
}