package com.myfirstproject.RestAPI.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.Comparator;

@Entity
public class User implements Comparable<User>{
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private double salary;
    @Column
    private String occupation;

    public User(int id, String firstName, String lastName, double salary, String occupation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.occupation = occupation;
    }

    public User() {

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int compareTo(User obj) {

        if (this.firstName.compareTo(obj.firstName) == 0){
            return (int) (this.salary-obj.salary);
        }
        return this.firstName.compareTo(obj.firstName);
    }

    public static class OccupationComparator implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return o1.occupation.compareTo(o2.occupation);
        }
    }

    public static class SalaryComparator implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return (int) (o1.salary - o2.salary);
        }
    }
}
