
public class Main {
    public static int deliveryDay (int deliveryDistance) {
        byte deliveryDay = (byte) (1 + (deliveryDistance + 19) / 40f);
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставка не осуществляется!");
        }
        return deliveryDay;
    }
    public static void main(String[] args) {
        int deliveryDistance = 95;
        System.out.println("Для доставки потребуется дней: " + deliveryDay(deliveryDistance));

    }
}