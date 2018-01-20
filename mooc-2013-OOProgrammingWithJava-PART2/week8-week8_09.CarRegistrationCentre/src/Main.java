
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");
        VehicleRegister log = new VehicleRegister();
        
        log.add(reg1, "Pekka");
        log.add(reg2, "Arto");
        log.add(reg3, "Pekka");
        
        log.printRegistrationPlates();
        log.printOwners();
    }
}
