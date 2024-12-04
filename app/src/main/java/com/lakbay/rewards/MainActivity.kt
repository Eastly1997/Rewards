package com.lakbay.rewards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import com.lakbay.rewards.ui.theme.RewardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RewardsTheme {
                Button(onClick ={
                    throw RuntimeException("Test Crash")
                }) {
                    Text(
                        text = "Test Crash!"
                    )
                }
            }
        }
    }
}


