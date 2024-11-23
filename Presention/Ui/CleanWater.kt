package com.example.mynasa.Presention.Ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.mynasa.R

class CleanWater :Screen {
    @Composable
    override fun Content() {

        CleanWaterContent()

    }
}

@Composable
fun CleanWaterContent() {
    val navigator = LocalNavigator.currentOrThrow
    //implement screen here
    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth()
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Welcome to Sixth Goal " , fontSize = 25.sp , modifier = Modifier.padding(10.dp))
        Image(painter = painterResource(id = R.drawable.problem6), contentDescription =null, modifier = Modifier.size(500.dp) )
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navigator.push(Afforbalecleanenergy()) }) {
            Text(text = "Get To Next Goal ")

        }

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navigator.push(HomeScreen())}) {
            Text(text = "Go To Home Screen")

        }

    }
}