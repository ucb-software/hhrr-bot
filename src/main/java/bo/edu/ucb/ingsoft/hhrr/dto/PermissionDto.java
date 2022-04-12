package bo.edu.ucb.ingsoft.hhrr.dto;

import java.util.Date;

public class PermissionDto {
    private Integer permissionId;
    private Integer employeeId;
    private Date startDate;
    private Date endDate;
    private String reason;

    public PermissionDto() {
    }

    public PermissionDto(Integer permissionId, Integer employeeId, Date startDate, Date endDate, String reason) {
        this.permissionId = permissionId;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "PermissionDto{" +
                "permissionId=" + permissionId +
                ", employeeId=" + employeeId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", reason='" + reason + '\'' +
                '}';
    }
}
