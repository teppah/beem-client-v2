package com.yfy.beem.clientv2.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainController {
    private final Logger log = LoggerFactory.getLogger(MainController.class);
    @FXML
    private TableView contactsTableView;
    @FXML
    private MenuBar mainMenuBar;
    public void initialize() {
        log.info("finished initializing controller, {}", this);
    }
}
