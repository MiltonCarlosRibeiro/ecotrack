package br.com.fiap.ecotrack.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ReportsStatistics(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFEF0F2F2))
            .padding(32.dp)
    ) {
        Text(
            text = "Report",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Button(
            onClick = {navController.navigate("MenuScreen")},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Text(text = "Back", fontSize = 20.sp, color = Color.Blue)
        }
    }
}
//@Preview
//@Composable
//fun LoginScreenPreview(){
//    ReportsStatistics()
//}


