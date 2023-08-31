package com.global.apps.publisher.presentation.screens.onboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.global.apps.publisher.presentation.R
import com.global.apps.publisher.presentation.utilities.themes.BackgroundPurple100
import com.global.apps.publisher.presentation.utilities.themes.BackgroundPurple30

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        BackgroundPurple100,
                        BackgroundPurple30
                    )
                )
            )
    ) {
        Logo(modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun Logo(modifier: Modifier) {
    Column(
        modifier = modifier,
    ) {
        Box(
            modifier = Modifier
                .align(CenterHorizontally)
                .size(219.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFFFFFFF),
                            Color(0x4DFFFFFF),
                        ),
                        start = Offset.Zero,
                        end = Offset(1f, 1f)
                    ), shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.padding(0.dp),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_normal),
                contentDescription = null,
            )
        }

        Image(
            modifier = Modifier.align(CenterHorizontally),
            imageVector = ImageVector.vectorResource(id = R.drawable.title_onboard),
            contentDescription = null,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}