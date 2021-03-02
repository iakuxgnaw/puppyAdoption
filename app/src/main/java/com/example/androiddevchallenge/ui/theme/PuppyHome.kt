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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppy

@Composable
fun Puppies(puppies: List<Puppy>, onPuppyItemClick: (Puppy) -> Unit = {}) {

    LazyColumn(
        modifier = Modifier.background(whiteF5),
        contentPadding = PaddingValues(6.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(puppies) { puppy ->
            PuppyItem(
                puppy,
                Modifier
                    .clickable { onPuppyItemClick(puppy) }
                    .fillMaxWidth(),
            )
        }
    }
}

@Composable
fun PuppyItem(puppy: Puppy, modifier: Modifier = Modifier) {
    Card(modifier.clip(RoundedCornerShape(2.dp))) {
        Row() {
            Image(
                painterResource(id = puppy.picRes),
                "Item for the puppy ${puppy.name}",
                Modifier.size(130.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(8.dp)) {
                Text(text = puppy.name, style = MaterialTheme.typography.h5)
                Text(
                    text = puppy.breed,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(top = 13.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 17.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.location),
                        contentDescription = "location icon",
                        modifier = Modifier.size(27.dp)
                    )
                    Text(text = puppy.location)
                }
            }
        }
    }
}

@Preview
@Composable
fun PuppyListPreview() {
    val puppies = listOf(
        Puppy(R.drawable.puppy_cassie, "Cassie", "xxx", "location", "about me", "Adopt me"),
        Puppy(R.drawable.puppy_mia, "Ivy", "xxx", "location", "about me", "Adopt me"),
        Puppy(R.drawable.puppy_tucker, "Kingston", "xxx", "location", "about me", "Adopt me"),
        Puppy(R.drawable.puppy_tucker, "Kingston", "xxx", "location", "about me", "Adopt me"),
        Puppy(R.drawable.puppy_tucker, "Kingston", "xxx", "location", "about me", "Adopt me"),
        Puppy(R.drawable.puppy_tucker, "Kingston", "xxx", "location", "about me", "Adopt me"),
        Puppy(R.drawable.puppy_tucker, "Kingston", "xxx", "location", "about me", "Adopt me"),
        Puppy(R.drawable.puppy_tucker, "Kingston", "xxx", "location", "about me", "Adopt me"),
        Puppy(R.drawable.puppy_tucker, "Kingston", "xxx", "location", "about me", "Adopt me"),
    )
    MyTheme {
        Puppies(puppies)
    }
}
