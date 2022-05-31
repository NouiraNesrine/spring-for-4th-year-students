package org.intellij.myspring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class CalculatorLogger{

    private Logger logger = Logger.getLogger(CalculatorConfiguration.class.getName());

    @Before("execution(* Calculator.multiplication(..))")
    public void logBefore(){
        logger.info("before multiplication methode advice");
    }

    @After("execution(* Calculator.addition(..))")
    public void logAfter(){
        logger.info("After addition methode advice");
    }

    @AfterReturning(pointcut = "execution(* Calculator.substruction(..))",returning = "result")
    public void logAfterReturning(Object result){
        logger.info("After substruction methode advice");
        logger.info("After substruction :" +result) ;
    }
    @Before("execution(* Calculator.addition(..))")
    public void joinPointInfo(JoinPoint joinPoint){
        logger.info("After addition methode joinPoint");
        logger.info("Kind :" +joinPoint.getKind());
        logger.info("Signature :" +joinPoint.getSignature());
        logger.info("type :" +joinPoint.getSignature().getDeclaringTypeName());
        logger.info("arguments :" +joinPoint.getArgs());
        logger.info("target :" +joinPoint.getTarget());
        logger.info("proxy :" +joinPoint.getThis());
    }

    @Around("execution(* Calculator.multiplication(..))")
    public Object joinPointAroundInfo(ProceedingJoinPoint joinPoint){
        logger.info("After addition methode joinPoint");
        logger.info("Kind :" +joinPoint.getKind());
        logger.info("Signature :" +joinPoint.getSignature());
        logger.info("type :" +joinPoint.getSignature().getDeclaringTypeName());
        logger.info("arguments :" + Arrays.toString(joinPoint.getArgs()) );
        logger.info("target :" +joinPoint.getTarget());
        logger.info("proxy :" +joinPoint.getThis());
        try {
            joinPoint.proceed(new Object[]{5.1,9.2});
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return 0.0;
    }

}
