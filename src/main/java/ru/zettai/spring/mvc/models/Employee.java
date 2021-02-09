package ru.zettai.spring.mvc.models;

import ru.zettai.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 100, message = " Attention: name have to be in range of 2 - 100 symbols")
    private String name;

    @NotBlank(message = " Attention: surname is required field!")
    private String surName;

    @Min(value = 500, message = " Attention: in our company salary cannot been lower than 500.")
    @Max(value = 500002, message = " Attention: hold on! Even director don't take that much money!")
    private int salary;


    private String department;

    @NotBlank(message = " Attention: you have to choice type of car!")
    private String carBrand;

//    @NotBlank(message = " Attention: you have to choice at least one (native) language!")
    private String[] languages;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = " Attention: please use pattern xxx-xx-xx")
    private String phoneNumber;

    @CheckEmail
    private String email;

    private Map<String, String> departments;
    private Map<String, String> carBrands;

    private Map<String, String> languageList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW x5", "BMW");
        carBrands.put("Audi 6", "Audi");
        carBrands.put("Lada-Kalina", "Lada");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Russian", "RU");
        languageList.put("Deutch", "DE");
        languageList.put("Japan", "JP");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }
    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }


}
