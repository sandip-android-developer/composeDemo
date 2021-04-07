package com.example.composedemo

import android.graphics.Paint
import android.os.Bundle
import android.text.Layout
import android.widget.ImageView
import android.widget.StackView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class LoginActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginUI()
        }
    }

}
@Composable
fun  SetLoginUI()
{
    Column(
       modifier = Modifier
           .fillMaxHeight()
           .fillMaxWidth()
           .padding(start = 30.dp, end = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CustomImage()
        Spacer(modifier = Modifier.height(30.dp))
        CustomEditTextField()
        Spacer(modifier = Modifier.height(10.dp))
        CustomEditTextField()
        Spacer(modifier = Modifier.height(30.dp))
        CustomButton()
        Text(text = "hdjhjghjhsd")
    }

}
@Composable
fun CustomEditTextField() {

    val inputValue= remember {
        mutableStateOf(TextFieldValue())
    }
    Column(  modifier = Modifier
        .fillMaxWidth()
        .height(50.dp)
        .background(
            color = Color(0xffb9b9b9),
            shape = CircleShape
        ).padding(start = 20.dp,end = 20.dp),
        verticalArrangement = Arrangement.Center
    ) {
        BasicTextField(
            value = inputValue.value,
            onValueChange = {inputValue.value=it},
            textStyle = TextStyle(textAlign = TextAlign.Center,fontSize = 20.sp),
            singleLine = true

        )
    }


}
@Composable
fun CustomButton(){
    TextButton(onClick = { /*TODO*/ },
        modifier = Modifier
            .background(
                color = Color.Blue,
                shape = CircleShape
            )
            .fillMaxWidth(0.5f).height(50.dp)
    ) {
        Text(text = "Login", textAlign = TextAlign.Center,color = Color.White)
    }
}
@Composable
fun CustomImage(){
    Image(painter = painterResource(id = R.drawable.header), contentDescription = null,
    modifier = Modifier.fillMaxWidth().height(150.dp).clip(shape = RoundedCornerShape(10.dp)))

}

@Preview
@Composable
fun LoginUI()
{ SetLoginUI()
}