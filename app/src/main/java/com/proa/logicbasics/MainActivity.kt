package com.proa.logicbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.proa.logicbasics.ui.theme.LogicbasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        window.navigationBarColor = Color(0xFFAF7F8D).toArgb()
        setContent {
            LogicbasicsTheme {
                Inicio()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Inicio() {
    val navController = rememberNavController() // Cria uma instância do NavController

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF424242), titleContentColor = Color.White),
                title = {
                    Text(
                        "Metric Genius",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                })

        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(Color(0xFF424242)),
                verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {}, modifier = Modifier
                        .width(175.dp)
                        .height(75.dp),
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFAF7F8D)
                    )
                ) {
                    Text("Logar", fontSize = 22.sp)
                }

                Button(onClick = {},modifier = Modifier.width(175.dp).height(75.dp), shape = RoundedCornerShape(50.dp), colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFAF7F8D)
                )) {
                    Text("Registrar", fontSize = 22.sp)
                }

            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* Ação do FAB */ }) {
                Icon(Icons.Default.Menu, contentDescription = "Adicionar")
                // Icone padrão do Material Design, mas pode ser substituído por qualquer coisa
                // Consultar mais ícones em https://material.io/resources/icons/
            }
        },
        bottomBar = {
        }
    )
}

@Composable
fun ConteudoCirculo(navController: NavController) {
    Text("Círculo")
}

@Composable
fun ConteudoLogin(navController: NavController, innerPadding: PaddingValues) {
    Text(
        text = "Bem-vindo ao Portal das Formas"
    )

    Button(
        onClick = {
            navController.navigate("home")
        },
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Login")
    }
}

@Composable
fun Home(navController: NavController) {
    Text("Teste")
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    LogicbasicsTheme {
        Inicio()
    }
}