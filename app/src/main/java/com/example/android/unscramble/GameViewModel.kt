package com.example.android.unscramble

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.android.unscramble.ui.game.allWordsList

/**
 * Created by Clarence E Moore on 2022-11-16.
 *
 * Description:
 *
 *
 */
class GameViewModel : ViewModel() {

    private fun getNextWord() {
        currentWord = allWordsList.random()
    }

    init {
        Log.d("GameFragment", "GameViewModel created!")
    }

    private var score = 0
    private var currentWordCount = 0

    private var wordsList: MutableList<String> = mutableListOf()
    private lateinit var currentWord: String

    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord

    // Declare private mutable variable that can only be modified
    // within the class it is declared.
    private var _count = 0

    // Declare another public immutable field and override its getter method.
    // Return the private property's value in the getter method.
    // When count is accessed, the get() function is called and
    // the value of _count is returned.
    val count: Int
        get() = _count

    override fun onCleared() {
        super.onCleared()
        Log.d("GameFragment", "GameViewModel Destroyed!")
    }


}
