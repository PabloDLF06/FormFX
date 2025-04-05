package org.example.formfx.controllers

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField

class FormFXController {

    @FXML
    private lateinit var nameQuestion: Label

    @FXML
    private lateinit var fieldForm: TextField

    @FXML
    private lateinit var sendButton: Button

    @FXML
    private fun initialize() {
        nameQuestion.isVisible = false

        sendButton.setOnAction {
            val name = fieldForm.text
            if (name.isNotEmpty()) {
                nameQuestion.text = "Hola, $name!"
                nameQuestion.isVisible = true
            }
        }
    }

}