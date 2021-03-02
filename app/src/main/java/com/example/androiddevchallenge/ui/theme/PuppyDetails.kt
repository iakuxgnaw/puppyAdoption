/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppy

@Composable
fun PuppyDetails(puppy: Puppy, adopt: (Puppy) -> Unit = {}) {
    LazyColumn {
        item {
            PuppyDetailsView(puppy, adopt)
        }
    }
}

@Composable
fun PuppyDetailsView(puppy: Puppy, adopt: (Puppy) -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(whiteF5)
    ) {
        Image(
            painter = painterResource(id = puppy.picRes),
            contentDescription = "puppy image",
            modifier = Modifier
                .aspectRatio(1f)
                .padding(4.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop,
        )

        Column(Modifier.padding(8.dp, 4.dp)) {
            Text(text = puppy.name, style = MaterialTheme.typography.h3)
            Text(text = puppy.breed, style = MaterialTheme.typography.body2, modifier = Modifier.padding(top = 6.dp))
            Text(text = puppy.aboutInfo, style = MaterialTheme.typography.body2, modifier = Modifier.padding(top = 6.dp))
            Text(text = "Meet ${puppy.name}", style = MaterialTheme.typography.h5, modifier = Modifier.padding(top = 8.dp))
            Text(text = puppy.description, style = MaterialTheme.typography.body1, modifier = Modifier.padding(top = 6.dp))
        }
        Button(
            onClick = { adopt(puppy) },
            modifier = Modifier
                .padding(horizontal = 4.dp, vertical = 8.dp)
                .clip(RoundedCornerShape(4.dp)).fillMaxSize(),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = blueD2
            )
        ) {
            Text(text = "Adopt me", color = androidx.compose.ui.graphics.Color.White)
        }
    }
}

@Preview
@Composable
fun PuppyDetailsPreview() {
    PuppyDetails(puppy = Puppy(R.drawable.puppy_cassie, "Cassie", "xxx", "location", "about me", "Adopt me"))
}
