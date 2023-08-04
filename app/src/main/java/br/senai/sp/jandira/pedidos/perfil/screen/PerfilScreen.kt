package br.senai.sp.jandira.pedidos.perfil.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.pedidos.ui.theme.NavegationTestTheme

@Composable
fun PerfilScreen(navController: NavController, nome: String, idade: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Perfil - $nome - $idade",
            color = Color.White
        )
        Button(onClick = { navController.navigate("menu") }) {
            Text(
                text = "Voltar",
                color = Color.White
            )
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun PerfilScreenPreview() {
    NavegationTestTheme() {
        
    }
}