package neo.javautils;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * EncryptHelper Tester.
 *
 * @author neopeng
 * @version 1.0
 * @since <pre>08/25/2015</pre>
 */
public class EncryptHelperTest extends TestCase {
    public EncryptHelperTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Method: md5(String s)
     */
    public void testMd5() throws Exception {
        Assert.assertEquals("21232f297a57a5a743894a0e4a801fc3", EncryptHelper.md5("admin"));
    }


    public static Test suite() {
        return new TestSuite(EncryptHelperTest.class);
    }
} 
