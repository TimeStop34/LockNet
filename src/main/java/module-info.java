module tech.ts34.locknet {
    requires javafx.controls;
    requires javafx.fxml;


    opens tech.ts34.locknet to javafx.fxml;
    exports tech.ts34.locknet;
}