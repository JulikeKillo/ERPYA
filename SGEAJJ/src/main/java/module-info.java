module com.example.ajj.sgeajj {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires itextpdf;
    requires java.desktop;


    opens com.example.ajj.sgeajj to javafx.fxml;
    exports com.example.ajj.sgeajj;
}