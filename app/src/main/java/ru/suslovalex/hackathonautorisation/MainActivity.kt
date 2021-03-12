package ru.suslovalex.hackathonautorisation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.suslovalex.hackathonautorisation.ui.AccountCreateFragment
import ru.suslovalex.hackathonautorisation.ui.ProfileFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.container_layout, AccountCreateFragment()).commit()
    }
}