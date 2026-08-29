package com.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testUpdateGrade() {
        // 1. ARRANGE: Set up the world. Create a student with an initial grade.
        Student student = new Student("Limpo", 85);

        // 2. ACT: Perform the action we are testing. Update the grade to 95.
        student.updateGrade(95);

        // 3. ASSERT: Check that the grade was actually updated.
        // Expected: 95, Actual: student.getGrade()
        assertEquals(95, student.getGrade(), "Grade should be updated to 95");
    }

    @Test
    void testInvalidGradeIsRejected() {
        // 1. ARRANGE: Create a student with a starting grade of 70.
        Student student = new Student("BugHunter", 70);

        // 2. ACT: Try to set an INVALID grade (105, which is > 100).
        student.updateGrade(105);

        // 3. ASSERT: The grade should STILL be 70 (rejected the invalid update).
        assertEquals(70, student.getGrade(), "Invalid grade 105 should be rejected. Grade should remain 70.");
    }
}
