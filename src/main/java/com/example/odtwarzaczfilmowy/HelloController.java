package com.example.odtwarzaczfilmowy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private ToggleGroup group1;
    @FXML
    private ToggleGroup group2;
private Stage stage;
private Scene scene;

    @FXML
    protected void Przejdz(ActionEvent event) throws IOException {
        RadioButton selected = (RadioButton) group1.getSelectedToggle();
        RadioButton selected2 = (RadioButton) group2.getSelectedToggle();
        if(selected != null){
            if(selected2 != null){
                System.out.println(selected.getText());
                System.out.println(selected2.getText());

                String Kolor = selected2.getText();


 if(Objects.equals(selected.getText(), "Film1")){
     FXMLLoader loader = new FXMLLoader(getClass().getResource("film1.fxml"));
     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
     scene = new Scene(loader.load());
     stage.setScene(scene);

     Film1 film1controller = loader.getController();
     film1controller.ustawKolor(Kolor);

     stage.show();

 } else if (Objects.equals(selected.getText(), "Film2")) {
     FXMLLoader loader = new FXMLLoader(getClass().getResource("film2.fxml"));
     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
     scene = new Scene(loader.load());
     stage.setScene(scene);
     Film2 film2controller = loader.getController();
     film2controller.ustawKolor(Kolor);

     stage.show();
 }
 else{
     FXMLLoader loader = new FXMLLoader(getClass().getResource("film3.fxml"));
     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
     scene = new Scene(loader.load());
     stage.setScene(scene);
     Film3 film3controller = loader.getController();
     film3controller.ustawKolor(Kolor);

     stage.show();
 }


            }
            else{
                Notifications.create()
                        .title("BŁĄD")
                        .text("NIE WYBRANO KOLORU")
                        .hideAfter(Duration.seconds(5)) // czas wyswietlania
                        .position(Pos.TOP_RIGHT)
                        .onAction(eventt -> System.out.println("powiadomienie klikniete"))
                        .showWarning();
            }


        }
        else{
            Notifications.create()
                    .title("BŁĄD")
                    .text("NIE WYBRANO FILMU")
                    .hideAfter(Duration.seconds(5)) // czas wyswietlania
                    .position(Pos.TOP_RIGHT)
                    .onAction(eventt -> System.out.println("powiadomienie klikniete"))
                    .showWarning();
        }



    }
}