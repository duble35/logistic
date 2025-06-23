
import com.app.dao.PermissionDAO;
import com.app.dto.PermissionDTO;
import java.util.List;

public class PermissionReadTest {

    public void read() {
        try {

            PermissionDAO objDAO = new PermissionDAO();
            PermissionDTO objDTO = new PermissionDTO();

            List<PermissionDTO> list = objDAO.read();

            for (PermissionDTO objList : list) {
                System.out.println("id: " + objList.getPermissionId());
                System.out.println("name: " + objList.getPermissionName());
            }

        } catch (Exception e) {
            System.out.println("Err: " + e.getMessage());
        }
    }
}
