package bo.edu.ucb.ingsoft.hhrr;

import bo.edu.ucb.ingsoft.hhrr.dao.EmployeeDao;
import bo.edu.ucb.ingsoft.hhrr.dto.EmployeeDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisTest {

    private EmployeeDao employeeDao;

    @Autowired
    public MyBatisTest(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Test
    public void testSelectAllEmployees() {
        List<EmployeeDto> employeeDtoList = employeeDao.findAllEmployees();
        for( EmployeeDto emp : employeeDtoList) {
            System.out.println("Empleado: " + emp);
        }

    }
}
