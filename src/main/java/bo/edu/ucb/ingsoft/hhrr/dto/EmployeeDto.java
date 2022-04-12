package bo.edu.ucb.ingsoft.hhrr.dto;

public class EmployeeDto {
    private Integer employeeId;
    private String names;
    private String surnames;
    private String botChatId;

    public EmployeeDto() {
    }

    public EmployeeDto(Integer employeeId, String names, String surnames, String botChatId) {
        this.employeeId = employeeId;
        this.names = names;
        this.surnames = surnames;
        this.botChatId = botChatId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getBotChatId() {
        return botChatId;
    }

    public void setBotChatId(String botChatId) {
        this.botChatId = botChatId;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeId=" + employeeId +
                ", names='" + names + '\'' +
                ", surnames='" + surnames + '\'' +
                ", botChatId='" + botChatId + '\'' +
                '}';
    }
}
