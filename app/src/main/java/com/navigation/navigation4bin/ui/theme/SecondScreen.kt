package com.navigation.navigation4bin.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SecondScreen(
    onNextButtonClick: () -> Unit,
    modifier: Modifier
) {

    Column {
        Text(
            text = "secondo schermo"
        )
        Button(onClick = onNextButtonClick) {
            Text(
                text = "next"
            )
        }
    }
}