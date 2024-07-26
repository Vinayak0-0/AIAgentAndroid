package com.example.aiagentandroidlib

data class Pointt(val x: Double, val y : Double)

fun Pointt.add(pointt: Pointt) : Double{
    return pointt.x + pointt.y
}