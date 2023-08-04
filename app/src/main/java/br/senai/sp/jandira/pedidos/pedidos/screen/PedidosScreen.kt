package br.senai.sp.jandira.pedidos.pedidos.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import br.senai.sp.jandira.pedidos.ui.theme.NavegationTestTheme


@Composable
fun PedidosScreen(navController: NavController) {
    Column(modifier = Modifier.background(Color.Gray).fillMaxSize()) {
        Text(
            text = "Pedidos",
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
fun PedidosScreenPreview() {
    NavegationTestTheme() {

    }
}