module com.nazwa_domeny.pierwsza_aplikacja_graficzna_javafx.pierwszaaplikacjagraficznajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nazwa_domeny to javafx.fxml;
    exports com.nazwa_domeny;
}