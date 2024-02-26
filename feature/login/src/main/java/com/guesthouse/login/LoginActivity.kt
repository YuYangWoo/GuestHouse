package com.guesthouse.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.guesthouse.designsystem.icon.GuestHouseIcons
import com.guesthouse.designsystem.theme.GuestHouseTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GuestHouseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        LoginLogo()
        Spacer(modifier = Modifier.height(83.dp))
        LoginIcon()
    }

    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BusinessSignUp()
        Spacer(modifier = Modifier.height(65.dp))
    }

}

@Composable
fun LoginLogo() {
    Image(
        modifier = Modifier.size(100.dp),
        painter = painterResource(id = GuestHouseIcons.socialLoginKakao),
        contentDescription = stringResource(R.string.logo_image)
    )
}

@Composable
fun BusinessSignUp() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            stringResource(R.string.business_sign_up_text),
            style = TextStyle(
                fontSize = TextUnit(14f, type = TextUnitType.Sp),
                fontWeight = FontWeight(700),
                letterSpacing = TextUnit(-0.03f, type = TextUnitType.Em)
            ),
            lineHeight = TextUnit(17f, type = TextUnitType.Sp),
            textAlign = TextAlign.Right
        )
        Image(
            modifier = Modifier.size(16.dp),
            painter = painterResource(id = GuestHouseIcons.forward),
            contentDescription = stringResource(R.string.business_sign_up_button)
        )
    }
}

@Composable
fun LoginIcon() {
    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = {}, modifier = Modifier.size(54.dp)) {
            Image(
                painter = painterResource(id = GuestHouseIcons.socialLoginKakao),
                contentDescription = stringResource(R.string.naver_social_login_button)
            )
        }
        Spacer(modifier = Modifier.width(24.dp))
        IconButton(onClick = {}, modifier = Modifier.size(54.dp)) {
            Image(
                painter = painterResource(id = GuestHouseIcons.socialLoginKakao),
                contentDescription = stringResource(R.string.kakao_social_login_button)
            )
        }
        Spacer(modifier = Modifier.width(24.dp))
        IconButton(onClick = {}, modifier = Modifier.size(54.dp)) {
            Image(
                painter = painterResource(id = GuestHouseIcons.socialLoginKakao),
                contentDescription = stringResource(R.string.google_social_login_button)
            )
        }
        Spacer(modifier = Modifier.width(24.dp))
        IconButton(onClick = {}, modifier = Modifier.size(54.dp)) {
            Image(
                painter = painterResource(id = GuestHouseIcons.socialLoginKakao),
                contentDescription = stringResource(R.string.email_login_button)
            )
        }
    }
}

@Preview(showBackground = true, apiLevel = 33)
@Composable
fun GreetingPreview() {
    GuestHouseTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            LoginScreen()
        }
    }
}