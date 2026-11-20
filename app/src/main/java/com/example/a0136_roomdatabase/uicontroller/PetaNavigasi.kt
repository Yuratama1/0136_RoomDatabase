package com.example.a0136_roomdatabase.uicontroller

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.a0136_roomdatabase.view.DetailSiswaScreen
import com.example.a0136_roomdatabase.view.EditSiswaScreen
import com.example.a0136_roomdatabase.view.EntrySiswaScreen
import com.example.a0136_roomdatabase.view.HomeScreen
import com.example.a0136_roomdatabase.view.route.DestinasiDetailSiswa
import com.example.a0136_roomdatabase.view.route.DestinasiDetailSiswa.itemIdArg
import com.example.a0136_roomdatabase.view.route.DestinasiEditSiswa
import com.example.a0136_roomdatabase.view.route.DestinasiEntry
import com.example.a0136_roomdatabase.view.route.DestinasiHome

@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController()
) {
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {

        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiEntry.route)
                },
                navigateToItemUpdate = {
                    navController.navigate("${DestinasiDetailSiswa.route}/$it")
                }
            )
        }

        composable(DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }

        composable(
            route = DestinasiDetailSiswa.routeWithArgs,
            arguments = listOf(
                navArgument(itemIdArg) {
                    type = NavType.IntType
                }
            )
        ) {
            DetailSiswaScreen(
                navigateToEditItem = {
                    navController.navigate("${DestinasiEditSiswa.route}/$it")
                },
                navigateBack = {
                    navController.navigateUp()
                }
            )
        }

        composable(
            route = DestinasiEditSiswa.routeWithArgs,
            arguments = listOf(
                navArgument(DestinasiEditSiswa.itemIdArg) {
                    type = NavType.IntType
                }
            )
        ) {
            EditSiswaScreen(
                navigateBack = {
                    navController.popBackStack()
                },
                onNavigateUp = {
                    navController.navigateUp()
                }
            )
        }
    }
}