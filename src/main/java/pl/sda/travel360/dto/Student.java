package pl.sda.travel360.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student {

    private String firstName;
    private String lastName;

    @Override
    public int hashCode() {
        return lastName.charAt(0);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student s = (Student) obj;
            return this.lastName != null && this.lastName.equals(s.lastName) &&
                    this.firstName != null && this.firstName.equals(s.firstName);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
