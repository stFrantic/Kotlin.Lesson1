package com.example.lesson1.src

import com.example.lesson1.classes.Cigarettes

class Catalog<T : Cigarettes>(var catalog : ArrayList<T> = arrayListOf())