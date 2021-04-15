class FixCar {
    public static void main(String[] args) {
        boolean[] parts1 = {true, true, false, false};
        Car car1 = new Car(parts1);

        boolean[] parts2 = {false, true, true, true};
        Car car2 = new Car(parts2);

        Mechanic mechanic1 = new Mechanic();
        mechanic1.repair(car1);

        mechanic1.repair(car2);
        mechanic1.repair(car2); // bij de 2e keer repareren is de auto al gefixt

    }
}

class Car{
    String[] partnames = {"motor","door","windscreen","exhaust"};
    boolean motor;
    boolean door;
    boolean windscreen;
    boolean exhaust;
    public Car(boolean[] parts){
        this.motor = parts[0];
        this.door = parts[1];
        this.windscreen = parts[2];
        this.exhaust = parts[3];
        System.out.println("Car created. Motor broken: " + Boolean.toString(motor) + ". Door broken: " + Boolean.toString(door)
        + ". Windscreen broken: " + Boolean.toString(windscreen) + ". Exhaust broken: " + Boolean.toString(exhaust));
    }
}

class Mechanic{
    int price = 25;
    void repair(Car car){
        boolean[] parts = {car.motor,car.door,car.windscreen,car.exhaust};
        int totalprice = 0;
        System.out.println("=== Mechanic is repairing car ===");
        for (int i=0; i<parts.length; i++){
            if (parts[i]){
                totalprice += price;
                System.out.println("Mechanic repaired " + car.partnames[i]);
            }else{
                System.out.println(car.partnames[i] + " does not need repairing");
            }
        }
        car.motor = false;
        car.door = false;
        car.windscreen = false;
        car.exhaust = false;
        System.out.println("=== Car is repaired. " + "Total price is " + totalprice + " Euros ===");
    }
}


