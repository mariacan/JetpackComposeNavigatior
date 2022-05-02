package com.example.jetpackcomposenavigatior.screens.Navigation

//Para navegar entre panatallas necesitamos las rutas
sealed class AppScreens(val route:String){
    object FirstScreen: AppScreens("first_screen")
    object SecondScreen: AppScreens("second_screen")
}

