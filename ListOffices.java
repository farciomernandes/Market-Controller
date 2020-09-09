import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ListOffices {
    public ListOffices(){        
        final Office CreateOfficeServices = new Office();

        CreateOfficeServices.getOffices();        
    }
}
