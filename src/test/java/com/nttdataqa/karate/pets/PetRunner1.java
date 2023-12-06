package com.nttdataqa.karate.pets;


import com.intuit.karate.junit5.Karate;

class PetRunner1 {

    @Karate.Test
    Karate testPets() {
        return Karate.run("users").relativeTo(getClass());
    }



}
