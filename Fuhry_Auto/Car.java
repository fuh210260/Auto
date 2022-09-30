/**
 * @author Rene Fuhry
 */
public class Car {
    private String brand;
    private String model;
    private int hp;
    private boolean cabrio;
    private boolean dachtraeger;
    private int buildyear;
    private int km;
    
    public Car() {
        setBrand("Fiat");
        setModel("500");
        setHP(69);
        setCabrio(false);
        setDachtraeger(false);
        setBuildyear(2010);
        setKm(300);
    }
    
    public void setBrand(String brandNew) {
        brand = brandNew;
    }
    
    public void setModel(String modelNew) {
        model = modelNew;
    }
    
    public void setHP(int hpNew) {
        if(hpNew > 0) {
            hp = hpNew;
        }
    }
    
    public void setCabrio(boolean cabrioNew) {
        cabrio = cabrioNew;
    }
    
    public void setDachtraeger(boolean dachtraegerNew) {
        dachtraeger = dachtraegerNew;
    }
    
    public void setBuildyear(int buildyearNew) {
        if(buildyearNew > 1900) {
            buildyear = buildyearNew;
        }
        else {
            System.out.println("buildyear needs to be older than 1900");
        }
    }
    
    public void setKm(int kmNew) {
        if(kmNew >= 0) {
            km = kmNew;
        }
        else {
            System.out.println("km needs to be positive");
        }
    }
}