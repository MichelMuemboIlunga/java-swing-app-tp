/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp_project_swing_term2;

/**
 *
 * @author MICHEL MUEMBO ILUNGA
 * Student number: 218303335
 */
public class Employee {
    private String title;
    private int employeeID;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeGender;
    private boolean isTeamMember;

    // constructor

    public Employee(String title, int employeeID, String employeeFirstName, String employeeLastName, String employeeGender, boolean isTeamMember) {
        this.title = title;
        this.employeeID = employeeID;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeGender = employeeGender;
        this.isTeamMember = isTeamMember;

    }

  // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public void setTeamMember(boolean teamMember) {
        isTeamMember = teamMember;
    }

    // getters


    public String getTitle() {
        return title;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public boolean isTeamMember() {
        return isTeamMember;
    }


    // to string

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", employeeID=" + employeeID +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", employeeGender='" + employeeGender + '\'' +
                ", isTeamMember=" + isTeamMember +
                '}';
    }


}

