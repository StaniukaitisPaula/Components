package br.senai.sp.jandira.navigation.perfil

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PerfilScreen(navController: NavController, nome: String) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Column {

        }
        Text(text = "Perfil - $nome",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold

        )

        Button(onClick = { navController.navigate("menu")}) {
            Text(text = "Voltar")
        }
    }


}

@Preview (showBackground = true, showSystemUi = true)
@Composable
fun PerfilScreenPreview() {
    //PerfilScreen()
}