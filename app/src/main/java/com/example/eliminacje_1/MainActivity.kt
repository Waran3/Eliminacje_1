package com.example.eliminacje_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eliminacje_1.ui.theme.Eliminacje_1Theme
import kotlin.math.roundToInt


private val zawodnik_1 = mutableStateOf(0)
private val zawodnik_2 = mutableStateOf(0)
private val zawodnik_3 = mutableStateOf(0)
private val zawodnik_4 = mutableStateOf(0)



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Eliminacje_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {


                    Column(
                        //modifier = Modifier.fillMaxHeight(22f)
                        // modifier = Modifier.fillMaxSize(1f)
                        modifier = Modifier
                            .padding(horizontal = 12.dp, vertical = 12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {

                        Slidery_gorne()
                        Slidery_dolne()
                        //MainContent_3()

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {


                            Text(
                                text = "sędzia MAREK SKONIECZNY",
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle(1),
                                style = MaterialTheme.typography.h4,
                            )
                        }

                        Text(
                            text = " zawodnik 1 = ${zawodnik_1.value}",
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle(1),
                            style = MaterialTheme.typography.h5,
                        )
                        Text(
                            text = " zawodnik 2 = ${zawodnik_2.value}",
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle(1),
                            style = MaterialTheme.typography.h5,
                        )
                        Text(
                            text = " zawodnik 3 = ${zawodnik_3.value}",
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle(1),
                            style = MaterialTheme.typography.h5,
                        )
                        Text(
                            text = " zawodnik 4 = ${zawodnik_4.value}",
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle(1),
                            style = MaterialTheme.typography.h5,
                        )
                        Przycisk_zapisz()
                    }

                }
            }
        }
    }
}


@Composable
fun Slidery_gorne()  {
    var sliderPosition_1 by remember { mutableStateOf(0F) }
    var sliderPosition_2 by remember { mutableStateOf(0F) }
    var sliderPosition_3 by remember { mutableStateOf(0F) }

    var sliderPosition_4 by remember { mutableStateOf(0F) }
    var sliderPosition_5 by remember { mutableStateOf(0F) }
    var sliderPosition_6 by remember { mutableStateOf(0F) }

    var wynik_1 = (sliderPosition_1 * 33).roundToInt()
    var wynik_2 = (sliderPosition_2 * 33).roundToInt()
    var wynik_3 = (sliderPosition_3 * 33).roundToInt()
    var suma_2 = wynik_1 + wynik_2 + wynik_3

    var wynik_4 = (sliderPosition_4 * 33).roundToInt()
    var wynik_5 = (sliderPosition_5 * 33).roundToInt()
    var wynik_6 = (sliderPosition_6 * 33).roundToInt()
    var suma_3 = wynik_4 + wynik_5 + wynik_6

    zawodnik_2.value = suma_2
    zawodnik_3.value = suma_3

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(6.dp),
//verticalAlignment = Alignment.CenterVertically,
//horizontalArrangement = Arrangement.Center


    ) {
        Box(                // pole lewe górne
            Modifier
                .background(Color.Red)
                //.fillMaxSize(0.3F)
                .padding(0.dp)
                .background(Color.White)
                .fillMaxWidth(0.49F)
                .fillMaxHeight(0.3F)

        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(
                    text = " MIND: ${(sliderPosition_1 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_1,
                    onValueChange = { sliderPosition_1 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " BODY: ${(sliderPosition_2 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_2,
                    onValueChange = { sliderPosition_2 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " SOUL: ${(sliderPosition_3 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_3,
                    onValueChange = { sliderPosition_3 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " ZAWODNIK 2   Wynik = $suma_2",
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle(1),
                    style = MaterialTheme.typography.h5,


                    )


            }
        }

        Box(
            Modifier                        // pole prawe górne
                .background(Color.Yellow)
                .padding(0.dp)
                .background(Color.LightGray)
                .fillMaxWidth(1F)
                .fillMaxHeight(0.3F)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(
                    text = " MIND: ${(sliderPosition_4 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_4,
                    onValueChange = { sliderPosition_4 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " MIND: ${(sliderPosition_5 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_5,
                    onValueChange = { sliderPosition_5 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " MIND: ${(sliderPosition_6 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_6,
                    onValueChange = { sliderPosition_6 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Red,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " ZAWODNIK 3   Wynik = $suma_3",
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle(1),
                    style = MaterialTheme.typography.h5,


                    )
            }
        }
    }
    //return zawodnik_2
    //return zawodnik_3
}


@Composable
fun Slidery_dolne() {
    var sliderPosition_1 by remember { mutableStateOf(0F) }
    var sliderPosition_2 by remember { mutableStateOf(0F) }
    var sliderPosition_3 by remember { mutableStateOf(0F) }

    var sliderPosition_4 by remember { mutableStateOf(0F) }
    var sliderPosition_5 by remember { mutableStateOf(0F) }
    var sliderPosition_6 by remember { mutableStateOf(0F) }

    var wynik_1 = (sliderPosition_1 * 33).roundToInt()
    var wynik_2 = (sliderPosition_2 * 33).roundToInt()
    var wynik_3 = (sliderPosition_3 * 33).roundToInt()
    var suma_1 = wynik_1 + wynik_2 + wynik_3

    var wynik_4 = (sliderPosition_4 * 33).roundToInt()
    var wynik_5 = (sliderPosition_5 * 33).roundToInt()
    var wynik_6 = (sliderPosition_6 * 33).roundToInt()
    var suma_4 = wynik_4 + wynik_5 + wynik_6

    zawodnik_1.value = suma_1
    zawodnik_4.value = suma_4

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(6.dp),
//verticalAlignment = Alignment.CenterVertically,
//horizontalArrangement = Arrangement.Center


    ) {
        Box(                // pole lewe dolne
            Modifier
                .background(Color.Red)
                //.fillMaxSize(0.3F)
                .padding(0.dp)
                .background(Color.LightGray)
                .fillMaxWidth(0.49F)
                .fillMaxHeight(0.45F)

        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(
                    text = " MIND: ${(sliderPosition_1 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_1,
                    onValueChange = { sliderPosition_1 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " BODY: ${(sliderPosition_2 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_2,
                    onValueChange = { sliderPosition_2 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " SOUL: ${(sliderPosition_3 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_3,
                    onValueChange = { sliderPosition_3 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " ZAWODNIK 1   Wynik = $suma_1",
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle(1),
                    style = MaterialTheme.typography.h5,
                )

            }
        }

        Box(
            Modifier                        // pole prawe dolne
                .background(Color.Yellow)
                .padding(0.dp)
                .background(Color.White)
                .fillMaxWidth(1F)
                .fillMaxHeight(0.45F)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(
                    text = " MIND: ${(sliderPosition_4 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_4,
                    onValueChange = { sliderPosition_4 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " MIND: ${(sliderPosition_5 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_5,
                    onValueChange = { sliderPosition_5 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " MIND: ${(sliderPosition_6 * 33).roundToInt()}",
                    fontWeight = FontWeight.Bold
                )
                Slider(
                    value = sliderPosition_6,
                    onValueChange = { sliderPosition_6 = it },
                    enabled = true,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Red,
                        activeTickColor = Color.Black,
                        inactiveTickColor = Color.Gray
                    )
                )
                Text(
                    text = " ZAWODNIK 4   Wynik = $suma_4",
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle(1),
                    style = MaterialTheme.typography.h5,


                    )
            }
        }
    }

    //return zawodnik_1
    //return zawodnik_4
}

@Composable
fun Przycisk_zapisz() {
    val counter = remember { mutableStateOf(0) }

    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = "Pojedynek numer: ${counter.value}",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h4,
        )
        Button(onClick = {
            counter.value++
        }) {
            Text(text = "ZAPISZ")
            var numer_pojedynku = 1



        }
    }
}
