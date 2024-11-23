package com.example.mynasa.Presention.Ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.mynasa.R

class SplashScreen :Screen {
    @Composable
    override fun Content() {
        //val navigtor = LocalNavigator.currentOrThrow

        StartScreenContent()

    }
}

@Composable
fun StartScreenContent(){
    val navigtor = LocalNavigator.currentOrThrow

Column(modifier = Modifier
    .fillMaxSize()
    .background(Color(0xFF35628F)),
    verticalArrangement = Arrangement.Center ,
    horizontalAlignment = Alignment.CenterHorizontally,

    ) {
             Image(painter = painterResource(id = R.drawable.welcome66), contentDescription =null, modifier = Modifier.size(200.dp) )
              Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Welcome to Eco Paths", modifier = Modifier.fillMaxWidth().padding(70.dp) ,color = Color.White, fontSize = 25.sp , )
             Spacer(modifier = Modifier.height(10.dp))
                Button(onClick = {navigtor.push(WelcomeScreen()) }) {
                    Text(text = "Get Started")

                }


}
}
