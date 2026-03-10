package br.com.fiap.recipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.recipes.ui.theme.RecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipesTheme {
            }
        }
    }
}

@Composable
fun InitialScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
    ) {
        Column(
            modifier = Modifier
                .padding(32.dp)
                .fillMaxSize()
                .background(Color.Green)
        ) {
            Image(
                painter = painterResource(R.drawable.cooking),
                contentDescription = "Imagem de uma mulher cozinhando",
                modifier = Modifier
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color.Yellow)
            ) {
                Text(
                    text = "UNLIMITED PREMIUM RECIPES",
                    fontSize = 16.sp,
                    color = Color(0xFF868080),
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Start Cooking",
                    fontSize = 64.sp,
                    lineHeight = 65.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFED1459),
                )
                Row{
                    Button(
                        onClick = {},
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xFFED1459)
                            ),
                        border = BorderStroke(
                            width = 2.dp,
                            color = Color(0xFFFFC107)
                        ),
                        modifier = Modifier
                            .size(width = 130.dp, height = 100.dp)
                    ) {
                        Text(
                            text = "Login",
                            color = Color(0xFFFFFFFF),
                        )
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xFFFFC107)
                            ),
                        border = BorderStroke(
                            width = 2.dp,
                            color = Color(0xFFED1459)
                        ),
                        modifier = Modifier
                            .size(width = 130.dp, height = 100.dp)
                    ) {
                        Text(
                            text = "Sign up",
                            color = Color(0xFFED1459),
                        )
                    }
                }
            }
        }

    }
}

@Composable
@Preview
fun InitialScreenPreview(){
    RecipesTheme{
        InitialScreen()
    }
}