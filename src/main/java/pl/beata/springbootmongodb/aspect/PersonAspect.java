package pl.beata.springbootmongodb.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class PersonAspect {

    StopWatch stopWatch = new StopWatch();

    @Before("@annotation(PersonCounter)")
    private void startCounter() {
        System.out.println("Start StopWatch");
        stopWatch.start();
    }

    @After("@annotation(PersonCounter)")
    private void stopCounter() {
        stopWatch.stop();
        System.out.println("Time: " + stopWatch.getTotalTimeSeconds());
        System.out.println("Stop StopWatch");
    }
}
