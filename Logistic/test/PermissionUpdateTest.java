
import com.app.dao.PermissionDAO;
import com.app.dto.PermissionDTO;
import java.util.Scanner;

public class PermissionUpdateTest {

    public static void main(String[] args) {

        new PermissionReadTest().read();
        
        PermissionDTO objDTO = new PermissionDTO();
        PermissionDAO objDAO = new PermissionDAO();
        Scanner in = new Scanner(System.in);
        int id;
        String name;

        System.out.println("Digite o id: ");
        id = in.nextInt();
        
        in.nextLine();

        System.out.println("Digite a permissão: ");
        name = in.nextLine();

        objDTO.setPermissionId(id);
        objDTO.setPermissionName(name);

        objDAO.update(objDTO);

        new PermissionReadTest().read();

    }
}
