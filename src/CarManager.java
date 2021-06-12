public class CarManager {


    public static void main(String[] args) {
        PassangerCar prius = new PassangerCar("Toyota Prius", 2000, 15000, 1200, Color.GREEN);


        Bus renault = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);


        Car renault2 = new Car("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
        prius.addDistance(1000);
        prius.addDistance(15000);
        prius.addDistance(20.5);
        renault.addDistance(15000);


        System.out.println(prius);
        System.out.println(renault);

        System.out.println(renault);
        System.out.println(prius.equals(renault));
        System.out.println(renault.equals(renault2));
        System.out.println(prius.isReadyToSevice());
        System.out.println(renault.isReadyToSevice());
    }


}
