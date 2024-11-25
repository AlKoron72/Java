module com.example.gitgnub {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.gitgnub to javafx.fxml;
    exports com.example.gitgnub;
}