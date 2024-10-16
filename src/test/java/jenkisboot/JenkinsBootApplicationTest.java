package jenkisboot;

import com.jenkisboot.JenkinsBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsBootApplicationTest {
    public static Logger logger= LoggerFactory.getLogger(JenkinsBootApplication.class);

    @Test
    public void contextLoads(){
        logger.info("Testcase executing...");
        assertEquals(true,true);
    }

}