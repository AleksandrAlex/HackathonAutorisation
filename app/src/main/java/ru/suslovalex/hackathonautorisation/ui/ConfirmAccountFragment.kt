package ru.suslovalex.hackathonautorisation.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ru.suslovalex.hackathonautorisation.R

class ConfirmAccountFragment: Fragment(R.layout.fragment_confirm_account) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnConfirmAccount: Button = view.findViewById(R.id.btnOk)
        btnConfirmAccount.setOnClickListener {
            it.findNavController().navigate(R.id.action_confirmAccountFragment_to_listAllTeamsFragment)
        }
    }
}