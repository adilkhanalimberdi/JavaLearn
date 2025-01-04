package day11;

public class Task1 {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse);

        picker.doWork();
        courier.doWork();

        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);

        for (int i = 1; i < 1000; i++) {
            picker.doWork();
            courier.doWork();
        }

        picker.bonus();
        courier.bonus();
        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);

        for (int i = 0; i < 500; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);

        System.out.println(warehouse2);
        System.out.println(picker2);
        System.out.println(courier2);
    }

}
