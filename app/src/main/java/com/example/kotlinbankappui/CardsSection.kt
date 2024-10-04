package com.example.kotlinbankappui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinbankappui.data.Cards
import com.example.kotlinbankappui.ui.theme.BlueEnd
import com.example.kotlinbankappui.ui.theme.BlueStart
import com.example.kotlinbankappui.ui.theme.GreenEnd
import com.example.kotlinbankappui.ui.theme.GreenStart
import com.example.kotlinbankappui.ui.theme.OrangeEnd
import com.example.kotlinbankappui.ui.theme.OrangeStart
import com.example.kotlinbankappui.ui.theme.PurpleEnd
import com.example.kotlinbankappui.ui.theme.PurpleStart

val cards = listOf(

    Cards(
        cardType = "VISA",
        cardNumber = "3664 7865 3785 9632",
        cardName = "Business",
        balance = 45.32,
        color = getGradient(PurpleStart, PurpleEnd),
    ),

    Cards(
        cardType = "MASTER CARD",
        cardNumber = "3664 7865 3785 9632",
        cardName = "Savings",
        balance = 45.32,
        color = getGradient(BlueStart, BlueEnd),
    ),

    Cards(
        cardType = "VISA",
        cardNumber = "3664 7865 3785 9632",
        cardName = "School",
        balance = 45.32,
        color = getGradient(OrangeStart, OrangeEnd),
    ),

    Cards(
        cardType = "MASTER",
        cardNumber = "3664 7865 3785 9632",
        cardName = "Trips",
        balance = 45.32,
        color = getGradient(GreenStart, GreenEnd),
    ),
)

fun getGradient(
    startColor: Color,
    endColor: Color,
): Brush {
    return Brush.horizontalGradient(
        colors = listOf(
            startColor, endColor
        )
    )
}

@Preview
@Composable
fun CardsSection(){
    LazyRow {
        items(cards.size) { index ->
            CardItem(index)
        }
    }
}

@Composable
fun CardItem(
    index: Int
){
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp

    if (index == cards.size - 1){
        lastItemPaddingEnd = 16.dp
    }

    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardType == "MASTER CARD") {
        image = painterResource(id = R.drawable.ic_mastercard)
    }

    Box(
        modifier = Modifier
            .padding(start = 16.dp, end = lastItemPaddingEnd)
    ){
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(250.dp)
                .height(160.dp)
                .clickable {  }
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween

        ) {

        }
    }
}