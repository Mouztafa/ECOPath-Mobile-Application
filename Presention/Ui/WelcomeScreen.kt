package com.example.mynasa.Presention.Ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.mynasa.R

class WelcomeScreen : Screen {
    @Composable
    override fun Content() {
        WelcomeScreenContent()
    }
}

@Composable
fun WelcomeScreenContent() {
    val navigator = LocalNavigator.currentOrThrow

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF35628F)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.welcome66),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "             Eco Paths",
            modifier = Modifier.fillMaxWidth().padding(70.dp),
            fontSize = 25.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Row for student and teacher images with labels
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween // Space between the two images
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally // Center the text under the image
            ) {
                Image(
                    painter = painterResource(id = R.drawable.student1),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Text(text = "Student", color = Color.White) // Label for student
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally // Center the text under the image
            ) {
                Image(
                    painter = painterResource(id = R.drawable.teacher2),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Text(text = "Teacher", color = Color.White) // Label for teacher
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navigator.push(LoginScreen()) },
            modifier = Modifier.padding(16.dp) // Optional padding
        ) {
            Text(text = "Get Started")
        }
    }
}
