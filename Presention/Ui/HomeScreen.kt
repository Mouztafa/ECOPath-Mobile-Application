package com.example.mynasa.Presention.Ui

import android.graphics.ColorSpace
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.mynasa.R
import com.example.mynasa.data.model.catgres
import com.example.mynasa.ui.theme.MyNasaTheme
import kotlin.random.Random

class HomeScreen :Screen {
    @Composable
    override fun Content() {
        MyNasaTheme {
            HomeScreenContent()


        }
    }


    @Composable
    fun HomeScreenContent() {

        val navigator = LocalNavigator.currentOrThrow
        val catgres = listOf(
            catgres(
                1,
                "No Povery",
                "Goal 1 , End in Provery in all its forms evrywhere ",
                R.drawable.nopovery1
            ),
            catgres(
                2,
                "End hunger,",
                "  achieve food security and improved nutrition and promote sustainable agriculture.  ",
                R.drawable.zeroenergy2
            ),
            catgres(
                3,
                "Good health",
                "Ensure healthy lives and promote well-being for all at all ages. ",
                R.drawable.picthure3
            ),
            catgres(
                4,
                "Quality education",
                "Ensure inclusive and equitable quality education and promote lifelong learning opportunities for all.",
                R.drawable.picthure4
            ),
            catgres(
                5,
                "GENDER EQUALITY",
                "Achieve gender equality and empower all women and girls. ",
                R.drawable.image5
            ),
            catgres(
                6,
                "Clean water",
                "Achieve gender equality and empower all women and girls.",
                R.drawable.image6
            ),
            catgres(
                7,
                "Affordable And Clean Energy",
                "Ensure access to affordable, reliable, sustainable and modern energy for all.",
                R.drawable.image7
            ),
            catgres(
                8,
                "Decent work",
                "Promote sustained, inclusive and sustainable economic growth, full and productive employment and decent work for all. ",
                R.drawable.image8
            ),
            catgres(
                9,
                "Industry, Innovation, Infrastructur",
                "Build resilient infrastructure, promote inclusive and sustainable industrialization and foster innovation. ",
                R.drawable.image9
            ),
            catgres(
                10,
                "Reduce Inequality",
                "Reduce inequality within and among countries. ",
                R.drawable.image10
            ),
            catgres(
                11,
                "Sustantainable cities",
                "Make cities and human settlements inclusive, safe, resilient and sustainable. ",
                R.drawable.image11
            ),
            catgres(
                12,
                "Climate Action",
                "Take urgent action to combat climate change and its impacts. ",
                R.drawable.image12
            ),
            catgres(
                13,
                "Life Below Water",
                "Conserve and sustainably use the oceans, seas and marine resources for sustainable development. ",
                R.drawable.image13
            ),
            catgres(
                14,
                "Life On Land",
                "Conserve and sustainably use the oceans, seas and marine resources for sustainable development. ",
                R.drawable.image14
            ),
            catgres(
                15,
                "Peace and justice",
                "Promote peaceful and inclusive societies for sustainable development, provide access to justice for all and build effective, accountable and inclusive institutions at all levels. ",
                R.drawable.image15
            ),
            catgres(
                16,
                "Partnership for the goals  ",
                "Strengthen the means of implementation and revitalize the Global Partnership for Sustainable Development. ",
                R.drawable.image16
            ),
            catgres(
                17,
                "Responsible Consumption",
                "Ensure sustainable consumption and production patterns. ",
                R.drawable.image17
            ),


            )
        Scaffold(
            floatingActionButton = {
                Column(
                    modifier = Modifier
                        .padding(16.dp) // Adjust padding as needed
                        .fillMaxWidth(),
                   verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.End // Align buttons to the end
                ) {
                    FloatingActionButton(
                        onClick = { /* Handle FAB click */ },
                        containerColor = MaterialTheme.colorScheme.primary,
                        shape = CircleShape
                        // Space between buttons
                    ) {
                        Icon(
                            modifier = Modifier.size(25.dp),
                            imageVector = Icons.Filled.Info,
                            contentDescription = "Info FAB",
                            tint = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    FloatingActionButton(
                        onClick = { navigator.push(QrCode()) },
                        containerColor = MaterialTheme.colorScheme.primary,
                        shape = CircleShape
                    ) {
                       Image(painter = painterResource(id = R.drawable.baseline_qr_code_24), contentDescription = null)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    FloatingActionButton(
                        onClick = {  },
                        containerColor = MaterialTheme.colorScheme.primary,
                        shape = CircleShape
                    ) {
                        Icon(
                            modifier = Modifier.size(40.dp),
                            imageVector = Icons.Filled.Add,
                            contentDescription = "Play FAB",
                            tint = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    FloatingActionButton(
                        onClick = {  },
                        containerColor = MaterialTheme.colorScheme.primary,
                        shape = CircleShape
                    ) {
                       Image(painter = painterResource(id =R.drawable.baseline_auto_awesome_24), contentDescription =null )
                    }
                }
            }

        ) { padding ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),

                ) {
                items(catgres) { catgres ->
                    val randomColor = Color(
                        red = Random.nextFloat(),
                        green = Random.nextFloat(),
                        blue = Random.nextFloat(),
                        colorSpace = ColorSpaces.Srgb,
                        alpha = 1f
                    )
                    Card(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillParentMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = randomColor)
                    ) {
                        Row(modifier = Modifier.padding(16.dp)) {
                            Image(
                                painter = painterResource(id = catgres.image),
                                contentDescription = null, modifier = Modifier.size(100.dp)
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(text = catgres.number.toString(),)
                                Text(text = catgres.name, fontSize = 20.sp, color = Color.White)
                                Text(
                                    text = catgres.decreption,
                                    fontSize = 15.sp,
                                    color = Color.White
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Button(onClick = { navigator.push(NoProvery()) }) {
                                    Text(text = "More info")

                                }

                            }
                        }
                    }
                }
            }
        }
    }
}
