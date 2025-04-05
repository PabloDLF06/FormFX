package org.example.formfx.controllers

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField

class FormFXController {

    @FXML
    private lateinit var blueLabel: Label

    @FXML
    private lateinit var fieldForm: TextField

    @FXML
    private lateinit var sendButton: Button

    @FXML
    private fun initialize() {
        blueLabel.isVisible = false
        sendButton.isDisable = true

        // Reto: Activar 'sendButton' cuando haya al menos 2 letras en 'fieldForm'
        fieldForm.textProperty().addListener { _, _, newValue ->
            sendButton.isDisable = newValue.length < 2
        }

        sendButton.setOnAction {
            val name = fieldForm.text
            if (name.isNotEmpty()) {
                blueLabel.text = "Hola, $name!"
                blueLabel.isVisible = true
            }
        }
    }

}