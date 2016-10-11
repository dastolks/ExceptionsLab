package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
    //validation rules:
    //daysVacation must be between 0 and 120 inclusive
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException{
        if(daysVacation <0 || daysVacation > MAX_VACATION_DAYS){
            throw new IllegalArgumentException("Vacation days must be between 0 and 120 inclusive");
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) throws IllegalArgumentException {
        if(firstName == null || firstName == "" || firstName.trim().length() == 0){
            throw new IllegalArgumentException("The first name is blank!");
        }
        else{
            if(firstName.length() > 50){
                firstName = firstName.substring(0,50);
            }
            this.firstName = firstName;
        }       
    }

    public String getLastName() {
        return lastName;
    }

    //vadlidation rules:
    // no null
    // no empty values
    // max size 50 characters
    // not only spaces, no starting with a space
    // may contain any value in case of some crazy person named copyright symbol
    //
    public void setLastName(String lastName) throws IllegalArgumentException {
        if(lastName == null || lastName == "" || lastName.trim().length() == 0){
            throw new IllegalArgumentException("The last name is blank!");
        }
        else{
            if(lastName.length() > 50){
                lastName = lastName.substring(0,50);
            }
            this.lastName = lastName;
        }
    }

    public final String getSsn() {
        return ssn;
    }
    //validation rules:
    //only numbers and hypens
    //format in a AAA-GG-SSSS way
    //can't have a length greater than that.
    //no doubles!
    public void setSsn(String ssn) {
        if(ssn.matches("\\d\\d\\d\\-\\d\\d\\-\\d\\d\\d\\d")){
            this.ssn = ssn;
        }
        else{
            throw new IllegalArgumentException("SSN doesn't follow format!");
        }
    }
    
    
    
}
