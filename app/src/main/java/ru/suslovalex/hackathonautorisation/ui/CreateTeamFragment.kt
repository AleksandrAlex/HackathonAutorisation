package ru.suslovalex.hackathonautorisation.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ru.suslovalex.hackathonautorisation.R


class CreateTeamFragment : Fragment(R.layout.fragment_create_team) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnAddTeam: Button = view.findViewById(R.id.btnAddTeam)
        btnAddTeam.setOnClickListener {

            // add new team in database and recyclerview
            it.findNavController().navigate(R.id.action_createCommandFragment_to_listAllTeamsFragment)
        }
    }



}