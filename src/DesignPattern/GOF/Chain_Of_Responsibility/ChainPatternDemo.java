/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.GOF.Chain_Of_Responsibility;

/**
 *
 * @author fa20-bse-031
 */
public class ChainPatternDemo {
	
   private static AbstractLogger getChainOfLoggers(){




      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
      AbstractLogger databaseLogger = new Database(AbstractLogger.warning);
      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);
      consoleLogger.setNextLogger(databaseLogger);
      

      return errorLogger;	
   }
   private static AbstractLogger getOnceChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
      AbstractLogger databaseLogger = new Database(AbstractLogger.warning);
      errorLogger.setNextLogger(consoleLogger);
      consoleLogger.setNextLogger(databaseLogger);
      

      return errorLogger;	
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();
      AbstractLogger loggerChain2= getOnceChainOfLoggers();
//      loggerChain.logMessage(AbstractLogger.INFO, 
//         "This is an information.");
//
//      loggerChain.logMessage(AbstractLogger.DEBUG, 
//         "This is an debug level information.");
//
//      loggerChain.logMessage(AbstractLogger.ERROR, 
//         "This is an error information.");
      
      
    loggerChain2.logOnceMessage(AbstractLogger.DEBUG
            , "This is an debug level information from chain 2.");
   }
}
