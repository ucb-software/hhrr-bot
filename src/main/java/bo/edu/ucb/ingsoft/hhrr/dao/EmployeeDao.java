package bo.edu.ucb.ingsoft.hhrr.dao;

import bo.edu.ucb.ingsoft.hhrr.dto.EmployeeDto;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeDao {
    @Select("SELECT employee_id, names, surnames, bot_chat_id FROM employee")
    public List<EmployeeDto> findAllEmployees();
}
