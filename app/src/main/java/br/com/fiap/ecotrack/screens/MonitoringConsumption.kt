package br.com.fiap.ecotrack.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.ecotrack.R

@Composable
fun MonitoringConsumption(navController: NavController) {

    var energia by remember {
        mutableStateOf("")
    }

    var agua by remember {
        mutableStateOf("")
    }



    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
// ---- header ---------
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .background(colorResource(id = R.color.header))
            ) {
                Spacer(modifier = Modifier.height(35.dp))
                Image(
                    painter = painterResource(id = R.drawable.energy),
                    contentDescription = "logotipo",
                    modifier = Modifier.size(120.dp),
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Consumption Rate",
                    color = colorResource(id = R.color.black),
                    fontSize = 25.sp
                )
            }
// --- formulário
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
            ) {
                Card(
                    modifier = Modifier
                        .height(600.dp)
                        .fillMaxWidth()
                        .offset(y = (-20).dp),
                    colors = CardDefaults.cardColors(containerColor = Color.LightGray),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    TextField(
                        value = energia,
                        onValueChange = { letra ->
                            energia = letra
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp ),

                            label = {
                                Text(text = "Consumo de energia")
                                    },
                            placeholder =
                            { Text(text = "Digite o consumo")


                            }
                            )

                    TextField(
                        value = agua,
                        onValueChange = { letra ->
                            agua = letra
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        label = {
                            Text(text = "Consumo de água")
                        },
                        placeholder =
                        { Text(text = "Digite o consumo")


                        }
                    )



                }

            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFA4D4A6))
                    .padding(2.dp)
            ) {
                Button(
                    onClick = { navController.navigate("MenuScreen") },
                    colors = ButtonDefaults.buttonColors(Color.White),
                    modifier = Modifier.align(Alignment.Center)
                ) {
                    Text(text = "Back", fontSize = 20.sp, color = Color.Blue)
                }
            }
        }
// -- Car
    }


}


//@Preview
//@Composable
//fun LoginScreenPreview(){
//    MonitoringConsumption()
//}

