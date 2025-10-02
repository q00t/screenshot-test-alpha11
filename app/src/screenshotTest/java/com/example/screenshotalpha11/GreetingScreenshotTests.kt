package com.example.screenshotalpha11

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.android.tools.screenshot.PreviewTest
import com.example.screenshotalpha11.ui.compose.AppPreview
import com.example.screenshotalpha11.ui.compose.GreetingPreview

@PreviewTest
@PreviewLightDark
@Composable
fun GreetingPreviewTest() {
    GreetingPreview()
}

@PreviewTest
@PreviewLightDark
@Composable
fun GreetingPreviewTestCopy() {
    GreetingPreview()
}