package com.example.mynasa.Presention.Ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class RegisterScreen:Screen {
    @Composable
    override fun Content() {
        RegisterScreenContent()

    }
}

@Composable
fun RegisterScreenContent(){
    val navigator = LocalNavigator.currentOrThrow
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val name = remember { mutableStateOf("") }
    val phone = remember { mutableStateOf("") }
    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Text(text = "Eco" , fontSize = 50.sp , modifier = Modifier.padding(10.dp), color = Color(
                0xFF099729
            )
            )

            Text(text = "Paths" , fontSize = 50.sp , color = Color(0xFF0E645F), modifier = Modifier.padding(16.dp), )

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {
            Text(text = "Sign Up " , fontSize = 30.sp , fontStyle = FontStyle.Italic,  modifier = Modifier.padding(10.dp),)
        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start){
            Text(text = "Register your account Here" , fontSize = 15.sp , fontStyle = FontStyle.Italic, color = Color.Gray , modifier = Modifier.padding(10.dp),)

        }
        Column(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
            verticalArrangement = Arrangement.Center ,
            horizontalAlignment = Alignment.CenterHorizontally) {
            TextField(value = name.value, onValueChange ={name.value= it}, placeholder = { Text(text = "Name") } , modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically) , shape = RoundedCornerShape(24), leadingIcon = {
                Icon(Icons.Outlined.AccountBox , contentDescription = "personal icons")
            })
            TextField(value = phone.value, onValueChange ={phone.value= it}, placeholder = { Text(text = "Phone") } , modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically) , shape = RoundedCornerShape(24), leadingIcon = {
                Icon(Icons.Outlined.Call , contentDescription = "personal icons")
            })

            TextField(value = email.value, onValueChange ={email.value= it}, placeholder = { Text(text = "Email") } , modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically) , shape = RoundedCornerShape(24), leadingIcon = {
                Icon(Icons.Outlined.Person , contentDescription = "personal icons")
            })
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = password.value,
                onValueChange = { password.value = it },
                placeholder = { Text(text = "Password", fontSize = 16.sp) },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .wrapContentHeight(align = Alignment.CenterVertically),
                shape = RoundedCornerShape(24),
                leadingIcon = {
                    Icon(Icons.Outlined.Lock, contentDescription = "Password Icon")
                },
                visualTransformation = PasswordVisualTransformation(), // Hides the password
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                )
            )

            Button(onClick = { navigator.push(LoginScreen())}, modifier = Modifier.fillMaxWidth().padding(16.dp)){
                Text(text = "Register")

            }





        }



    }
}