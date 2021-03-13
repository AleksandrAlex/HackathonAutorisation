package ru.suslovalex.hackathonautorisation.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ru.suslovalex.hackathonautorisation.R

class StartFragment: Fragment(R.layout.fragment_start) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnCreateAccount: Button = view.findViewById(R.id.btnCreateAccount)
        btnCreateAccount.setOnClickListener {
            it.findNavController().navigate(R.id.action_startFragment_to_accountCreateFragment)
        }

        val btnConfirmAccount: Button = view.findViewById(R.id.btnConfirmAccount)
        btnConfirmAccount.setOnClickListener {
            it.findNavController().navigate(R.id.action_startFragment_to_confirmAccountFragment)
        }

    }
}