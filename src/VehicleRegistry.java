import java.util.HashMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> register = new HashMap();

    public VehicleRegistry() {
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.register.containsKey(licensePlate)) {
            this.register.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        return (String)this.register.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.register.containsKey(licensePlate)) {
            this.register.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        this.register.forEach((k, v) -> {
            System.out.println(k.toString());
        });
    }

    public void printOwners() {
        Set<String> set = new HashSet();
        Iterator var2 = this.register.values().iterator();

        String name;
        while(var2.hasNext()) {
            name = (String)var2.next();
            set.add(name);
        }

        var2 = set.iterator();

        while(var2.hasNext()) {
            name = (String)var2.next();
            System.out.println(name);
        }

    }
}