package pl.sda.travel360.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void fofo() {
        Student s1 = new Student("Mateusz", "Ryndak");
        Student s2 = new Student("Tomasz", "Nowak");

        System.out.println(s1 + " hashCode = " + s1.hashCode());
        System.out.println(s2 + " hashCode = " + s2.hashCode());

        assertEquals(s1.hashCode(), s2.hashCode());


    }

}