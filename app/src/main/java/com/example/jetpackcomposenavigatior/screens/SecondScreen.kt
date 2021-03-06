package com.example.jetpackcomposenavigatior.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

//Fun initial
@Composable
fun SecondScreen(navController: NavController, text: String?){
    Scaffold  (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
            contentDescription = "Arrow back",
            modifier = Modifier.clickable {
                navController.popBackStack()
            })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "SecondScreen")
        }
    }) {
        SecondBodyContent(navController, text)
    }
}
//Body
@Composable
fun SecondBodyContent(navController: NavController, text: String?){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("He! navegación")
        text?.let {
            Text(it)
        }
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Volver atrás")
        }
    }
}
/* //PREVIA VISUARLO
@Preview(showBackground = true)
@Composable
fun SecondDefaultPreview(){
    SecondScreen() //Es nuestro Scaffold
}*/