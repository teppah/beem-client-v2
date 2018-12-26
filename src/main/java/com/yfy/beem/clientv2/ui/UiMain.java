package com.yfy.beem.clientv2.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UiMain extends Application {
    private static final Logger log = LoggerFactory.getLogger(UiMain.class);
    private ConfigurableApplicationContext ctx;
    private Parent root;

    @Override
    public void init() throws Exception {
        ctx = SpringApplication.run(UiMain.class);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
        log.info("created new FXMLLoader, {}", loader);
//        loader.setControllerFactory(ctx::getBean);
        root = loader.load();
        log.info("Root initialized, {}", root);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(root,800,600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mock UI");
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        ctx.stop();
    }

    public static void main(String[] args) {
        launch(UiMain.class, args);
    }
}
