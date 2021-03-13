package ru.suslovalex.hackathonautorisation.ui


import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ru.suslovalex.hackathonautorisation.R

class AccountCreateFragment : Fragment(R.layout.fragment_account_create) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnCreate: Button = view.findViewById(R.id.btnCreate)
        btnCreate.setOnClickListener {
            it.findNavController().navigate(R.id.action_accountCreateFragment_to_listAllTeamsFragment)
        }
    }

}