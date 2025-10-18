package arpa.home.nustudy.session;

import arpa.home.nustudy.course.Course;
import arpa.home.nustudy.exceptions.NUStudyException;
import arpa.home.nustudy.utils.DataParser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SessionTest {
    @Test
    void testStringStorageConversion() {
        Course course = new Course("CS2113");
        Session session = new Session(course, 5);
        assertEquals("S|CS2113|5", session.toStorageString());
    }

    @Test
    void testStorageStringConversion() throws NUStudyException {
        String storedCourseName = "S|CS2113|5";
        Session session = DataParser.parseSession(storedCourseName);
        assertEquals("CS2113", session.getCourse().getCourseName());
        assertEquals(5, session.getLoggedHours());
    }
}
