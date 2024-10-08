module erl.blackjackfx {
    requires transitive javafx.controls;
    requires javafx.fxml;

    requires core.fx;

    opens dev.erl to javafx.fxml;
    exports dev.erl;
}
