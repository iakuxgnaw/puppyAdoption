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
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Puppy

class MainViewModel : ViewModel() {

    val puppies by mutableStateOf(
        listOf(
            Puppy(R.drawable.puppy_cassie, "Cassie", "Cattle Dog", "San Jose, CA", "Adult  Female  Medium  Merle (Red)", "Cassie is a 1 1/2 year old female cattledog. She is fine with other dogs and unknown how she is with cats. She is housetrained and crate trained. She loves to play with balls."),
            Puppy(R.drawable.puppy_finn, "Finn", "Australian Cattle Dog / Blue Heeler", "San Jose, CA", "Adult · Male · Medium · Merle (Blue)", "Meet Finn He is a 3 yr old male Australian Cattle Dog."),
            Puppy(R.drawable.puppy_ivy, "Ivy", "Chihuahua & Terrier Mix", "Santa Clara, CA", "Senior · Female · Medium", "Ivy is a sweet senior gal. She is a love bug and loves being by the people in her current foster family. She loves burrowing under blankets and being near or on someone when cuddling on the couch."),
            Puppy(R.drawable.puppy_kingston, "Kingston", "German Shepherd Dog", "Santa Clara, CA", "Adult · Male · Large", "Hello there, I'm Kingston, a handsome big fellow who's blossoming like a flower and ready for a fresh start. I'm ready to find my new forever home where I can rest my paws and bond with my loved ones. I enjoy petting and playing with toys"),
            Puppy(R.drawable.puppy_mia, "Mia", "Pit Bull Terrier ", "Santa Clara, CA", "Young · Female · Medium", "Hi there, my name is Mia - wow, the world is quite big out there! I am very excited about discovering all the world has to offer and finding my forever family! I am quite happy with simply being given affection and love, but let's not forget about some fun toys too!"),
            Puppy(R.drawable.puppy_mikey, "Misty", "Chihuahua", "San Jose, CA", "Senior · Female · Small · Bicolor", "Meet Misty, a loving 8-year-old female Chihuahua. She weighs 7 1/2 lbs. and was just spayed, vaccinated, and microchipped! Misty was a stray, so we don’t have any history of her. Misty would love to have a small male canine companion."),
            Puppy(R.drawable.puppy_misty, "Mikey", "Chihuahua & Rat Terrier Mix ", "Santa Clara, CA", "Young · Male · Medium", "Meet Mikey. Our foster home has really helped this sweet boy come out of his shell. He still appreciates when you go slow at first. Mikey is good with dogs of all sizes. He is still working on his housebreaking. Mikey is 2 years old and 7.5 pounds."),
            Puppy(R.drawable.puppy_sia, "Sia", "Pit Bull Terrier ", "Santa Clara, CA", "Young · Female · Medium", "Hi, I'm Sia! I am a young gal with a lot of energy and would thrive in a very active household! Want to go for a hike? I'm in! Heading to the beach? Let's go! "),
            Puppy(R.drawable.puppy_tessie, "Tessie", "Pit Bull Terrier Mix ", "Santa Clara, CA", "Adult · Female · Large", "Hey hey hey, Tessie here! I'm a very spirited and friendly kinda girl! I have a lot of energy and would love to go for runs, hikes, and many other adventures so a very active household would be best for me."),
            Puppy(R.drawable.puppy_tucker, "Tucker", "Cattle Dog", "San Jose, CA", "Adult · Male · Medium · Merle (Blue)", "Tucker is a gorgeous, sweet, and delightful 2 year old male Cattledog, who is looking for a family to call his own. Tucker came into the shelter as a stray and can be scared of new people but he loves being around other dogs."),
        )
    )

    var currentPuppy: Puppy? by mutableStateOf(null)

    fun showPuppy(puppy: Puppy) {
        currentPuppy = puppy
    }

    fun hidePuppy() {
        currentPuppy = null
    }
}
