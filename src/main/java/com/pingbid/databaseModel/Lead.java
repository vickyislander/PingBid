package com.pingbid.databaseModel;

import javax.persistence.*;

/**
 * Created by rvignesh on 9/29/2016.
 */

@Entity
@Table(name = "lead",schema="testify")
public class Lead {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "LeadID")
    private String leadID;
    @Column(name = "vendor_leadid")
    private String vendorLeadid;
    @Column(name = "Campaign")
    private String campaign;
    @Column(name = "promo_id")
    private int promoId;
    @Column(name = "subpromo_id")
    private String subpromoId;
    @Column(name = "subid")
    private String subId;
    @Column(name = "buyin")
    private int buyIn;
    @Column(name = "scorable")
    private int scorable;
    @Column(name = "status")
    private String status;
    @Column(name = "emailed")
    private int emailed;
    @Column(name = "email_resp")
    private String email_resp;
    @Column(name = "message")
    private String message;
    @Column(name = "price")
    private double price;
    @Column(name = "scored_price")
    private double scoredPrice;
    @Column(name = "price_column")
    private String priceColumn;
    @Column(name = "table_version")
    private int tableVersion;
    @Column(name = "prepull_score")
    private int prepullScore;
    @Column(name = "prepull_score_cutoff")
    private int prepullScoreCutoff;
    @Column(name = "conversion_score")
    private int conversionScore;
    @Column(name = "modelscoreV1")
    private int modelscoreV1;
    @Column(name = "v1_tier")
    private int v1Tier;
    @Column(name = "vantage_score")
    private int vantageScore;
    @Column(name = "vantage_tier")
    private int vantageTier;
    @Column(name = "bidtable")
    private String bidTable;
    @Column(name = "strategy")
    private String strategy;
    @Column(name = "client_ip")
    private String clientIp;
    @Column(name = "loan_amount")
    private int loanAmount;
    @Column(name = "gender")
    private String gender;
    @Column(name = "salutation")
    private String salutation;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "alternate_email")
    private String alternateEmail;
    @Column(name = "ssn")
    private int ssn;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private int zip;
    @Column(name = "country_code")
    private String countryCode;
    @Column(name = "phone_home")
    private long phoneHome;
    @Column(name = "phone_work")
    private long phoneWork;
    @Column(name = "phone_work_extension")
    private long phoneWorkExtension;
    @Column(name = "mobile")
    private long mobile;
    @Column(name = "fax")
    private long fax;
    @Column(name = "is_military")
    private int isMilitary;
    @Column(name = "drivers_license_state")
    private String driversLicenseState;
    @Column(name = "own_home")
    private String ownHome;
    @Column(name = "months_at_address")
    private int monthsAtAddress;
    @Column(name = "monthly_residence_cost")
    private int monthlyResidenceCost;
    @Column(name = "income_type")
    private String incomeType;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "pay_per_period")
    private int payPerPeriod;
    @Column(name = "monthly_income")
    private int monthlyIncome;
    @Column(name = "pay_frequency")
    private String payFrequency;
    @Column(name = "pay_day1")
    private String payDay1;
    @Column(name = "pay_day2")
    private String payDay2;
    @Column(name = "employer_name")
    private String employerName;
    @Column(name = "employer_address")
    private String employerAddress;
    @Column(name = "employer_city")
    private String employerCity;
    @Column(name = "employer_state")
    private String employerState;
    @Column(name = "employer_zip")
    private String employerZip;
    @Column(name = "months_employed")
    private int monthsEmployed;
    @Column(name = "supervisor_name")
    private String supervisorName;
    @Column(name = "supervisor_phone_ext")
    private String supervisorPhoneExt;
    @Column(name = "bank")
    private String bank;
    @Column(name = "bank_phone")
    private long bankPhone;
    @Column(name = "months_at_bank")
    private String monthsAtBank;
    @Column(name = "bank_routing_number")
    private long bankRoutingNumber;
    @Column(name = "bank_account_number")
    private long bankAccountNumber;
    @Column(name = "bank_account_type")
    private String bankAccountType;
    @Column(name = "direct_deposit")
    private int directDeposit;
    @Column(name = "referer_first_name1")
    private String refererFirstName1;
    @Column(name = "referer_last_name1")
    private String refererLastName1;
    @Column(name = "referer_phone1")
    private String refererPhone1;
    @Column(name = "referer_relation1")
    private String refererRelation1;
    @Column(name = "referer_first_name2")
    private String refererFirstName2;
    @Column(name = "referer_last_name2")
    private String refererLastName2;
    @Column(name = "referer_phone2")
    private String refererPhone2;
    @Column(name = "referer_relation2")
    private String refererRelation2;
    @Column(name = "referer_first_name3")
    private String refererFirstName3;
    @Column(name = "referer_last_name3")
    private String refererLastName3;
    @Column(name = "referer_phone3")
    private String refererPhone3;
    @Column(name = "referer_relation3")
    private String refererRelation3;
    @Column(name = "contact_time")
    private int contactTime;
    @Column(name = "sms_optin")
    private String smsOptin;
    @Column(name = "originating_url")
    private String originatingUrl;
    @Column(name = "client_url")
    private String clientUrl;
    @Column(name = "user_agent")
    private String userAgent;
    @Column(name = "is_live")
    private int isLive;
    @Column(name = "seller_group")
    private int sellerGroup;
    @Column(name = "create_time")
    private String createTime;
    @Column(name = "update_time")
    private String updateTime;
    @Column(name = "transaction_time")
    private String transactionTime;
    @Column(name = "redirect_url")
    private String redirectUrl;
    @Column(name = "softpull")
    private String softpull;
    @Column(name = "rawdata")
    private String rawdata;

    protected Lead(){}

    public String getLeadID() {
        return leadID;
    }

    public void setLeadID(String leadID) {
        this.leadID = leadID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVendorLeadid() {
        return vendorLeadid;
    }

    public void setVendorLeadid(String vendorLeadid) {
        this.vendorLeadid = vendorLeadid;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public int getPromoId() {
        return promoId;
    }

    public void setPromoId(int promoId) {
        this.promoId = promoId;
    }

    public String getSubpromoId() {
        return subpromoId;
    }

    public void setSubpromoId(String subpromoId) {
        this.subpromoId = subpromoId;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public int getBuyIn() {
        return buyIn;
    }

    public void setBuyIn(int buyIn) {
        this.buyIn = buyIn;
    }

    public int getScorable() {
        return scorable;
    }

    public void setScorable(int scorable) {
        this.scorable = scorable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEmailed() {
        return emailed;
    }

    public void setEmailed(int emailed) {
        this.emailed = emailed;
    }

    public String getEmail_resp() {
        return email_resp;
    }

    public void setEmail_resp(String email_resp) {
        this.email_resp = email_resp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScoredPrice() {
        return scoredPrice;
    }

    public void setScoredPrice(double scoredPrice) {
        this.scoredPrice = scoredPrice;
    }

    public String getPriceColumn() {
        return priceColumn;
    }

    public void setPriceColumn(String priceColumn) {
        this.priceColumn = priceColumn;
    }

    public int getTableVersion() {
        return tableVersion;
    }

    public void setTableVersion(int tableVersion) {
        this.tableVersion = tableVersion;
    }

    public int getPrepullScore() {
        return prepullScore;
    }

    public void setPrepullScore(int prepullScore) {
        this.prepullScore = prepullScore;
    }

    public int getPrepullScoreCutoff() {
        return prepullScoreCutoff;
    }

    public void setPrepullScoreCutoff(int prepullScoreCutoff) {
        this.prepullScoreCutoff = prepullScoreCutoff;
    }

    public int getConversionScore() {
        return conversionScore;
    }

    public void setConversionScore(int conversionScore) {
        this.conversionScore = conversionScore;
    }

    public int getModelscoreV1() {
        return modelscoreV1;
    }

    public void setModelscoreV1(int modelscoreV1) {
        this.modelscoreV1 = modelscoreV1;
    }

    public int getV1Tier() {
        return v1Tier;
    }

    public void setV1Tier(int v1Tier) {
        this.v1Tier = v1Tier;
    }

    public int getVantageScore() {
        return vantageScore;
    }

    public void setVantageScore(int vantageScore) {
        this.vantageScore = vantageScore;
    }

    public int getVantageTier() {
        return vantageTier;
    }

    public void setVantageTier(int vantageTier) {
        this.vantageTier = vantageTier;
    }

    public String getBidTable() {
        return bidTable;
    }

    public void setBidTable(String bidTable) {
        this.bidTable = bidTable;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public long getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(long phoneHome) {
        this.phoneHome = phoneHome;
    }

    public long getPhoneWork() {
        return phoneWork;
    }

    public void setPhoneWork(long phoneWork) {
        this.phoneWork = phoneWork;
    }

    public long getPhoneWorkExtension() {
        return phoneWorkExtension;
    }

    public void setPhoneWorkExtension(long phoneWorkExtension) {
        this.phoneWorkExtension = phoneWorkExtension;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public long getFax() {
        return fax;
    }

    public void setFax(long fax) {
        this.fax = fax;
    }

    public int getIsMilitary() {
        return isMilitary;
    }

    public void setIsMilitary(int isMilitary) {
        this.isMilitary = isMilitary;
    }

    public String getDriversLicenseState() {
        return driversLicenseState;
    }

    public void setDriversLicenseState(String driversLicenseState) {
        this.driversLicenseState = driversLicenseState;
    }

    public String getOwnHome() {
        return ownHome;
    }

    public void setOwnHome(String ownHome) {
        this.ownHome = ownHome;
    }

    public int getMonthsAtAddress() {
        return monthsAtAddress;
    }

    public void setMonthsAtAddress(int monthsAtAddress) {
        this.monthsAtAddress = monthsAtAddress;
    }

    public int getMonthlyResidenceCost() {
        return monthlyResidenceCost;
    }

    public void setMonthlyResidenceCost(int monthlyResidenceCost) {
        this.monthlyResidenceCost = monthlyResidenceCost;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getPayPerPeriod() {
        return payPerPeriod;
    }

    public void setPayPerPeriod(int payPerPeriod) {
        this.payPerPeriod = payPerPeriod;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getPayFrequency() {
        return payFrequency;
    }

    public void setPayFrequency(String payFrequency) {
        this.payFrequency = payFrequency;
    }

    public String getPayDay1() {
        return payDay1;
    }

    public void setPayDay1(String payDay1) {
        this.payDay1 = payDay1;
    }

    public String getPayDay2() {
        return payDay2;
    }

    public void setPayDay2(String payDay2) {
        this.payDay2 = payDay2;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }

    public String getEmployerCity() {
        return employerCity;
    }

    public void setEmployerCity(String employerCity) {
        this.employerCity = employerCity;
    }

    public String getEmployerState() {
        return employerState;
    }

    public void setEmployerState(String employerState) {
        this.employerState = employerState;
    }

    public String getEmployerZip() {
        return employerZip;
    }

    public void setEmployerZip(String employerZip) {
        this.employerZip = employerZip;
    }

    public int getMonthsEmployed() {
        return monthsEmployed;
    }

    public void setMonthsEmployed(int monthsEmployed) {
        this.monthsEmployed = monthsEmployed;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String getSupervisorPhoneExt() {
        return supervisorPhoneExt;
    }

    public void setSupervisorPhoneExt(String supervisorPhoneExt) {
        this.supervisorPhoneExt = supervisorPhoneExt;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public long getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(long bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getMonthsAtBank() {
        return monthsAtBank;
    }

    public void setMonthsAtBank(String monthsAtBank) {
        this.monthsAtBank = monthsAtBank;
    }

    public long getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    public void setBankRoutingNumber(long bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public int getDirectDeposit() {
        return directDeposit;
    }

    public void setDirectDeposit(int directDeposit) {
        this.directDeposit = directDeposit;
    }

    public String getRefererFirstName1() {
        return refererFirstName1;
    }

    public void setRefererFirstName1(String refererFirstName1) {
        this.refererFirstName1 = refererFirstName1;
    }

    public String getRefererLastName1() {
        return refererLastName1;
    }

    public void setRefererLastName1(String refererLastName1) {
        this.refererLastName1 = refererLastName1;
    }

    public String getRefererPhone1() {
        return refererPhone1;
    }

    public void setRefererPhone1(String refererPhone1) {
        this.refererPhone1 = refererPhone1;
    }

    public String getRefererRelation1() {
        return refererRelation1;
    }

    public void setRefererRelation1(String refererRelation1) {
        this.refererRelation1 = refererRelation1;
    }

    public String getRefererFirstName2() {
        return refererFirstName2;
    }

    public void setRefererFirstName2(String refererFirstName2) {
        this.refererFirstName2 = refererFirstName2;
    }

    public String getRefererLastName2() {
        return refererLastName2;
    }

    public void setRefererLastName2(String refererLastName2) {
        this.refererLastName2 = refererLastName2;
    }

    public String getRefererPhone2() {
        return refererPhone2;
    }

    public void setRefererPhone2(String refererPhone2) {
        this.refererPhone2 = refererPhone2;
    }

    public String getRefererRelation2() {
        return refererRelation2;
    }

    public void setRefererRelation2(String refererRelation2) {
        this.refererRelation2 = refererRelation2;
    }

    public String getRefererFirstName3() {
        return refererFirstName3;
    }

    public void setRefererFirstName3(String refererFirstName3) {
        this.refererFirstName3 = refererFirstName3;
    }

    public String getRefererLastName3() {
        return refererLastName3;
    }

    public void setRefererLastName3(String refererLastName3) {
        this.refererLastName3 = refererLastName3;
    }

    public String getRefererPhone3() {
        return refererPhone3;
    }

    public void setRefererPhone3(String refererPhone3) {
        this.refererPhone3 = refererPhone3;
    }

    public String getRefererRelation3() {
        return refererRelation3;
    }

    public void setRefererRelation3(String refererRelation3) {
        this.refererRelation3 = refererRelation3;
    }

    public int getContactTime() {
        return contactTime;
    }

    public void setContactTime(int contactTime) {
        this.contactTime = contactTime;
    }

    public String getSmsOptin() {
        return smsOptin;
    }

    public void setSmsOptin(String smsOptin) {
        this.smsOptin = smsOptin;
    }

    public String getOriginatingUrl() {
        return originatingUrl;
    }

    public void setOriginatingUrl(String originatingUrl) {
        this.originatingUrl = originatingUrl;
    }

    public String getClientUrl() {
        return clientUrl;
    }

    public void setClientUrl(String clientUrl) {
        this.clientUrl = clientUrl;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public int getIsLive() {
        return isLive;
    }

    public void setIsLive(int isLive) {
        this.isLive = isLive;
    }

    public int getSellerGroup() {
        return sellerGroup;
    }

    public void setSellerGroup(int sellerGroup) {
        this.sellerGroup = sellerGroup;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getSoftpull() {
        return softpull;
    }

    public void setSoftpull(String softpull) {
        this.softpull = softpull;
    }

    public String getRawdata() {
        return rawdata;
    }

    public void setRawdata(String rawdata) {
        this.rawdata = rawdata;
    }
}
