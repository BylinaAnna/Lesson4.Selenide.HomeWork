package com.herokuapp;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class DragandDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void DragandDropRectangle(){
        open ("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
    }
}