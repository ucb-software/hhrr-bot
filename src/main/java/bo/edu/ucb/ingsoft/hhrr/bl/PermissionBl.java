package bo.edu.ucb.ingsoft.hhrr.bl;

import bo.edu.ucb.ingsoft.hhrr.dto.PermissionDto;

import java.util.ArrayList;
import java.util.List;

public class PermissionBl {

    public PermissionBl() {
    }

    public List<PermissionDto> findLast10PermissionsByChatId(Long chatId) {
        List<PermissionDto> result = new ArrayList<>();
        result.add(new PermissionDto("10/12/2021", "12/12/2021", "Cuenta vacación"));
        result.add(new PermissionDto("23/12/2021", "26/12/2021", "Navidad"));
        return result;
    }
}
