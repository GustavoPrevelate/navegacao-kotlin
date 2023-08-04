package br.senai.sp.jandira.pedidos.menu.screen

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
fun MenuScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Menu",
            color = Color.White
        )
        Button(onClick = { navController.navigate("perfil/Maria da Silva/25") }) {
            Text(
                text = "Perfil",
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(260.dp))
        Button(onClick = { navController.navigate("pedidos") }) {
            Text(
                text = "Pedidos",
                color = Color.White
            )
        }
        Button(onClick = { navController.navigate("login") }) {
            Text(
                text = "Sair",
                color = Color.White
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun MenuScreenPreview() {
    NavegationTestTheme() {

    }
}