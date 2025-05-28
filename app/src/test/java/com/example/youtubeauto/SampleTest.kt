package com.example.youtubeauto

import org.junit.Assert.assertTrue
import org.junit.Test

class SampleTest {
    @Test
    fun testLoginAlwaysTrue() {
        assertTrue(LoginManager.isLoggedIn())
    }
}
