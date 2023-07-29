package com.example.composepracticle

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(heightDp = 500)
@Composable
fun PreviewFunctions(){

    LazyColumn(content = {
        items(getCategoeryList()){
           item ->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    })

    /*Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategoeryList().map {item ->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    }*/
}


@Composable
fun BlogCategory(img :Int , title : String , subtitle : String) {
    Card(
        elevation = 10.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "prof",
                modifier = Modifier
                    .padding(5.dp)
                    .size(48.dp)
                    .weight(.2f)
            )

            ItemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.h6
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp,
            style = MaterialTheme.typography.subtitle1
        )
    }
}


data class Category(val img : Int, val title : String , val subtitle: String)


fun getCategoeryList() : MutableList<Category>{

    val list = mutableListOf<Category>()

    list.add(Category(R.drawable.prof , "Sandeep", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandy", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandee", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandip", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sundeep", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandeepa", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandeepan", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sundip", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandyp", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandeeep", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandeep", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandy", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandee", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandip", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sundeep", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandeepa", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandeepan", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sundip", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandyp", "Android Developer"))
    list.add(Category(R.drawable.prof , "Sandeeep", "Android Developer"))


    return list
}