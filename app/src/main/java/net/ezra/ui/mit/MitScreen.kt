package net.ezra.ui.mit

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.TopAppBarDefaults

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNUP


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")


@Composable
fun MitScreen(navController: NavHostController) {


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    androidx.compose.material.Text(text = "Enigma properties", modifier = Modifier.padding(start = 50.dp))
                },

                navigationIcon = {
                    IconButton(onClick = {navController.navigate(ROUTE_LOGIN) {
                        popUpTo(ROUTE_MIT) {inclusive = true}
                    } }) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
                backgroundColor = Color(0xFF006492), // Set background color
                elevation = 1.dp
                )
        },




        content = {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF006492 )),

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                //all contents of your screen must be placed within this column



                LazyColumn (modifier = Modifier
                    .padding(10.dp)



                ){
                    item {

                        Image(painter = painterResource(id = R.drawable.icon), contentDescription = "", modifier = Modifier.padding(start = 160.dp) )




                        Text(

                            text = " opening the doors to extraordinary living."



                        )


                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = " LANDS FOR SALE!!!",
                            modifier = Modifier.padding(start = 60.dp),
                            fontSize = 20.sp,

                            style = TextStyle(textDecoration = TextDecoration.Underline)
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Column(
                            modifier = Modifier
                                .padding(5.dp)
//                .background(Color(0xffF1C69F))
                        ) {
                            Box {
                                Image(painter = painterResource(id = R.drawable.oceanica), contentDescription ="" )
Row(modifier = Modifier.padding(5.dp)) {
    Image(imageVector = Icons.Default.FavoriteBorder, contentDescription = "", modifier = Modifier.padding(start = 320.dp))
}
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            Row(
                                horizontalArrangement = Arrangement.Absolute.Center
                            ) {
                                Text(
                                    text = "EXECUTIVE PLACES",
                                    modifier = Modifier.padding(start = 10.dp),
                                    fontSize = 20.sp,

                                    style = TextStyle(textDecoration = TextDecoration.Underline)
                                )
                            }
//lazyrow starts here
 Spacer(modifier = Modifier.height(10.dp))
                            LazyRow {
                                item {

                                    Card (modifier = Modifier.clickable { navController.navigate(
                                        ROUTE_SHOP){popUpTo(ROUTE_MIT) {inclusive = true} } }){
                                        Column {
                                            Image(
                                                painter = painterResource(id = R.drawable.land5),
                                                contentDescription = ""
                                            )

                                            Column {
                                                Text(text = "beauty of the waters", )
                                                Text(text = "living! the dream" , )
                                                Text(text = "something for everyone " ,)
                                                Text(text = "make your life smile" , )


                                            }



//
                                        }
                                    }

                                    Spacer(modifier = Modifier.width(10.dp))



                                    Card (modifier = Modifier.clickable { navController.navigate(
                                        ROUTE_SHOP){popUpTo(ROUTE_MIT) {inclusive = true} } }){
                                        Column {
                                            Image(
                                                painter = painterResource(id = R.drawable.land),
                                                contentDescription = ""
                                            )

                                            Column {
                                                Text(text = "Do you want to own  piece of land", )
                                                Text(text = "in the mountains? You can bet on a " , )
                                                Text(text = "sense of privacy and solitude. The" ,)
                                                Text(text = "views are also breathtaking." , )


                                            }


//
                                        }
                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Card (modifier = Modifier.clickable { navController.navigate(
                                        ROUTE_SHOP){popUpTo(ROUTE_MIT) {inclusive = true} } }){
                                        Column {
                                            Image(
                                                painter = painterResource(id = R.drawable.house2),
                                                contentDescription = ""
                                            )

                                            Column {
                                                Text(text = "Necessities are our top priorities", )
                                                Text(text = "leave that boring apartment " , )
                                                Text(text = "if you retire now?Where is your home" ,)
                                                Text(text = "views risky." , )


                                            }


//
                                        }
                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Card (modifier = Modifier.clickable { navController.navigate(
                                        ROUTE_SHOP){popUpTo(ROUTE_MIT) {inclusive = true} } }){
                                        Column {
                                            Image(
                                                painter = painterResource(id = R.drawable.house),
                                                contentDescription = ""
                                            )

                                            Column {
                                                Text(text = "Necessities are our top priorities", )
                                                Text(text = "leave that boring apartment " , )
                                                Text(text = "if you retire now?Where is your home" ,)
                                                Text(text = "views risky." , )


                                            }


//
                                        }
                                    }
                                    Spacer(modifier = Modifier.width(10.dp))

                                    Card (modifier = Modifier.clickable { navController.navigate(
                                        ROUTE_SHOP){popUpTo(ROUTE_MIT) {inclusive = true} } }){
                                        Column {
                                            Image(
                                                painter = painterResource(id = R.drawable.house3),
                                                contentDescription = ""
                                            )

                                            Column {
                                                Text(text = "Your house is your kingdom", )
                                                Text(text = "leave that boring apartment " , )
                                                Text(text = "if you retire now?Where is your home" ,)
                                                Text(text = "views risky." , )


                                            }


//
                                        }
                                    }







                                    Spacer(modifier = Modifier.width(10.dp))


                                    Card(modifier = Modifier.clickable { navController.navigate(
                                        ROUTE_SHOP){popUpTo(ROUTE_MIT) {inclusive = true} } }) {
                                        Column {
                                            Image(
                                                painter = painterResource(id = R.drawable.miami),
                                                contentDescription = ""
                                            )

                                            Column {
                                                Text(text = "Necessities are our top priorities ")
                                                Text(text = "if you retire now?Where is your home  " )
                                                Text(text = "recreation and relaxation" )
                                                Text(text = "They also open up a world " )
                                                Text(text = "of agricultural offers." )

                                            }



//
                                        }
                                    }





                                    Spacer(modifier = Modifier.width(10.dp))


                                    Card(modifier = Modifier.clickable { navController.navigate(
                                        ROUTE_SHOP){popUpTo(ROUTE_MIT) {inclusive = true} } }) {
                                        Column {
                                            Image(
                                                painter = painterResource(id = R.drawable.water),
                                                contentDescription = ""
                                            )

                                            Column {
                                                Text(text = "Necessities are our top priorities ")
                                                Text(text = "if you retire now?Where is your home  " )
                                                Text(text = "recreation and relaxation" )
                                                Text(text = "They also open up a world " )
                                                Text(text = "of agricultural offers." )

                                            }



//
                                        }
                                    }


                                    Spacer(modifier = Modifier.width(10.dp))



                                }
                            }
                        }

                    }

                }










            }

        },

        bottomBar = { BottomBar(navController)  }

    )


}



@Composable
fun BottomBar(navController: NavHostController)
{
    BottomNavigation(elevation = 1.dp, backgroundColor = Color(0xFF410002))
    {
        val selectedIndex = remember { mutableStateOf(0) }


        BottomNavigation(elevation = 1.dp, backgroundColor = Color(0xFF410002 )) {
            BottomNavigationItem(icon = {
                Icon(imageVector = Icons.Default.Home, "")
            },
                label = { androidx.compose.material.Text(text = "Home", color = Color.Black) },
                selected = navController.currentDestination?.route == ROUTE_MIT,
                onClick = {
                  navController.navigate(ROUTE_MIT)
                })
            BottomNavigationItem(icon = {
                Icon(imageVector = Icons.Default.Favorite, "")
            },
                label = { androidx.compose.material.Text(text = "Lands display", color = Color.Black) },
                selected = navController.currentDestination?.route == ROUTE_MIT,
                onClick = {
                    navController.navigate(ROUTE_SHOP)
                })
            BottomNavigationItem(icon = {
                Icon(imageVector = Icons.Default.Person, "")
            },
                label = { androidx.compose.material.Text(text = "Contact", color = Color.Black) },
                selected = navController.currentDestination?.route == ROUTE_MIT,
                onClick = {
                    navController.navigate(ROUTE_CONTACT)
                })

            BottomNavigationItem(icon = {
                Icon(imageVector = Icons.Default.AccountCircle, "")
            },
                label = { androidx.compose.material.Text(text = "Book now", color = Color.Black) },
                selected = navController.currentDestination?.route == ROUTE_MIT,
                onClick = {
                    navController.navigate(ROUTE_ADD_STUDENTS)
                })
        }
    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    MitScreen(rememberNavController())
}

