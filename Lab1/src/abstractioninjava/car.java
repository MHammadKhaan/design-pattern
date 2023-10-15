package abstractioninjava;

/**
 *
 * @author fa20-bse-011
 */
abstract class car {

    boolean status;

    abstract void start();

    abstract void stop();

    public void carStatus() {
        if (status == true) {
            System.out.println("car is moving");;
        } else {
            System.out.println("car is not moving");
        }
    }

}
