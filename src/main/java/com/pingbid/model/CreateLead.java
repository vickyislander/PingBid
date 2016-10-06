package com.pingbid.model;

/**
 * Created by vignesh on 9/22/2016.
 */


public class CreateLead {

    private final String client_ip;
    private final int loan_amount;
    private final String first_name;
    private final String last_name;
    private final String email;
    private final String ssn;
    private final String date_of_birth;
    private final String address1;
    private final String city;
    private final String zip;
    private final String state;
    private final String country_code;
    private final String phone_home;
    private final String phone_work;
    private final String is_military;
    private final String drivers_license_state;
    private final String drivers_license_number;
    private final String own_home;
    private final int months_at_address;
    private final String income_type;
    private final String job_title;
    private final String pay_per_period;
    private final int monthly_income;
    private final String pay_frequency;
    private final String pay_day1;
    private final String pay_day2;
    private final String employer_name;
    private final int months_employed;
    private final String bank;
    private final String bank_phone;
    private final int months_at_bank;
    private final String bank_account_type;
    private final String direct_deposit;
    private final String contact_time;
    private final String originating_url;
    private final String client_url;
    private final String user_agent;
    private final String is_live;
    private final String price;
    private final String buyin;
    private final String subid;
    private final String seller_group;
    private final String scorable;
    private final String LeadID;

    public CreateLead(String createLead) {

        this.client_ip= (createLead==null)?null:createLead.split("client_ip=")[1].split("&")[0];
        this.loan_amount=(createLead==null)?null:Integer.parseInt(createLead.split("loan_amount=")[1].split("&")[0]);
        this.first_name =(createLead==null)?null:createLead.split("first_name=")[1].split("&")[0];
        this.last_name=(createLead==null)?null:createLead.split("last_name=")[1].split("&")[0];
        this.email=(createLead==null)?null:createLead.split("email=")[1].split("&")[0];
        this.ssn=(createLead==null)?null:createLead.split("ssn=")[1].split("&")[0];
        this.date_of_birth=(createLead==null)?null:createLead.split("date_of_birth=")[1].split("&")[0];
        this.address1=(createLead==null)?null:createLead.split("address1=")[1].split("&")[0];
        this.city=(createLead==null)?null:createLead.split("city=")[1].split("&")[0];
        this.state=(createLead==null)?null:createLead.split("state=")[1].split("&")[0];
        this.zip=(createLead==null)?null:createLead.split("zip=")[1].split("&")[0];
        this.country_code=(createLead==null)?null:createLead.split("country_code=")[1].split("&")[0];
        this.phone_home=(createLead==null)?null:createLead.split("phone_home=")[1].split("&")[0];
        this.phone_work=(createLead==null)?null:createLead.split("phone_work=")[1].split("&")[0];
        this.is_military=(createLead==null)?null:createLead.split("is_military=")[1].split("&")[0];
        this.drivers_license_state=(createLead==null)?null:createLead.split("drivers_license_state=")[1].split("&")[0];
        this.drivers_license_number=(createLead==null)?null:createLead.split("drivers_license_number=")[1].split("&")[0];
        this.own_home=(createLead==null)?null:createLead.split("own_home=")[1].split("&")[0];
        this.months_at_address=(createLead==null)?null:Integer.parseInt(createLead.split("months_at_address=")[1].split("&")[0]);
        this.income_type=(createLead==null)?null:createLead.split("income_type=")[1].split("&")[0];
        this.job_title=(createLead==null)?null:createLead.split("job_title=")[1].split("&")[0];
        this.pay_per_period=(createLead==null)?null:createLead.split("pay_per_period=")[1].split("&")[0];
        this.monthly_income=(createLead==null)?null:Integer.parseInt(createLead.split("monthly_income=")[1].split("&")[0]);
        this.pay_frequency=(createLead==null)?null:createLead.split("pay_frequency=")[1].split("&")[0];
        this.pay_day1=(createLead==null)?null:createLead.split("pay_day1=")[1].split("&")[0];
        this.pay_day2=(createLead==null)?null:createLead.split("pay_day2=")[1].split("&")[0];
        this.employer_name=(createLead==null)?null:createLead.split("employer_name=")[1].split("&")[0];
        this.months_employed=(createLead==null)?null:Integer.parseInt(createLead.split("months_employed=")[1].split("&")[0]);
        this.bank=(createLead==null)?null:createLead.split("bank=")[1].split("&")[0];
        this.bank_phone=(createLead==null)?null:createLead.split("bank_phone=")[1].split("&")[0];
        this.months_at_bank=(createLead==null)?null:Integer.parseInt(createLead.split("months_at_bank=")[1].split("&")[0]);
        this.bank_account_type=(createLead==null)?null:createLead.split("bank_account_type=")[1].split("&")[0];
        this.direct_deposit=(createLead==null)?null:createLead.split("direct_deposit=")[1].split("&")[0];
        this.contact_time=(createLead==null)?null:createLead.split("contact_time=")[1].split("&")[0];
        this.originating_url=(createLead==null)?null:createLead.split("originating_url=")[1].split("&")[0];
        this.client_url=(createLead==null)?null:createLead.split("client_url=")[1].split("&")[0];
        this.user_agent=(createLead==null)?null:createLead.split("user_agent=")[1].split("&")[0];
        this.is_live=(createLead==null)?null:createLead.split("is_live=")[1].split("&")[0];
        this.price=(createLead==null)?null:createLead.split("price=")[1].split("&")[0];
        this.buyin=(createLead==null)?null:createLead.split("buyin=")[1].split("&")[0];
        this.subid=(createLead==null)?null:createLead.split("subid=")[1].split("&")[0];
        this.seller_group=(createLead==null)?null:createLead.split("seller_group=")[1].split("&")[0];
        this.scorable=(createLead==null)?null:createLead.split("scorable=")[1].split("&")[0];
        this.LeadID=(createLead==null)?null:createLead.split("LeadID=")[1].split("&")[0];

    }

    public String getClient_ip() {
        return client_ip;
    }

    public int getLoan_amount() {
        return loan_amount;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getSsn() {
        return ssn;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getAddress1() {
        return address1;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getPhone_home() {
        return phone_home;
    }

    public String getPhone_work() {
        return phone_work;
    }

    public String getIs_military() {
        return is_military;
    }

    public String getDrivers_license_state() {
        return drivers_license_state;
    }

    public String getDrivers_license_number() {
        return drivers_license_number;
    }

    public String getOwn_home() {
        return own_home;
    }

    public int getMonths_at_address() {
        return months_at_address;
    }

    public String getIncome_type() {
        return income_type;
    }

    public String getJob_title() {
        return job_title;
    }

    public String getPay_per_period() {
        return pay_per_period;
    }

    public int getMonthly_income() {
        return monthly_income;
    }

    public String getPay_frequency() {
        return pay_frequency;
    }

    public String getPay_day1() {
        return pay_day1;
    }

    public String getPay_day2() {
        return pay_day2;
    }

    public String getEmployer_name() {
        return employer_name;
    }

    public int getMonths_employed() {
        return months_employed;
    }

    public String getBank() {
        return bank;
    }

    public String getBank_phone() {
        return bank_phone;
    }

    public int getMonths_at_bank() {
        return months_at_bank;
    }

    public String getBank_account_type() {
        return bank_account_type;
    }

    public String getDirect_deposit() {
        return direct_deposit;
    }

    public String getContact_time() {
        return contact_time;
    }

    public String getOriginating_url() {
        return originating_url;
    }

    public String getClient_url() {
        return client_url;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public String getIs_live() {
        return is_live;
    }

    public String getPrice() {
        return price;
    }

    public String getBuyin() {
        return buyin;
    }

    public String getSubid() {
        return subid;
    }

    public String getSeller_group() {
        return seller_group;
    }

    public String getScorable() {
        return scorable;
    }

    public String getLeadID() {
        return LeadID;
    }
}