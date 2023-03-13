package com.example.jetpack_preview_page

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_preview_page.ui.theme.Jetpack_preview_pageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_preview_pageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ImageLayout(
                        s1 = stringResource(R.string.s1) ,
                        s2 = stringResource(R.string.s2) ,
                        s3 = stringResource(R.string.s3)
                    )
                }
            }
        }
    }
}

@Composable
fun ImageLayout(s1 : String , s2 : String , s3 : String){
    Column{
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "" ,
            modifier = Modifier
                .fillMaxWidth()
        )
        TextLayout(s1 = s1 , s2 = s2 , s3 = s3)
    }
}

@Composable
fun TextLayout(s1 : String , s2 : String , s3 : String) {
    Column {
        Text(
            text = s1,
            fontSize=24.sp,
            modifier = Modifier
                .padding(start = 16.dp , end = 16.dp , top = 16.dp , bottom = 16.dp)
        )
        Text(
            text = s2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp , end = 16.dp)
        )
        Text(
            text = s3,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp , end = 16.dp , top = 16.dp , bottom = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jetpack_preview_pageTheme {
        ImageLayout(
            s1 = stringResource(R.string.s1) ,
            s2 = stringResource(R.string.s2) ,
            s3 = stringResource(R.string.s3)
        )
    }
}