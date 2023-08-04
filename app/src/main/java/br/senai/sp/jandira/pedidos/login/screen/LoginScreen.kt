package br.senai.sp.jandira.pedidos.login.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.pedidos.ui.theme.NavegationTestTheme

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)

    ){
        Text(
            text = "Login",
            modifier = Modifier
                .fillMaxWidth(),
            color = Color.White
        )
        Button(onClick = { navController.navigate("menu") }) {
            Text(
                text = "Entrar",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Blue,
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    NavegationTestTheme() {
        
    }
}