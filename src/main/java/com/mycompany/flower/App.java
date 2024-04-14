package com.mycompany.flower;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
       
        
        
        
        
        

        Pane flowerpane = new Pane();
        flowerpane.setStyle("-fx-border-color:black; -fx-border-width:5px; -fx-background-color:white;");
        flowerpane.setPrefSize(430, 400);
        Circle circ1 = new Circle(4, 5, 6);

        Circle circle1 = new Circle();
        circle1.setRadius(40);
        circle1.setCenterX(200);
        circle1.setCenterY(100);
        circle1.setStroke(Color.YELLOW);
        flowerpane.getChildren().add(circle1);

        Circle circle2 = new Circle();
        circle2.setRadius(40);
        circle2.setCenterX(170);
        circle2.setCenterY(120);
        // circle2.setStroke(Color.AQUA);
        flowerpane.getChildren().add(circle2);

        Circle circle3 = new Circle();
        circle3.setRadius(40);
        circle3.setCenterX(250);
        circle3.setCenterY(120);
        // circle3.setStroke(Color.BROWN);
        flowerpane.getChildren().add(circle3);

        Circle circle4 = new Circle();
        circle4.setRadius(40);
        circle4.setCenterX(220);
        circle4.setCenterY(180);
        // circle4.setStroke(Color.BLUE);
        flowerpane.getChildren().add(circle4);

        Circle circle5 = new Circle();
        circle5.setRadius(40);
        circle5.setCenterX(180);
        circle5.setCenterY(160);
        // circle5.setStroke(Color.GREEN);
        flowerpane.getChildren().add(circle5);

        Circle circle6 = new Circle();
        circle6.setRadius(40);
        circle6.setCenterX(250);
        circle6.setCenterY(160);
        //  circle6.setStroke(Color.BLUEVIOLET);
        flowerpane.getChildren().add(circle6);

        Circle circle = new Circle();
        circle.setRadius(20);
        circle.setCenterX(210);
        circle.setCenterY(150);
        circle.setFill(Color.GREEN);
        flowerpane.getChildren().add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(210);
        rectangle.setY(210);
        rectangle.setWidth(10);
        rectangle.setHeight(140);
        flowerpane.getChildren().add(rectangle);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setX(250);
        rectangle1.setY(240);
        rectangle1.setWidth(6);
        rectangle1.setHeight(100);
        rectangle1.setRotate(-135);
        flowerpane.getChildren().add(rectangle1);
        Arc arc = new Arc();
        arc.setCenterX(300.0f);
        arc.setCenterY(260.0f);
        arc.setRadiusX(30.0f);
        arc.setRadiusY(30.0f);
        arc.setStartAngle(55.0f);
        arc.setLength(150.0f);
        arc.setFill(Color.BLACK);
        flowerpane.getChildren().add(arc);

        VBox controlsPane = new VBox(30);
        controlsPane.setSpacing(20);
        HBox controlsPane1 = new HBox();
        Label partbl = new Label("Select flower part");
        ComboBox parts = new ComboBox();
        parts.getItems().addAll("Petals", "Seeds", "Stem", "Leaves");
        
        
    HBox controlsPane2 = new HBox();
        Label fillbl = new Label("Fill Color");
        RadioButton red = new RadioButton("RED");
        RadioButton green = new RadioButton("GREEN");
        RadioButton blue = new RadioButton("BLUE");
        ToggleGroup tg = new ToggleGroup();
        red.setToggleGroup(tg);
        green.setToggleGroup(tg);
        blue.setToggleGroup(tg);
        controlsPane2.getChildren().addAll(fillbl, red, green, blue);
        CheckBox str = new CheckBox("Add Stroke");
        Button set = new Button("ResetColor");
        red.setOnAction(new EventHandler<ActionEvent>() {

            
            @Override
            public void handle(ActionEvent event) {

                int i = parts.getSelectionModel().getSelectedIndex();
                if (i == 0) {
                    if (red.isSelected()) {
                        circle1.setFill(Color.RED);
                        circle2.setFill(Color.RED);
                        circle3.setFill(Color.RED);
                        circle4.setFill(Color.RED);
                        circle5.setFill(Color.RED);
                        circle6.setFill(Color.RED);

                    }
                }
                if (i == 1) {
                    if (red.isSelected()) {
                        circle.setFill(Color.RED);
                    }
                }
                if (i == 2) {
                    if (red.isSelected()) {
                        rectangle.setFill(Color.RED);
                        rectangle1.setFill(Color.RED);

                    }
                }
                if (i == 3) {
                    if (red.isSelected()) {
                        arc.setFill(Color.RED);
                    }
                }
            }
        });

        green.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                int i = parts.getSelectionModel().getSelectedIndex();
                if (i == 0) {
                    if (green.isSelected()) {
                        circle1.setFill(Color.GREEN);
                        circle2.setFill(Color.GREEN);
                        circle3.setFill(Color.GREEN);
                        circle4.setFill(Color.GREEN);
                        circle5.setFill(Color.GREEN);
                        circle6.setFill(Color.GREEN);

                    }
                }
                if (i == 1) {
                    if (green.isSelected()) {
                        circle.setFill(Color.GREEN);
                    }

                }
                if (i == 2) {
                    if (green.isSelected()) {
                        rectangle.setFill(Color.GREEN);
                        rectangle1.setFill(Color.GREEN);

                    }

                }
                if (i == 3) {
                    if (green.isSelected()) {
                        arc.setFill(Color.GREEN);
                    }

                }
            }
        });

        blue.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                int i = parts.getSelectionModel().getSelectedIndex();
                if (i == 0) {
                    if (blue.isSelected()) {
                        circle1.setFill(Color.BLUE);
                        circle2.setFill(Color.BLUE);
                        circle3.setFill(Color.BLUE);
                        circle4.setFill(Color.BLUE);
                        circle5.setFill(Color.BLUE);
                        circle6.setFill(Color.BLUE);
                    }
                }
                if (i == 1) {
                    if (blue.isSelected()) {
                        circle.setFill(Color.BLUE);
                    }
                }
                if (i == 2) {
                    if (blue.isSelected()) {
                        rectangle.setFill(Color.BLUE);
                        rectangle1.setFill(Color.BLUE);
                        }
                }
                if (i == 3) {
                    if (blue.isSelected()) {
                        arc.setFill(Color.BLUE);
                    }
                }
            }
        });
        str.setOnAction(e -> {
            if (str.isSelected()) {
                rectangle.setStroke(Color.AQUA);
                rectangle1.setStroke(Color.AQUA);
                circle.setStroke(Color.AQUA);
                arc.setStroke(Color.AQUA);
            } else {
                rectangle.setStroke(Color.TRANSPARENT);
                rectangle1.setStroke(Color.TRANSPARENT);
                circle.setStroke(Color.TRANSPARENT);
                arc.setStroke(Color.TRANSPARENT);
            }
        });
        set.setOnAction(e -> {
            circle1.setFill(Color.BLACK);
            circle2.setFill(Color.BLACK);
            circle3.setFill(Color.BLACK);
            circle4.setFill(Color.BLACK);
            circle5.setFill(Color.BLACK);
            circle6.setFill(Color.BLACK);
            rectangle.setFill(Color.BLACK);
            rectangle1.setFill(Color.BLACK);
            rectangle.setFill(Color.BLACK);
            rectangle1.setFill(Color.BLACK);
            arc.setFill(Color.BLACK);

            circle.setFill(Color.GREEN);
            rectangle.setStroke(Color.TRANSPARENT);
            rectangle1.setStroke(Color.TRANSPARENT);
            circle.setStroke(Color.TRANSPARENT);
            arc.setStroke(Color.TRANSPARENT);
        });
        controlsPane.getChildren().addAll(controlsPane1, controlsPane2, str, set);
        BorderPane root = new BorderPane();
        root.setTop(flowerpane);
        root.setCenter(controlsPane);
        Scene scene = new Scene(root, 500, 650);

        flowerpane.setOnMouseClicked(e -> {

            flowerpane.setStyle("-fx-background-color: lightYellow;"
                    + " -fx-border-color: black; "
                    + "-fx-border-width: 5px");

        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                e.consume();
                if (e.getCode() == KeyCode.UP) {
                    circle.setTranslateY(circle.getTranslateY() + 10);
                } else if (e.getCode() == KeyCode.DOWN) {
                    circle.setTranslateY(circle.getTranslateY() - 10);
                } else if (e.getCode() == KeyCode.LEFT) {
                    circle.setTranslateX(circle.getTranslateX() - 10);
                } else if (e.getCode() == KeyCode.RIGHT) {
                    circle.setTranslateX(circle.getTranslateX() + 10);
                }
            }
        });
        primaryStage.setTitle("flower");
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch();
    }

}