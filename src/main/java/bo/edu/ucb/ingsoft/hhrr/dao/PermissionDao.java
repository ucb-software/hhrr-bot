package bo.edu.ucb.ingsoft.hhrr.dao;

import bo.edu.ucb.ingsoft.hhrr.dto.PermissionDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PermissionDao {

    @Select("SELECT p.employee_id as employeeId, p.start_date as startDate, p.end_date as endDate, p.rea son " +
            " FROM permission p " +
            "      JOIN employee e ON (p.employee_id = e.employee_id) " +
            "WHERE " +
            " e.bot_chat_id = #{id}")
    List<PermissionDto> findAllPermissionByBotChatId(@Param("id") String botChatId);
}
