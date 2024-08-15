package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GuessViewModel : ViewModel() {
    var secret = (1..10).random()
    val secretData = MutableLiveData<Int>()
    val counter = MutableLiveData<Int>()
    val status = MutableLiveData<GameStatus>()

    //物件生成時自動生成init內的東西
    init {
        counter.value = 0
        status.value = GameStatus.INIT
        secretData.value = secret
    }

    fun guess(num: Int) {
        status.value = when (num - secret) {
            in 1..Int.MAX_VALUE -> GameStatus.SMALLER
            0 -> GameStatus.BINGO
            else -> GameStatus.BIGGER
        }

        var c = counter.value ?: 0
        c++
        counter.value = c
    }

    fun reset() {
        secret = (1..10).random()
        counter.value = 0
        status.value = GameStatus.INIT
    }
}

enum class GameStatus {
    INIT, BIGGER, SMALLER, BINGO
}