import java.util.ArrayList;
import java.util.List;

/**
 * Este arquivo ficará responsável por chamar os serviços e delegar qual método realiza qual função sem
 * se importar com as regras de negócio.
 */
public class OfficeRepository {
    List<Office> offices = new ArrayList<Office>();
    
    public void Create(Office new_office){
        this.offices.add(new_office);
    }

    public List<Office> getAll(){
        return this.offices;
    }

    public void Delete(int position_office){
        this.offices.remove(position_office);
    }
}
