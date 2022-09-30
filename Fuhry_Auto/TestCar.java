
/**
 * test for Car
 * 
 * @author Rene Fuhry
 */
public class TestCar {
    public void test1() {
        Car car1 = new Car();
        
        System.out.println(car1.getDachtraeger()); //false
        car1.changeDachtraeger();
        System.out.println(car1.getDachtraeger()); //true
        car1.changeDachtraeger();
        System.out.println(car1.getDachtraeger()); //false
    }
    
    public void test2() {
        Car car1 = new Car();
        
        System.out.println(car1.getKm()); //300
        car1.fahren(15);
        System.out.println(car1.getKm()); // 315
        car1.fahren(-2);                  // should output error
    }
}
