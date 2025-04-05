module org.example.formfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.formfx to javafx.fxml;
    exports org.example.formfx;

    // Controladores
    opens org.example.formfx.controllers to javafx.fxml;
    exports org.example.formfx.controllers;
}