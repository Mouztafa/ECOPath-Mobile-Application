package com.example.mynasa.Presention.Ui

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.mynasa.R

class NoProvery : Screen {
    @Composable
    override fun Content() {

        NoProveryContent()


    }
}

@Composable
fun NoProveryContent() {
    val navigator = LocalNavigator.currentOrThrow
    val showDilog = remember { mutableStateOf(false) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { showDilog.value = true },
                containerColor = MaterialTheme.colorScheme.primary
            ) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "Add")
            }
        }
    ) { padding ->

    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth()
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Welcome to First Goal " , fontSize = 25.sp , modifier = Modifier.padding(10.dp))
        Image(painter = painterResource(id = R.drawable.problem1), contentDescription =null, modifier = Modifier.size(500.dp) )
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navigator.push(EndHunger()) }) {
            Text(text = "Get To Next Goal  ")

        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navigator.push(HomeScreen())}) {
            Text(text = "Go To Home Screen")

        }

        @Composable
        fun AddQuizDilog(onAddNote:(String , String)->Unit , onDismissRequesrt :()->Unit){
            val title = remember { mutableStateOf("") }
            val description = remember { mutableStateOf("") }
            AlertDialog(onDismissRequest = { onDismissRequesrt() }, confirmButton = {
                Button(enabled = title.value.isNotEmpty() && description.value.isNotEmpty()
                    ,onClick = { onAddNote(title.value , description.value) }) {
                    Text(text = "Add Quiz")

                }
            }, title = { Text(text = "Add Quiz")} , text = {
                Column {
                    OutlinedTextField( placeholder = { Text(text = "Add title")},value = title.value, onValueChange ={title.value= it} )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(placeholder = { Text(text = "Add Decription")},value = description.value, onValueChange = {description.value= it})
                }
            })
        }
    }




}
}