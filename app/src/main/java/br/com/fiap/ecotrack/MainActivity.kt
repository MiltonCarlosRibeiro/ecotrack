package br.com.fiap.ecotrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.com.fiap.ecotrack.screens.CustomChallenges
import br.com.fiap.ecotrack.screens.LoginScreen
import br.com.fiap.ecotrack.screens.MenuScreen
import br.com.fiap.ecotrack.screens.MonitoringConsumption
import br.com.fiap.ecotrack.screens.PerfilScreen
import br.com.fiap.ecotrack.screens.RankingRewards
import br.com.fiap.ecotrack.screens.ReportsStatistics
import br.com.fiap.ecotrack.ui.theme.EcoTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcoTrackTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "LoginScreen") {
                        composable("LoginScreen") {
                            LoginScreen(navController)
                        }
                        composable("MenuScreen") {
                            MenuScreen(navController)
                        }

                        composable("RankingRewards") {
                            RankingRewards(navController)
                        }

                        composable("CustomChallenges") {
                            CustomChallenges(navController)
                        }

                        composable("MonitoringConsumption") {
                            MonitoringConsumption(navController)
                        }

                        composable(
                            "ReportsStatistics?order={order}",
                            arguments = listOf(navArgument(name = "order") {
                                defaultValue = "order not defined"
                            })
                        )
                        {
                            ReportsStatistics(navController, it.arguments?.getString("order")!!)
                        }
                        composable(
                            "PerfilScreen/{nome}/{idade}",
                            arguments = listOf(
                                navArgument(name = "nome") {
                                    type = NavType.StringType
                                },
                                navArgument(name = "idade") {
                                    type = NavType.IntType
                                }

                                )
                        ) {
                            val nome = it.arguments?.getString("nome")

                            val idade = it.arguments?.getInt("idade")

                            PerfilScreen(navController, nome!!, idade!!)
                        }

                        composable("CustomChallenges") {
                            CustomChallenges(navController)
                        }

                        composable("Rewards") {
                            RankingRewards(navController)
                        }


                    }

                }
            }
        }
    }
}
