package com.pingbid.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.Map;

/**
 * Created by vignesh on 9/22/2016.
 */

public class CreateLead {


    private final String client_ip;

    private final int loan_amount;

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

    private final String scorable;

    private final String seller_group;

    private final String first_name;

    private final String last_name;

    private final String email;

    private final String LeadID;

    private final Date transaction_time;

    private String status;

    private String message;


    public CreateLead(Map<String,String> createLead) {
        this.client_ip= createLead.get("client_ip");
        this.loan_amount=Integer.parseInt(createLead.get("loan_amount"));
        this.first_name =createLead.get("first_name");
        this.last_name=createLead.get("last_name");
        this.email=createLead.get("email");
        this.ssn=createLead.get("ssn");
        this.date_of_birth=createLead.get("date_of_birth");
        this.address1=createLead.get("address1");
        this.city=createLead.get("city");
        this.state=createLead.get("state");
        this.zip=createLead.get("zip");
        this.country_code=createLead.get("country_code");
        this.phone_home=createLead.get("phone_home");
        this.phone_work=createLead.get("phone_work");
        this.is_military=createLead.get("is_military");
        this.drivers_license_state=createLead.get("drivers_license_state");
        this.drivers_license_number=createLead.get("drivers_license_number");
        this.own_home=createLead.get("own_home");
        this.months_at_address=Integer.parseInt(createLead.get("months_at_address"));
        this.income_type=createLead.get("income_type");
        this.job_title=createLead.get("job_title");
        this.pay_per_period=createLead.get("pay_per_period");
        this.monthly_income=Integer.parseInt(createLead.get("monthly_income"));
        this.pay_frequency=createLead.get("pay_frequency");
        this.pay_day1=createLead.get("pay_day1");
        this.pay_day2=createLead.get("pay_day2");
        this.employer_name=createLead.get("employer_name");
        this.months_employed=Integer.parseInt(createLead.get("months_employed"));
        this.bank=createLead.get("bank");
        this.bank_phone=createLead.get("bank_phone");
        this.months_at_bank=Integer.parseInt(createLead.get("months_at_bank"));
        this.bank_account_type=createLead.get("bank_account_type");
        this.direct_deposit=createLead.get("direct_deposit");
        this.contact_time=createLead.get("contact_time");
        this.originating_url=createLead.get("originating_url");
        this.client_url=createLead.get("client_url");
        this.user_agent=createLead.get("user_agent");
        this.is_live=createLead.get("is_live");
        this.price=createLead.get("price");
        this.buyin=createLead.get("buyin");
        this.subid=createLead.get("subid");
        this.seller_group=createLead.get("seller_group");
        this.scorable=createLead.get("scorable");
        this.LeadID=createLead.get("LeadID");
        this.transaction_time=new Date();
        this.status="Rejected";
        this.message="Error, problem with data fields";
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

    public Date getTransaction_time() {
        return transaction_time;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "CreateLead{" +
                "client_ip='" + client_ip + '\'' +
                ", loan_amount=" + loan_amount +
                ", ssn='" + ssn + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", address1='" + address1 + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                ", country_code='" + country_code + '\'' +
                ", phone_home='" + phone_home + '\'' +
                ", phone_work='" + phone_work + '\'' +
                ", is_military='" + is_military + '\'' +
                ", drivers_license_state='" + drivers_license_state + '\'' +
                ", drivers_license_number='" + drivers_license_number + '\'' +
                ", own_home='" + own_home + '\'' +
                ", months_at_address=" + months_at_address +
                ", income_type='" + income_type + '\'' +
                ", job_title='" + job_title + '\'' +
                ", pay_per_period='" + pay_per_period + '\'' +
                ", monthly_income=" + monthly_income +
                ", pay_frequency='" + pay_frequency + '\'' +
                ", pay_day1='" + pay_day1 + '\'' +
                ", pay_day2='" + pay_day2 + '\'' +
                ", employer_name='" + employer_name + '\'' +
                ", months_employed=" + months_employed +
                ", bank='" + bank + '\'' +
                ", bank_phone='" + bank_phone + '\'' +
                ", months_at_bank=" + months_at_bank +
                ", bank_account_type='" + bank_account_type + '\'' +
                ", direct_deposit='" + direct_deposit + '\'' +
                ", contact_time='" + contact_time + '\'' +
                ", originating_url='" + originating_url + '\'' +
                ", client_url='" + client_url + '\'' +
                ", user_agent='" + user_agent + '\'' +
                ", is_live='" + is_live + '\'' +
                ", price='" + price + '\'' +
                ", buyin='" + buyin + '\'' +
                ", subid='" + subid + '\'' +
                ", scorable='" + scorable + '\'' +
                ", seller_group='" + seller_group + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", LeadID='" + LeadID + '\'' +
                ", transaction_time=" + transaction_time +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}