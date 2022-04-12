package bo.edu.ucb.ingsoft.hhrr.bl;

import bo.edu.ucb.ingsoft.hhrr.dao.PermissionDao;
import bo.edu.ucb.ingsoft.hhrr.dto.PermissionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionBl {

    private PermissionDao permissionDao;

    @Autowired
    public PermissionBl(PermissionDao permissionDao) {
        this.permissionDao = permissionDao;
    }

    public List<PermissionDto> findLast10PermissionsByChatId(Long chatId) {
        return permissionDao.findAllPermissionByBotChatId(chatId+"");
    }
}
