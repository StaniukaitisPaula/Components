package br.senai.sp.jandira.navigation.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController) {

    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Column {

        }
        Text(text = "Login")

        Button(onClick = { navController.navigate("menu")}) {
            Text(text = "Entrar")
        }
    }

}

@Preview (showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    //LoginScreen()
}