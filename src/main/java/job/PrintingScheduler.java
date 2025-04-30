package job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class PrintingScheduler {

    private final Log logger = LogFactory.getLog(getClass());

    public void displayMessage(){
        logger.info("Scheduler starting at :::::::::::" + System.currentTimeMillis());
        logger.info("This api is working as a demo scheduler .....");

    }

}
