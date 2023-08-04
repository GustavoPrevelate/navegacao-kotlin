package br.senai.sp.jandira.pedidos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
// import androidx.navigation.compose.composable
import br.senai.sp.jandira.pedidos.login.screen.LoginScreen
import br.senai.sp.jandira.pedidos.menu.screen.MenuScreen
import br.senai.sp.jandira.pedidos.pedidos.screen.PedidosScreen
import br.senai.sp.jandira.pedidos.perfil.screen.PerfilScreen
import br.senai.sp.jandira.pedidos.ui.theme.NavegationTestTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavegationTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    val navController = rememberAnimatedNavController()
                    AnimatedNavHost(
                        navController = navController,
                        startDestination = "login",
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentScope.SlideDirection.Right,
                                animationSpec = tween(1000)
                            ) + fadeIn(tween(1500)) + expandIn(animationSpec = tween(1500))
                        },
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentScope.SlideDirection.Right,
                                animationSpec = tween(1000)
                            ) + fadeOut(tween(1500)) + scaleOut(animationSpec = tween(1500))
                        }
                    ){
                        composable(route = "login"){ LoginScreen(navController)}
                        composable(route = "menu"){ MenuScreen(navController)}
                        composable(route = "pedidos"){ PedidosScreen(navController)}
                        composable(route = "perfil/{nomeUsuario}/{idadeUsuario}"){
                            var nome = it.arguments!!.getString("nomeUsuario")
                            var idade = it.arguments!!.getString("idadeUsuario")
                            PerfilScreen(navController, nome!!, idade!!)
                        }
                    }
                }
            }
        }
    }
}

