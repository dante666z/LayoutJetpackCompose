package dev.zurielzarate.layoutketpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.zurielzarate.layoutketpackcompose.layouts.ScaffoldLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            SaludoColumn()
//            SaludoRow()
//            BoxLayout()
            ScaffoldLayout()
        }
    }
}

