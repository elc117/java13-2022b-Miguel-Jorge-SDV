package examples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class SongController {
  @FXML
  TextField urlText;
  @FXML
  TextField nameText;
  @FXML
  TextField artistText;
  @FXML
  TextField userText;
  @FXML
  TextField tagsText;
  

  @FXML
    void doAdd(ActionEvent event) throws Exception {
        Song song = new Song(urlText.getText(),
                             nameText.getText(),
                             artistText.getText(),
                             userText.getText(),
                             tagsText.getText());
        SongSheetRepository repository = new SongSheetRepository();
        repository.create(song);
        //song.setTags(tagsText.getText());
        //repository.update("url",urlText.getText(), song);
        //repository.delete("url", urlText.getText());

        System.out.println(song);
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("New song created!");
        alert.showAndWait();
    }
}