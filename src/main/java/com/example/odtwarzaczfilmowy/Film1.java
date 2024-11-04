package com.example.odtwarzaczfilmowy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.ResourceBundle;

public class Film1 implements Initializable {
@FXML
private MediaView mediaView;

private MediaPlayer mediaPlayer;
@FXML
   private Label label;

    @FXML
    private Button play;
    @FXML
    private Button pause;
    @FXML
    private Button stop;

    public Stage stage;
    public Scene scene;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Tooltip tooltip = new Tooltip("to jest przycisk do uruchomienia");
        play.setTooltip(tooltip);


        Tooltip tooltip2 = new Tooltip("to jest przycisk do pauzowania");
        pause.setTooltip(tooltip2);

        Tooltip tooltip3 = new Tooltip("to jest przycisk do resetowania");
        stop.setTooltip(tooltip3);

        String mediaPath = Paths.get("src/main/resources/com/example/odtwarzaczfilmowy/videos/video1.mp4").toUri().toString();
        Media media = new Media(mediaPath);
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);


    }
    @FXML
    protected void playMedia(){
        mediaPlayer.play();
    }
    @FXML
    protected void pauseMedia(){
        mediaPlayer.pause();
    }
    @FXML
    protected void stopMedia(){
        mediaPlayer.stop();
    }


    public void ustawKolor(String text) {
if(Objects.equals(text, "Bialy")){
    label.setStyle("-fx-text-fill: white;");

    play.setStyle(
            "-fx-background-image: url('src/main/resources/com/example/odtwarzaczfilmowy/przyciski/play-button(2).png'); " +
                    "-fx-background-size: cover;"
    );


} else if (Objects.equals(text, "Czarny")) {
    label.setStyle("-fx-text-fill: black;");

}
else{
    label.setStyle("-fx-text-fill: green;");

}

    }

    @FXML
    public void powrot(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }





}