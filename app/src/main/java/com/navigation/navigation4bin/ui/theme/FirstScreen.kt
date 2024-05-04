package com.navigation.navigation4bin.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// Funzione Composable per la prima schermata
@Composable
fun FirstScreen(
    onNextButtonClick: () -> Unit, // Callback chiamato quando viene premuto il pulsante "Next"
    modifier: Modifier // Modificatori per personalizzare l'aspetto della schermata
) {
    // Colonna verticale per organizzare i componenti in verticale
    Column {
        // Testo per indicare che questa è la prima schermata
        Text(
            text = "primo schermo"
        )
        // Pulsante per passare alla prossima schermata
        Button(onClick = onNextButtonClick) {
            // Testo del pulsante
            Text(
                text = "next"
            )
        }
    }
}
