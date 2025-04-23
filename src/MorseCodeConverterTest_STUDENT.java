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

import java.io.File;

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
    	assertEquals("have a nice day", converter2);    
    }

    @Test
    public void testHowDoILoveTheeFile() {
    	File file = new File("C:\\howDoILoveThee.txt");
    	try {
    		String converter = MorseCodeConverter.convertToEnglish(file);
        	assertEquals("how do i love thee let me count the ways", converter);
    	} catch (Exception e) {
    	}
    }

    @Test
    public void testDaisyFile() {
    	File file = new File("C:\\Daisy.txt");
    	try {
    		String converter = MorseCodeConverter.convertToEnglish(file);
        	assertEquals("give me your answer do", converter);
    	} catch (Exception e) {
    	}    }

    @Test
    public void testDaisyDaisyFile() {
    	File file = new File("C:\\DaisyDaisy.txt");
    	try {
    		String converter = MorseCodeConverter.convertToEnglish(file);
        	assertEquals("im half crazy all for the love of you", converter);
    	} catch (Exception e) {
    	}    }

    @Test
    public void testLoveLooksNotFile() {
    	File file = new File("C:\\LoveLooksNot.txt");
    	try {
    		String converter = MorseCodeConverter.convertToEnglish(file);
        	assertEquals("love looks not with the eyes but with the mind", converter);
    	} catch (Exception e) {
    	}
    }

    @Test
    public void testStudentFiles() {
    	File file = new File("C:\\StudentFile.txt");
    	try {
    		String converter = MorseCodeConverter.convertToEnglish(file);
        	assertEquals("have a nice day sos hello world mc cmsc", converter);
    	} catch (Exception e) {
    	}    }

}
