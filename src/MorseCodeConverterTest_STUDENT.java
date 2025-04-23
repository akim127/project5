/*
 * Alexander Jaemin Kim
 * Professor Eivazi
 * CMSC 204-32453
 * Due Date: 4/22/25
 * Class: MorseCodeConverterTest_STUDENT
 */

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MorseCodeConverterTest_STUDENT {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testConvertToEnglish() {
    	String converter1 = MorseCodeConverter.convertToEnglish("-- -.-. / -.-. -- ... -.-.");
    	String converter2 = MorseCodeConverter.convertToEnglish(".... .- ...- . / .- / -. .. -.-. . / -.. .- -.--");
    	assertEquals("mc cmsc", converter1);
    	assertEquals("have a nice day", converter2);    }

    @Test
    public void testHowDoILoveTheeFile() {
	fail("Not yet implemented");
    }

    @Test
    public void testDaisyFile() {
	fail("Not yet implemented");
    }

    @Test
    public void testDaisyDaisyFile() {
	fail("Not yet implemented");
    }

    @Test
    public void testLoveLooksNotFile() {
	fail("Not yet implemented");
    }

    @Test
    public void testStudentFiles() {
	fail("Not yet implemented");
    }

}
