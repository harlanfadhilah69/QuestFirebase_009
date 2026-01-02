package com.example.questfirebasee_009.view.controllNavigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questfirebase_009.view.route.DestinasiDetail
import com.example.questfirebasee_009.view.EntrySiswaScreen
import com.example.questfirebasee_009.view.HomeScreen
import com.example.questfirebasee_009.view.route.DestinasiEntry
import com.example.questfirebasee_009.view.route.DestinasiHome

@Composable
fun DataSiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    HostNavigasi(navController = navController)
}

