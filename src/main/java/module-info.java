open module beem.client.v2 {
    // client
    requires javafx.fxml;
    requires javafx.controls;

    //spring
    requires spring.boot;
//    requires spring.core;
    requires spring.context;
//    requires spring.boot.starter;
    requires spring.boot.autoconfigure;
//    requires static lombok;
//    requires logback.classic;
    requires slf4j.api;
}