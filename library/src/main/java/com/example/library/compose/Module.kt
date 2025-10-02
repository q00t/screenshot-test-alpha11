package com.example.library.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Module() {
    Salutation(
        name = "App"
    )
}

@Preview(showBackground = true)
@Composable
fun ModulePreview() {
    Module()
}