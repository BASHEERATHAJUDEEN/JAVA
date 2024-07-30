package com.example.trafficsignal;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloApplication extends Application {

    // Constants
    private static final int TOTAL_CYCLE_TIME = 120; // Total cycle time in seconds
    private static final int YELLOW_TIME = 5;       // Standard yellow time in seconds

    @Override
    public void start(Stage primaryStage) {
        // Example input data for traffic signal optimization
        int[] queueLengths = {150, 120, 200, 180}; // Queue lengths for Northbound, Southbound, Eastbound, Westbound
        int totalVehicles = 650; // Total number of vehicles across all lanes
        double peakHourAdjustmentFactor = 1.2; // Adjust for peak hours (1.2 for peak hours, 1.0 otherwise)

        // Compute optimized timings
        int[] greenTimes = computeGreenTimes(queueLengths, totalVehicles, peakHourAdjustmentFactor);
        int[] redTimes = computeRedTimes(greenTimes);

        // Adjust green times based on the total cycle time
        int[] adjustedGreenTimes = adjustGreenTimesForCycleTime(greenTimes);

        // Get timings for Lane 1
        int lane1GreenTime = adjustedGreenTimes[0];
        int lane1RedTime = redTimes[0];

        // Create the traffic light circles
        Circle redLight = new Circle(50, Color.RED);
        Circle yellowLight = new Circle(50, Color.GRAY);
        Circle greenLight = new Circle(50, Color.GRAY);

        // Arrange the circles in a vertical layout
        VBox root = new VBox(10);
        root.getChildren().addAll(redLight, yellowLight, greenLight);

        // Create the scene and set the stage
        Scene scene = new Scene(root, 200, 600);
        primaryStage.setTitle("Traffic Signal Animation");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Create a timeline for the animation based on the optimized timings
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                    redLight.setFill(Color.RED);
                    yellowLight.setFill(Color.GRAY);
                    greenLight.setFill(Color.GRAY);
                }),
                new KeyFrame(Duration.seconds(lane1RedTime), e -> {
                    redLight.setFill(Color.GRAY);
                    yellowLight.setFill(Color.YELLOW);
                    greenLight.setFill(Color.GRAY);
                }),
                new KeyFrame(Duration.seconds(lane1RedTime + YELLOW_TIME), e -> {
                    redLight.setFill(Color.GRAY);
                    yellowLight.setFill(Color.GRAY);
                    greenLight.setFill(Color.GREEN);
                }),
                new KeyFrame(Duration.seconds(lane1RedTime + YELLOW_TIME + lane1GreenTime), e -> {
                    redLight.setFill(Color.RED);
                    yellowLight.setFill(Color.GRAY);
                    greenLight.setFill(Color.GRAY);
                })
        );

        // Set the cycle count to indefinite to keep the animation running
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    // Compute green times for each lane
    public static int[] computeGreenTimes(int[] queueLengths, int totalVehicles, double peakHourAdjustmentFactor) {
        int[] greenTimes = new int[queueLengths.length];
        int totalQueue = 0;

        // Calculate total queue length
        for (int queueLength : queueLengths) {
            totalQueue += queueLength;
        }

        // Calculate green times
        for (int i = 0; i < queueLengths.length; i++) {
            greenTimes[i] = (int) ((queueLengths[i] * peakHourAdjustmentFactor / (double) totalQueue) * (TOTAL_CYCLE_TIME - YELLOW_TIME));
        }

        return greenTimes;
    }

    // Compute red times based on green times and yellow time
    public static int[] computeRedTimes(int[] greenTimes) {
        int[] redTimes = new int[greenTimes.length];
        for (int i = 0; i < greenTimes.length; i++) {
            redTimes[i] = TOTAL_CYCLE_TIME - greenTimes[i] - YELLOW_TIME;
        }
        return redTimes;
    }

    // Adjust green times based on the total cycle time
    public static int[] adjustGreenTimesForCycleTime(int[] greenTimes) {
        int[] adjustedGreenTimes = new int[greenTimes.length];
        for (int i = 0; i < greenTimes.length; i++) {
            adjustedGreenTimes[i] = (int) ((greenTimes[i] / (double) (TOTAL_CYCLE_TIME - YELLOW_TIME)) * TOTAL_CYCLE_TIME);
        }
        return adjustedGreenTimes;
    }

    public static void main(String[] args) {
        launch(args);
    }
}