package com.global.apps.publisher.presentation.screens.onboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.global.apps.publisher.presentation.R
import com.global.apps.publisher.presentation.utilities.themes.ButtonPurple100
import com.global.apps.publisher.presentation.utilities.themes.ButtonPurple80
import com.global.apps.publisher.presentation.utilities.themes.Typography

@Composable
fun Button(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick() },
        modifier = modifier.wrapContentSize(),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        contentPadding = PaddingValues(0.dp),
        shape = RoundedCornerShape(20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            ButtonPurple100,
                            ButtonPurple80
                        ),
                        startY = 0f,
                        endY = 180f
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                fontFamily = FontFamily(Font(R.font.noto_sans_bold)),
                fontSize = 16.sp
            )
        }
    }
}

@Preview
@Composable
fun ButtonPreview() {
    Button("Start", onClick = {})
}