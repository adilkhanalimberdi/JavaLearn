package day7.task1;

public class Task1 {

    public static void main(String[] args) {
        Airplane first = new Airplane("Boeing", 2015, 35, 60000);
        Airplane second = new Airplane("Qazaq Air", 2019, 47, 65000);

        Airplane.compareAirplanes(first, second);
    }

}
