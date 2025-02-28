package br.com.fiap.ecotrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "LoginScreen"){
                        composable("LoginScreen"){
                            LoginScreen(navController)
                        }
                        composable("MenuScreen"){
                            MenuScreen(navController)
                        }

                        composable("RankingRewards"){
                            RankingRewards(navController)
                        }

                        composable("CustomChallenges"){
                            CustomChallenges(navController)
                        }

                        composable("MonitoringConsumption"){
                            MonitoringConsumption(navController)
                        }

                        composable("ReportsStatistics"){
                            ReportsStatistics(navController)
                        }

                        composable("PerfilScreen"){
                        }

                        composable("CustomChallenges"){
                            CustomChallenges(navController)
                        }

                        composable("Rewards"){
                            RankingRewards(navController)
                        }

                        composable("Report"){
                            ReportsStatistics(navController)

                        }

                    }
                }
            }
        }
    }
}
