package com.example.mynasa.Presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import cafe.adriel.voyager.core.screen.Screen
import com.example.mynasa.R

class FloatactionButtonScreen : Screen {
    @Composable
    override fun Content() {
        Scaffold(
            floatingActionButton = {
                FloatingActionButton(
                    onClick = { /* Handle button click */ },
                    containerColor = MaterialTheme.colorScheme.primary
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.welcome66), // Replace with your icon resource
                        contentDescription = "Add"
                    )
                }
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding) // Apply inner padding here
            ) {
                Text(text = "Welcome again!")
            }
        }
    }
}
