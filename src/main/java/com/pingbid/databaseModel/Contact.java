package com.pingbid.databaseModel;

import javax.persistence.*;

/**
 * Created by rvignesh on 9/28/2016.
 */

@Entity
@Table(name = "contacts",schema="testify")
public class Contact {

    public Contact(String contactID, String firstName, String lastName,
                   String middleName, String suffix, String address,
                   String city, String state, String zipcode, String email,
                   String birthDate, long phone, String ssn, String password, String military,
                   String createDateTime, String updateDateTime, String id, String lead_id,
                   long secondaryPhone, long phoneType1, long phoneType2) {

       // this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.suffix = suffix;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.email = email;
        this.birthDate = birthDate;
        this.phone = phone;
        this.ssn = ssn;
        this.password = password;
        this.military = military;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
        this.id = id;
        this.lead_id = lead_id;
        this.secondaryPhone = secondaryPhone;
        this.phoneType1 = phoneType1;
        this.phoneType2 = phoneType2;

    }

    protected Contact(){}

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ContactID")
    private int contactID;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "middleName")
    private String middleName;
    @Column(name = "suffix")
    private String suffix;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "State")
    private String state;
    @Column(name = "Zipcode")
    private String zipcode;
    @Column(name = "Email")
    private String email;
    @Column(name = "BirthDate")
    private String birthDate;
    @Column(name = "Phone")
    private long phone;
    @Column(name = "SSN",length=10)
    private String ssn;
    @Column(name = "Password")
    private String password;
    @Column(name = "Military")
    private String military;
    @Column(name = "CreateDateTime")
    private String createDateTime;
    @Column(name = "UpdateDateTime")
    private String updateDateTime;
    @Column(name = "id")
    private String id;
    @Column(name = "lead_id")
    private String lead_id;
    @Column(name = "secondaryPhone")
    private long secondaryPhone;
    @Column(name = "phoneType1")
    private long phoneType1;
    @Column(name = "phoneType2")
    private long phoneType2;

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMilitary() {
        return military;
    }

    public void setMilitary(String military) {
        this.military = military;
    }

    public String getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLead_id() {
        return lead_id;
    }

    public void setLead_id(String lead_id) {
        this.lead_id = lead_id;
    }

    public long getSecondaryPhone() {
        return secondaryPhone;
    }

    public void setSecondaryPhone(long secondaryPhone) {
        this.secondaryPhone = secondaryPhone;
    }

    public long getPhoneType1() {
        return phoneType1;
    }

    public void setPhoneType1(long phoneType1) {
        this.phoneType1 = phoneType1;
    }

    public long getPhoneType2() {
        return phoneType2;
    }

    public void setPhoneType2(long phoneType2) {
        this.phoneType2 = phoneType2;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactID=" + contactID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", suffix='" + suffix + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone=" + phone +
                ", ssn='" + ssn + '\'' +
                ", password='" + password + '\'' +
                ", military='" + military + '\'' +
                ", createDateTime='" + createDateTime + '\'' +
                ", updateDateTime='" + updateDateTime + '\'' +
                ", id='" + id + '\'' +
                ", lead_id='" + lead_id + '\'' +
                ", secondaryPhone=" + secondaryPhone +
                ", phoneType1=" + phoneType1 +
                ", phoneType2=" + phoneType2 +
                '}';
    }
}
