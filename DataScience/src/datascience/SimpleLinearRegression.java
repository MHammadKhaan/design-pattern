/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datascience;

/**
 *
 * @author Hafiz laptop
 */
public class SimpleLinearRegression {

    /**
     * @param args the command line arguments
     */

public class SimpleLinearRegression {

    private static final String DATA_FILE_PATH = "regression_data.csv";

    public static void main(String[] args) {
        double[] inputValues = new double[50];
        double[] outputValues = new double[50];

        System.out.println("Input Output");
        for (var i = 0; i < 50; i++) {
            inputValues[i] = i + 1;
            outputValues[i] = (i + 1) + 3;
            System.out.println(inputValues[i] + " " + outputValues[i]);
        }

        double slope = 0;
        double intercept = 0;

        double learningRate = 0.001;
        int maxIterations = 1000;

        for (int i = 0; i < maxIterations; i++) {
            double[] predictions = makePredictions(inputValues, slope, intercept);
            double cost = calculateCost(outputValues, predictions);
            System.out.println("SLOPE = " + slope + " INTERCEPT = " + intercept + " COST = " + cost);

            double threshold = 0.1;
            if (cost < threshold) {
                break;
            }

            double[] gradients = calculateGradients(inputValues, outputValues, predictions);
            slope -= learningRate * gradients[0];
            intercept -= learningRate * gradients[1];
        }

        System.out.println("Final Slope: " + slope);
        System.out.println("Final Intercept: " + intercept);

        double xValueToPredict = 3;
        double predictedOutput = predictSingleValue(xValueToPredict, slope, intercept);
        System.out.println("Predicted value for x=" + xValueToPredict + ": " + predictedOutput);
    }

    private static double[] makePredictions(double[] inputValues, double slope, double intercept) {
        double[] predictions = new double[inputValues.length];
        for (int i = 0; i < inputValues.length; i++) {
            predictions[i] = slope * inputValues[i] + intercept;
        }
        return predictions;
    }

    private static double predictSingleValue(double x, double slope, double intercept) {
        return slope * x + intercept;
    }

    private static double calculateCost(double[] actualValues, double[] predictedValues) {
        double sum = 0;
        for (int i = 0; i < actualValues.length; i++) {
            double error = predictedValues[i] - actualValues[i];
            sum += Math.pow(error, 2);
        }
        return sum / (2 * actualValues.length);
    }

    private static double[] calculateGradients(double[] inputValues, double[] actualValues, double[] predictedValues) {
        double[] gradients = new double[2];
        for (int i = 0; i < actualValues.length; i++) {
            gradients[0] += (predictedValues[i] - actualValues[i]) * inputValues[i];
            gradients[1] += predictedValues[i] - actualValues[i];
        }
        gradients[0] /= actualValues.length;
        gradients[1] /= actualValues.length;
        return gradients;
    }
}

    }
    
