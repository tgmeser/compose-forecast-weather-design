package com.babyapps.weatherforecastui

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.babyapps.weatherforecastui.ui.theme.WeatherForecastUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        setContent {
            WeatherForecastUITheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    WeatherForecastScreen()
                }
            }
        }
    }
}

@Composable
fun WeatherForecastScreen() {
    val pathEffect = PathEffect.dashPathEffect(floatArrayOf(20f, 20f), 0f)
    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = "Background Image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_baseline_notes_24),
                contentDescription = "Menu",
                modifier = Modifier.size(25.dp)
            )

            Text(
                text = "Daily Weather Forecast",
                color = Color.White,
                fontSize = 20.sp,
                style = TextStyle(fontFamily = FontFamily.Monospace)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_baseline_add_location_24),
                contentDescription = "Location",
                modifier = Modifier.size(25.dp)
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Sankt-Peterburg",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontFamily = FontFamily.Monospace
            )
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Friday, the 23rd of November  2021",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            style = TextStyle(
                fontFamily = FontFamily.Monospace
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "-10°C,14.0°F",
            color = Color.White,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontFamily = FontFamily.Monospace
            )
        )

        Canvas(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(1.dp)
        ) {
            drawLine(
                color = Color.White,
                start = Offset(0f, 0f),
                end = Offset(size.width, 0f),
                pathEffect = pathEffect,
                strokeWidth = 10f
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Snowy",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontFamily = FontFamily.Monospace
            )
        )

        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "-7°C,19.4°F",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontFamily = FontFamily.Monospace
            )
        )

        Spacer(modifier = Modifier.height(25.dp))
        Text(
            text = stringResource(id = R.string.weather),
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
            )
        )

        Spacer(modifier = Modifier.height(100.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(60.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_cloud_24),
                    contentDescription = "Today",
                    modifier = Modifier.size(50.dp)
                )

                Spacer(modifier = Modifier.height(25.dp))

                Text(
                    text = "-10°",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                    )
                )

                Text(
                    text = "Today",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                    )
                )

            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_cloud_sync_24),
                    contentDescription = "Today",
                    modifier = Modifier.size(50.dp)
                )

                Spacer(modifier = Modifier.height(25.dp))

                Text(
                    text = "-13°C",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                    )
                )

                Text(
                    text = "Saturday",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                    )
                )

            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_cloud_circle_24),
                    contentDescription = "Today",
                    modifier = Modifier.size(50.dp)
                )

                Spacer(modifier = Modifier.height(25.dp))

                Text(
                    text = "-10°C",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                    )
                )

                Text(
                    text = "Sunday",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                    )
                )

            }
        }

    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                .width(80.dp)
                .height(20.dp)
                .background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_keyboard_arrow_up_24),
                contentDescription = "Up Arrow",
                modifier = Modifier.size(20.dp), contentScale = ContentScale.Crop
            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherForecastUITheme {
        WeatherForecastScreen()
    }
}