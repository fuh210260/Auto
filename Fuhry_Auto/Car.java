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
    
    /**
     * brand needs to be a String and you need ""
     * model needs to be a String and you need ""
     * hp needs to be an integer
     * cabrio can either be false or true
     * dachtraeger can either be false or true
     * buildyear needs to be an integer
     * km needs to be an integer
     */
    public Car(String brand,String model,int hp,boolean cabrio,boolean dachtraeger,int buildyear,int km) {
        setBrand(brand);
        setModel(model);
        setHP(hp);
        setCabrio(cabrio);
        setDachtraeger(dachtraeger);
        setBuildyear(buildyear);
        setKm(km);
    }
    
    /**
     * brand needs to be a String and you need ""
     * model needs to be a String and you need ""
     * hp needs to be an integer
     * cabrio can either be false or true
     */
    public Car(String brand,String model,int hp,boolean cabrio) {
        setBrand(brand);
        setModel(model);
        setHP(hp);
        setCabrio(cabrio);
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
        else {
            System.out.println("hp must be positive");
        }
    }
    
    /**
     * for boolean, therse no plausibilitycheck
     */
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
    
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    
    public int getHP() {
        return hp;
    }
    
    public boolean getCabrio() {
        return cabrio;
    }
    
    public boolean getDachtraeger() {
        return dachtraeger;
    }
    
    public int getBuildyear() {
        return buildyear;
    }
    
    public int getKm() {
        return km;
    }
    
    public void anzeigen() {
        System.out.println(brand + " " + model + ", " + hp + " HP (" + buildyear + ") Dachtrager:" + dachtraeger + " Cabrio:" + cabrio + " - " + km + " km.");
    }
    
    /**
     * adds a specified amount to the current km's
     */
    public void fahren(int kmNew) {
        if(kmNew >= 0) {
            setKm(km + kmNew);    
        }
        else {
            System.out.println("km needs to be positive");
        }
    }
    
    public void mountDachtraeger() {
        if(dachtraeger == false) {
            setDachtraeger(true);
        }
        else {
            System.out.println("Dachtraeger already mounted");
        }
    }
    
    public void changeDachtraeger() {
        /*
        if(dachtraeger == false) {
            setDachtraeger(true);
        }
        else {
            setDachtraeger(false);
        }
        */
        setDachtraeger(!dachtraeger);
    }  
    
    public void tuning() {
        setHP(hp + 10);        
    }
}