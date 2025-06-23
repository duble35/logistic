
import com.app.dao.PermissionDAO;
import com.app.dto.PermissionDTO;
import java.util.Scanner;

public class PermissionCreateTest {
    public static void main(String[] args) {
        
        new PermissionReadTest();
        
        Scanner in = new Scanner(System.in);
        String permissionName;
        System.out.print("Escreva o nome da permissão: ");
        permissionName = in.nextLine().trim().toUpperCase();
        PermissionDTO objDTO = new PermissionDTO();
        PermissionDAO objDAO = new PermissionDAO();
        objDTO.setPermissionName(permissionName);
        objDAO.create(objDTO);
        
        new PermissionReadTest();
    }
}
