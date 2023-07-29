package com.example.composepracticle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //    Text(text = "Hello Sandeep")
            // TextInput()
            // CircularImage()
            // PreviewFunctions()
           // Recomposition()
            NotificationScreen()

        }
    }
}

@Composable
fun hiSandy(name: String) {
    Text(text = "$name Kushwaha")
}

/*@Preview(showBackground = true , name = "House Name")
@Composable
private fun hiSandy2(name: String = "Sandy"){
    Text(text = "$name Kushwaha")
}*/

//@Preview(showBackground = true, name = "Name", widthDp = 200, heightDp = 200)
@Composable
private fun PreviewFunction() {
    //  hiSandy(name = "Sandeep")

    /*    Text(
            text = "Hi Sandeep",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            fontSize = 28.sp,
            textAlign = TextAlign.Center
        )*/

    /*    Image(
            painter = painterResource(id = R.drawable.hand),
            contentDescription = "Dummy Image",
            colorFilter = ColorFilter.tint(Color.Blue),
            contentScale = ContentScale.Crop
        )*/

    /*    Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White,
                contentColor = Color.Black
            ),
            enabled = false) {


            Text(
                text = "HELLLO",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                fontSize = 28.sp,
                textAlign = TextAlign.Center
            )
            Image(
                painter = painterResource(id = R.drawable.hand),
                contentDescription = "Dummy Image",
                colorFilter = ColorFilter.tint(Color.Blue),
                contentScale = ContentScale.Crop
            )
        }*/

    /* val state = remember{mutableStateOf("")}
     TextField(
         value = state.value,
         onValueChange = {
                       state.value=  it
         },
         label = { Text(text = "Enter Name") },
         placeholder = {}
     )*/


}

@Composable
fun TextInput() {
    val state = remember { mutableStateOf("") }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Enter Name") },
        placeholder = {}
    )
}

//@Preview(showBackground = true, name = "RowColoumnBOX", widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction2() {

    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A", fontSize = 25.sp)
        Text(text = "B", fontSize = 25.sp)
    }

    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "C", fontSize = 25.sp)
        Text(text = "D", fontSize = 25.sp)
    }

    Box(
        contentAlignment = Alignment.Center
    ) {
        Image(painter = painterResource(id = R.drawable.hand), contentDescription = "")
        Image(painter = painterResource(id = R.drawable.oldwalk), contentDescription = "")
    }

}

//@Preview(showBackground = true, name = "ListItem", widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction3() {
    Column() {
        ListViewItem(R.drawable.dummyimage, "Sandeep", "Android Developer")
        ListViewItem(R.drawable.dummyimage, "Sudeep", " Developer")
        ListViewItem(R.drawable.dummyimage, "Sudha", "Web Developer")
        ListViewItem(R.drawable.dummyimage, "Ankit", "Ios Developer")
        ListViewItem(R.drawable.dummyimage, "DeepaK", "Phython Developer")
    }

}

@Composable
private fun ListViewItem(imageId: Int, name: String, profile: String) {

    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = "",
            Modifier.size(30.dp)
        )

        Column() {
            Text(
                text = name,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = profile,
                fontSize = 16.sp,
                fontWeight = FontWeight.Thin
            )
        }
    }

}


//@Preview(showBackground = true, name = "Modifiers", widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction4() {
/// Modify size , display , appearance and behaviour of the composable
    // can be chained and depends order of properties
    /* Text(
         text = "Jetpack Compose",
         color= Color.Red,
         modifier = Modifier
             .size(25.dp)
             .clickable { }
             .padding(20.dp)
             .background(Color.Green)
             .border(5.dp, Color.Black)
             .clip(CircleShape)
             .background(Color.Yellow)

         )*/

    CircularImage()
}

@Composable
private fun CircularImage() {
    Image(
        painter = painterResource(id = R.drawable.hand),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(5.dp, Color.Black),
        contentDescription = ""
    )
}

//@Preview
@Composable
private fun Recomposition() {

    var state = remember { mutableStateOf(0.0) }
    Log.d("RecompositionCheck", "Intial Composition")

    Button(onClick = {
        state.value = Math.random()
    }) {

        Log.d("RecompositionCheck", "Intial and recomposition")
        Text(text = state.value.toString())
    }
}

@Composable
@Preview()
fun NotificationScreen() {
    var count = rememberSaveable{
        mutableStateOf(0)
    }
    Column(
        verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.fillMaxSize(1f)) {
        NotficationCounter(count.value) { count.value++ }
        MessageCenter(count.value)
    }

}

@Composable
fun NotficationCounter(count: Int, increment: () -> Unit) {


    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "yoh have sent $count notifications")
        Button(onClick = {
            increment()
            Log.d("Event", "ButtonClicked")
        }) {
            Text(text = "Send Notification")
        }
    }

}

@Composable
fun MessageCenter(count: Int) {
    Card(
        elevation = 8.dp
    ) {
        Row( Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.noti ),
                    contentDescription = "noti",
                  Modifier.padding(4.dp))

                Text(text = "Message Sent so far - $count")
        }
    }
}


