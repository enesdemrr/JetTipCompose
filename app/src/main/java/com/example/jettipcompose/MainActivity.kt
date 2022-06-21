package com.example.jettipcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jettipcompose.ui.theme.JetTipComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetTipComposeTheme {
                MyApp {
                    TopHeader()
                }
            }
        }
    }
}
@Composable
fun MyApp(content: @Composable () -> Unit){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
    }
}

@Preview
@Composable
fun TopHeader(totalPerPerson: Int = 142){
    Surface(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp)
        .clip(shape = CircleShape.copy(all = CornerSize(12.dp))),
        color = Color(0xFFE9D7F7)
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val total = "%.2f".format(totalPerPerson)
            Text(text = "Total Per Person",
                style = MaterialTheme.typography.h5
            )
            Text(text = "$$total",
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.ExtraBold
            )

        }

    }
}
@Preview
@Composable
fun MainContent() {
    Surface(
        modifier = Modifier
            .padding(2.dp)
            .fillMaxWidth(),
                shape = RoundedCornerShape(corner = CornerSize(8.dp)),
                border = BorderStroke(width = 1.dp, color = androidx.compose.ui.graphics.Color.LightGray)){
        Column() {
            Text("Hello again...")
            Text("Hello again...")
            Text("Hello again...")

        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetTipComposeTheme {
        Text(text = "Hello Again")
    }
}