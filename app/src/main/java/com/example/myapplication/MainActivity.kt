package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SearchBar()
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Row {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Text(
            text = "Such-Wow!",
            modifier = modifier
        )
        Text(
            text = "many column",
            modifier = modifier
        )
    }
}

//declarative畫面設計component,建立搜尋方塊
@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    Column {
        TextField(
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text = "Search")
            },
            leadingIcon = {
                Icon(Icons.Default.Search, "")
            },
            modifier = modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyPreview() {
    MyApplicationTheme {
//        Greeting("Android")
        SearchBar()
    }
}