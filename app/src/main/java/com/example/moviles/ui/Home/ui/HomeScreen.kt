package com.example.moviles.ui.Home.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color // Importa Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("add_product_screen") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors( // Color Marron Oscuro
                    containerColor = Color(0xFF8B4513), // Marrón oscuro (Saddle Brown)
                    contentColor = Color.White
                )
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "Agregar Producto",
                    tint = MaterialTheme.colorScheme.onPrimary  // Mantiene el color del icono de MaterialTheme
                )
                Spacer(Modifier.padding(4.dp))
                Text(
                    text = "Agregar Nuevo Producto",
                    color = Color.White, //  Texto blanco
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }

            Button(
                onClick = { navController.navigate("edit_delete_product_screen") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors(  // Color Marron Oscuro
                    containerColor = Color(0xFF8B4513), // Marrón oscuro (Saddle Brown)
                    contentColor = Color.White
                )
            ) {
                Icon(
                    imageVector = Icons.Filled.Settings,
                    contentDescription = "Modificar Productos",
                    tint = MaterialTheme.colorScheme.onPrimary // Mantiene el color del icono de MaterialTheme
                )
                Spacer(Modifier.padding(4.dp))
                Text(
                    text = "Modificar Productos",
                    color = Color.White, // Texto blanco
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }

            Button(
                onClick = { navController.navigate("list_products_screen") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors( // Color Marron Oscuro
                    containerColor = Color(0xFF8B4513), // Marrón oscuro (Saddle Brown)
                    contentColor = Color.White
                )
            ) {
                Icon(
                    imageVector = Icons.Filled.List,
                    contentDescription = "Lista de Productos",
                    tint = MaterialTheme.colorScheme.onPrimary // Mantiene el color del icono de MaterialTheme
                )
                Spacer(Modifier.padding(4.dp))
                Text(
                    text = "Lista de Productos",
                    color = Color.White, // Texto blanco
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }

            Button(
                onClick = {
                    navController.navigate("login_screen") {
                        popUpTo("login_screen") {
                            inclusive = true
                        }
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors( // Color Rojo Oxido
                    containerColor = Color(0xFFA72D00), // Rojo óxido
                    contentColor = Color.White
                )
            ) {
                Icon(
                    imageVector = Icons.Filled.ExitToApp,
                    contentDescription = "Cerrar sesión",
                    tint = MaterialTheme.colorScheme.onSecondary // Mantiene el color del icono de MaterialTheme
                )
                Spacer(Modifier.padding(4.dp))
                Text(
                    text = "Cerrar sesión",
                    color = Color.White, // Texto blanco
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        }
    }
}