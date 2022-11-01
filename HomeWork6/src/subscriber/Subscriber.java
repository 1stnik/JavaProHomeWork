package subscriber;

public class Subscriber {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String city;
    private String phoneNumber;
    private String contractNumber;
    private double accountBalance;
    private int localTalkTime;
    private int intercityTalkTime;
    private double internetTraffic;


    public Subscriber() {
    }

    public Subscriber(int id, String surname, String name, String patronymic, String city,
                      String phoneNumber, String contractNumber, double accountBalance,
                      int localTalkTime, int intercityTalkTime, double internetTraffic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.accountBalance = accountBalance;
        this.localTalkTime = localTalkTime;
        this.intercityTalkTime = intercityTalkTime;
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getLocalTalkTime() {
        return localTalkTime;
    }

    public void setLocalTalkTime(int localTalkTime) {
        this.localTalkTime = localTalkTime;
    }

    public int getIntercityTalkTime() {
        return intercityTalkTime;
    }

    public void setIntercityTalkTime(int intercityTalkTime) {
        this.intercityTalkTime = intercityTalkTime;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Subscriber{");
        sb.append(" id = ").append(id);
        sb.append(", surname  '").append(surname).append('\'');
        sb.append(", name = '").append(name).append('\'');
        sb.append(", patronymic = '").append(patronymic).append('\'');
        sb.append(", city = '").append(city).append('\'');
        sb.append(", phoneNumber = '").append(phoneNumber).append('\'');
        sb.append(", contractNumber = '").append(contractNumber).append('\'');
        sb.append(", accountBalance = ").append(accountBalance);
        sb.append(", localTalkTime = ").append(localTalkTime);
        sb.append(", intercityTalkTime = ").append(intercityTalkTime);
        sb.append(", internetTraffic = ").append(internetTraffic);
        sb.append('}');
        return sb.toString();
    }
}
